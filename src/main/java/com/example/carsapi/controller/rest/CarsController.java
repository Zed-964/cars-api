package com.example.carsapi.controller.rest;

import com.example.carsapi.controller.rest.models.CarsResponse;
import com.example.carsapi.utils.CarsApiConstants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

public interface CarsController {

    @Operation(summary = "Get all cars",
                description = "Get amm cars can reserve",
                tags = {CarsApiConstants.CARS_TAG})

    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "successful operation",
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = CarsResponse.class))),

            @ApiResponse(responseCode = "500",
                    description = "Error occur",
                    content = @Content(mediaType = "application/json")) })

    @GetMapping(value = CarsApiConstants.CARS_PATH,
            produces = { "application/json" })
    ResponseEntity<CarsResponse> getCars(@RequestParam LocalDate startDate, @RequestParam LocalDate endDate);
}
