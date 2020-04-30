package kr.ac.mjc.sungbin.java.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface RowMapper<T> {

	T mapRow(ResultSet rs) throws SQLException;
}
