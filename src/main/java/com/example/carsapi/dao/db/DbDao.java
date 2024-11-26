package com.example.carsapi.dao.db;

import com.example.carsapi.dao.db.models.CarEntity;

import java.time.LocalDate;
import java.util.List;

public interface DbDao {

    List<CarEntity> getCarsWithoutReservation(LocalDate from, LocalDate to);
}
