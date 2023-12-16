package com.pavan.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.pavan.dto.*;

import org.springframework.jdbc.core.RowMapper;

public class StudentToRowMapper implements RowMapper<StudentTo> {

	@Override
	public StudentTo mapRow(ResultSet rs, int arg1) throws SQLException {
		StudentTo sto = new StudentTo();
		sto.setSid(rs.getString("sid"));
		sto.setSname(rs.getString("sname"));
		sto.setSaddr(rs.getString("saddr"));
		return sto;
	}

}
