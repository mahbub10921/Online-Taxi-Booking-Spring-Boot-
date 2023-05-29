package com.SpringFinal.controller;

import com.SpringFinal.Model.Details;
import com.SpringFinal.Model.DriverBookingList;
import com.SpringFinal.repository.DetailsRepo;
import com.SpringFinal.repository.TaxiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class DetailsController {

    @Autowired
    DetailsRepo detailsRepo;

    @PostMapping("/postDetails")
    public void save(@RequestBody Details details) {
       detailsRepo.save(details);
    }

    @GetMapping("/postDetail")
    public List<Details> get() {
       return detailsRepo.findAll();
    }



}
