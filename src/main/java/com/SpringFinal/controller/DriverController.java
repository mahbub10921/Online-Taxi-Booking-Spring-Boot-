package com.SpringFinal.controller;

import com.SpringFinal.Model.Driver;
import com.SpringFinal.service.DriverService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DriverController {
    private DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/driver")
    public List<Driver> getAll(){
        return driverService.getAll();
    }


    @PostMapping("/driver")
    public void save(@RequestBody Driver driver){
        driverService.save(driver);
    }

    @DeleteMapping("/driver/{driverId}")
    public void delete(@PathVariable("driverId")Long id){
        driverService.deleteById(id);
    }

    @PutMapping("/driver")

        public void update(@RequestBody Driver driver){
            driverService.save(driver);
    }

}
