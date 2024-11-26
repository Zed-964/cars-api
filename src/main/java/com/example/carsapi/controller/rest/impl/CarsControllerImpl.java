package com.example.carsapi.controller.rest.impl;

import com.example.carsapi.controller.rest.CarsController;
import com.example.carsapi.controller.rest.mappers.CarsResponseMapper;
import com.example.carsapi.controller.rest.models.CarsResponse;
import com.example.carsapi.services.CarsService;
import com.example.carsapi.utils.CarsApiConstants;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Tag(name = CarsApiConstants.CARS_TAG, description = "Get all cars")
public class CarsControllerImpl implements CarsController {

    private final CarsService carsService;

    private final CarsResponseMapper carsResponseMapper;

    @Override
    public ResponseEntity<CarsResponse> getCars(LocalDate from, LocalDate to) {

        if (from.isAfter(to)) {
            ResponseEntity.badRequest().body("La date de début ne doit pas être supérieur à la date de fin !");
        }

        return ResponseEntity.ok(carsResponseMapper.toCarsResponse(carsService.getAllCars(from, to)));
    }
}
