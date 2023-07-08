package com.SpringFinal.controller;

import com.SpringFinal.Model.NewRegis;
import com.SpringFinal.repository.NewReg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class NewRegisController {
    @Autowired
    NewReg newReg;



    @PostMapping("/newreg")
    public void save(@RequestBody NewRegis newRegis){
        newReg.save(newRegis);
    }

    @GetMapping("/custommmm")
    public List<NewRegis> getCustom(){
        List<NewRegis> list = newReg.findAll();

        return list;
    }


}
