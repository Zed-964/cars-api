package com.example.carsapi.services.models;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CarModel {

    private int id;

    private String model;

    private String brand;

    private int year;

    private float price;
}
