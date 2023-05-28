package com.SpringFinal.controller;

import com.SpringFinal.Model.User;
import com.SpringFinal.repository.TaxiRepo;
import com.SpringFinal.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class UserController {
    @Autowired
    UserRepo userRepo;


    @GetMapping("/getuser")
    public String getUser(@RequestParam(value = "username") String username){
        return  userRepo.getUser(username);
    }

}
