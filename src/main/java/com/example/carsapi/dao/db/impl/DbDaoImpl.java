package com.example.carsapi.dao.db.impl;

import com.example.carsapi.dao.db.DbDao;
import com.example.carsapi.dao.db.mapper.CarsEntityMapper;
import com.example.carsapi.dao.db.models.CarEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class DbDaoImpl implements DbDao {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<CarEntity> getCarsWithoutReservation(LocalDate from, LocalDate to) {
        String sql = """
            SELECT *
            FROM cars c
            WHERE NOT EXISTS (
                SELECT 1
                FROM reservations r
                WHERE r.car_id = c.id
                AND (
                    (r.start_date <= ? AND r.end_date >= ?) OR
                    (r.start_date >= ? AND r.start_date <= ?)
                )
            )
        """;

        return jdbcTemplate.query(sql, new CarsEntityMapper(), from, to, from, to);
    }
}
