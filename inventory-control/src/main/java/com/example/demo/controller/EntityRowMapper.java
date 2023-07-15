package com.example.demo.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EntityRowMapper implements RowMapper<Entity> {

	@Override
	public Entity mapRow(ResultSet rs, int rowNum) throws SQLException {
		Entity entity = new Entity();
		entity.setStockCode(rs.getInt("stock_code"));
		entity.setStockQuantity(rs.getInt("stock_quantity"));
		return entity;
	}
}
