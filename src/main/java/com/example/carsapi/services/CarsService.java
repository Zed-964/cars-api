package com.example.carsapi.services;

import com.example.carsapi.dao.db.DbDao;
import com.example.carsapi.services.mapper.CarModelMapper;
import com.example.carsapi.services.models.CarModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CarsService {

    private final DbDao dbDao;

    private final CarModelMapper carModelMapper;

    public List<CarModel> getAllCars(LocalDate from, LocalDate to) {
        return carModelMapper.toCarModels(dbDao.getCarsWithoutReservation(from, to));
    }
}
