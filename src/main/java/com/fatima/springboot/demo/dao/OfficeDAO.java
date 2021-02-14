package com.fatima.springboot.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fatima.springboot.demo.entity.Office;
import com.fatima.springboot.demo.entity.Office;

@Repository
public class OfficeDAO implements EntityDAO<Office> {
	
	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	 

	    @Override
	    public List<Office> findAll() {
	        return jdbcTemplate.query(
	                "select * from office",
	                (rs, rowNum) ->
	                        new Office(
	                                rs.getInt("id"),
	                                rs.getString("name"),
	                                rs.getString("capacity")
	                        )
	        );
	    }

	    // jdbcTemplate.queryForObject, populates a single object
	    @SuppressWarnings("deprecation")
		@Override
	    public Optional<Office> findById(int id) {
	        return jdbcTemplate.queryForObject(
	                "select * from office where id = ?",
	                new Object[]{id},
	                (rs, rowNum) ->
	                        Optional.of(new Office(
	                                rs.getInt("id"),
	                                rs.getString("name"),
	                                rs.getString("capacity")
	                        ))
	        );
	    }





public void save(Office office) {
	try
	{
	    jdbcTemplate.update(
	            "insert into office (id,name, capacity) values(?,?,?)",
	            office.getId(),office.getName(), office.getCapacity());
	}
	catch (DataAccessException e)
	{
		throw new RuntimeException(e);
	}

}



@Override
public void deleteById(int id){
	try
	{
	    jdbcTemplate.update(
	            "delete from office where id = ?",
	            id);
	}
	catch (DataAccessException e)
	{
		throw new RuntimeException(e);
	}

}


}
