package com.example.carsapi.services.mapper;

import com.example.carsapi.dao.db.models.CarEntity;
import com.example.carsapi.services.models.CarModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarModelMapper {

    @Mapping(target = "price", source = "price_per_day")
    CarModel toCarModel(CarEntity entity);

    List<CarModel> toCarModels(List<CarEntity> entities);
}
