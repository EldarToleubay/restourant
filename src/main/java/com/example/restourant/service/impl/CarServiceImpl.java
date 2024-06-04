package com.example.restourant.service.impl;

import com.example.restourant.dto.CarDto;
import com.example.restourant.entity.Car;
import com.example.restourant.entity.User;
import com.example.restourant.repository.CarRepository;
import com.example.restourant.repository.UserRepository;
import com.example.restourant.service.CarService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Data
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final UserRepository userRepository;


    @Override
    public Car createCar(CarDto car) {
        Car carEntity = new Car();
        carEntity.setModel(car.getModel());
        carEntity.setMarka(car.getMarka());
        carEntity.setYear(car.getYear());
        Optional<User> user = userRepository.findById(car.getUserId());
        user.ifPresent(carEntity::setUser);

        carRepository.save(carEntity);

        System.out.println(carRepository.findByUserId(1000));


        return carEntity;




    }
}
