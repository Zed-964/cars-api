package com.example.carsapi.dao.db.mapper;

import com.example.carsapi.dao.db.models.CarEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarsEntityMapper implements RowMapper<CarEntity> {

    @Override
    public CarEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CarEntity(
                rs.getInt("id"),
                rs.getString("model"),
                rs.getString("brand"),
                rs.getInt("year"),
                rs.getFloat("price_per_day"));
    }
}
