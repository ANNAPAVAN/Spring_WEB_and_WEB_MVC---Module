package com.pavan.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;
import com.pavan.dto.StudentTo;
import com.pavan.mapper.*;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	String status="";
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public String addStudent(StudentTo sto) {
	
		String query1 = "select * from studentapp where sid = '"+sto.getSid()+"'";
		List<StudentTo> list = jdbcTemplate.query(query1,new StudentToRowMapper());
		if(list.isEmpty()) {
			String query2 = "insert into studentapp values('"+sto.getSid()+"','"+sto.getSname()+"','"+sto.getSaddr()+"')";
			int rowCount = jdbcTemplate.update(query2);
			if(rowCount==1) {
				status="success";
			}else {
				status = "failure";
			}
		}else {
			status = "existed";
		}
		return status;
	}

	@Override
	public StudentTo search(String sid) {
		StudentTo sto = null;
		String query = "select * from studentapp where sid='"+sid+"'";
		List<StudentTo> std_List = jdbcTemplate.query(query, new StudentToRowMapper());
		
		if(std_List.isEmpty()) {
			sto = null;
		}else {
			sto = std_List.get(0);
		}
		
		return sto;
	}

	@Override
	public String update(StudentTo sto) {
		String query = "update studentapp set sname='"+sto.getSname()+"' , saddr = '"+sto.getSaddr()+"' where sid='"+sto.getSid()+"'";
		int rowCount = jdbcTemplate.update(query);
		if(rowCount==1) {
			status="success";
		}else {
			status="failure";
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		String query = "select * from studentapp where sid='"+sid+"'";
		List<StudentTo> std_List = jdbcTemplate.query(query, new StudentToRowMapper());
		if(std_List.isEmpty()) {
			status="notexisted";
		}else {
			String query1 = "delete from studentapp where sid = '"+sid+"'";
			int rowCount = jdbcTemplate.update(query1);
			if(rowCount==1) {
				status="success";
			}else {
				status="failure";
			}
		}
		return status;
	}

}
