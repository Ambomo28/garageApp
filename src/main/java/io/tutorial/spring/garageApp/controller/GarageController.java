package io.tutorial.spring.garageApp.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.tutorial.spring.garageApp.model.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.tutorial.spring.garageApp.service.GarageService;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@Tag(description ="Endpoints to garave servive",name = "garage rest service")
public class GarageController {

    @Autowired
    private GarageService garageService;
    @Operation(summary = "garage rest service")
    @RequestMapping(method = RequestMethod.GET, value = "/api/cars")
    public List<Car> getCars() {
        return garageService.getCars();
    }

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id) {return garageService.getCar(id);}

    @Operation(summary = "garage rest service")
    @RequestMapping(method = RequestMethod.DELETE, value = "/api/car/{id}")
    public void deleteCar(@PathVariable long id) {garageService.deleteCar(id);}

    @Operation(summary = "garage rest service")
    @RequestMapping(method = RequestMethod.POST, value = "/api/cars")
    public void addCar(@RequestBody Car car) {garageService.addCar(car);}

    @Operation(summary = "garage rest service")
    @RequestMapping(method = RequestMethod.PUT, value = "/api/car/{id}")
    public void updateCar(@RequestBody Car car,@PathVariable long id) {
        garageService.updateCar(car, id);
    }
}
