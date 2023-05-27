package com.SpringFinal.controller;

import com.SpringFinal.repository.DriverEarningRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DriverEarningsController {

    @Autowired
    DriverEarningRepo driverEarningRepo;
    
    @GetMapping("/getFare")
    public int getFare(@RequestParam(value = "fare") Long fare){
     return  driverEarningRepo.customUpdate(fare);
    }
}
