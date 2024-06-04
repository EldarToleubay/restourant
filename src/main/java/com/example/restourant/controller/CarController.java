package com.example.restourant.controller;


import com.example.restourant.dto.CarDto;
import com.example.restourant.entity.Car;
import com.example.restourant.service.CarService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;


    @PostMapping
    public Car createCar(@RequestBody CarDto car) {
        return carService.createCar(car);
    }




}
