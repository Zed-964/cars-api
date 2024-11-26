package com.example.carsapi.dao.db.models;

public record CarEntity(int id,

                        String model,

                        String brand,

                        int year,

                        float price_per_day) {
}
