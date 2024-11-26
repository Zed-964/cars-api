package com.example.carsapi.controller.rest.models;

import com.example.carsapi.services.models.CarModel;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CarsResponse {
    private List<CarModel> data;

}
