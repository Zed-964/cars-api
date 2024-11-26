package com.example.carsapi.controller.rest.mappers;

import com.example.carsapi.controller.rest.models.CarsResponse;
import com.example.carsapi.services.models.CarModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarsResponseMapper {

    //@Mapping(target = "data", source = "cars")
    default CarsResponse toCarsResponse(List<CarModel> cars) {
        return CarsResponse.builder().data(cars).build();
    }
}
