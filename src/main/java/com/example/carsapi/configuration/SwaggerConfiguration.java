package com.example.carsapi.configuration;

import com.example.carsapi.utils.CarsApiConstants;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Developer",
                        email = "enzotechnic@gmail.com"
                ),
                description = "OpenApi documentation for Tickets-Api",
                title = "Tickets-Api",
                version = "1.0.0",
                license = @License(
                        name = "MIT"
                )
        ),
        tags = {
                @Tag(
                        name = CarsApiConstants.CARS_TAG,
                        description = "Cars"
                )
        }
)
public class SwaggerConfiguration implements WebMvcConfigurer {

}