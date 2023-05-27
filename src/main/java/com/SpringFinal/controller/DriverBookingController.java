package com.SpringFinal.controller;

import com.SpringFinal.Model.DriverBookingList;
import com.SpringFinal.Model.IncomingRequest;
import com.SpringFinal.repository.DriverBookingListRepo;
import com.SpringFinal.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DriverBookingController {

    @Autowired
    DriverBookingListRepo driverBookingListRepo;


    @PostMapping("/bookingRequest")
    public void save(@RequestBody DriverBookingList driverBookingList) {
        driverBookingListRepo.save(driverBookingList);
    }



    @GetMapping("/customGet")
    public DriverBookingList getAll(){
        return driverBookingListRepo.customGet();
    }





    @GetMapping("/booking/{id}")
    public void customUpdate(@PathVariable Long id){
        driverBookingListRepo.customUpdate(id);
    }


    @GetMapping("getOnlyBooked")
    public List<DriverBookingList> getBooked(){
        return driverBookingListRepo.gett();
    }



}
