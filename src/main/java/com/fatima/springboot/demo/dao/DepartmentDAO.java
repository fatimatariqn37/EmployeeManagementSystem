package com.fatima.springboot.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fatima.springboot.demo.entity.Department;

@Repository
public class DepartmentDAO implements EntityDAO<Department>{

	 @Autowired
	    private JdbcTemplate jdbcTemplate;

	 

	    @Override
	    public List<Department> findAll() {
	        return jdbcTemplate.query(
	                "select * from department",
	                (rs, rowNum) ->
	                        new Department(
	                                rs.getInt("id"),
	                                rs.getString("name"),
	                                rs.getString("description")
	                        )
	        );
	    }

	    // jdbcTemplate.queryForObject, populates a single object
	    @SuppressWarnings("deprecation")
		@Override
	    public Optional<Department> findById(int id) {
	        return jdbcTemplate.queryForObject(
	                "select * from department where id = ?",
	                new Object[]{id},
	                (rs, rowNum) ->
	                        Optional.of(new Department(
	                                rs.getInt("id"),
	                                rs.getString("name"),
	                                rs.getString("description")
	                        ))
	        );
	    }





public void save(Department department) {
	try
	{
	    jdbcTemplate.update(
	            "insert into department (id,name, description) values(?,?,?)",
	            department.getId(),department.getName(), department.getDescription());
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
	            "delete from department where id = ?",
	            id);
	}
	catch (DataAccessException e)
	{
		throw new RuntimeException(e);
	}

}


}