package com.SpringFinal.controller;

import com.SpringFinal.Model.Bus;
import com.SpringFinal.Model.Taxi;
import com.SpringFinal.dto.BusDTO;
import com.SpringFinal.dto.ResponseMessage;
import com.SpringFinal.dto.TaxiDto;
import com.SpringFinal.repository.TaxiRepo;
import com.SpringFinal.service.BusService;
import com.SpringFinal.service.TaxiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")

public class TaxiController {
    @Autowired
    TaxiService taxiService;

    @Autowired
    TaxiRepo  taxiRepo;

    @PostMapping("/taxi")
    public void save(@RequestBody TaxiDto taxiDto){

        Taxi taxi = new Taxi();
        BeanUtils.copyProperties(taxiDto, taxi);
        taxi.getDriver().setTaxi(taxi);
        taxiService.save(taxi);
    }


    @PutMapping("/taxi")
    public void update(@RequestBody TaxiDto taxiDto){
       Taxi taxi = new Taxi();
        BeanUtils.copyProperties(taxiDto,taxi);
        taxiService.save(taxi);
    }



    @DeleteMapping("/taxi/{id}")
    ResponseEntity<ResponseMessage> deleteEmployee(@PathVariable Long id) {
        taxiService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Success Delete"));
    }


    @GetMapping("taxi/{id}")
    public TaxiDto getById(@PathVariable("id")Long id){
        Taxi taxi = taxiService.getById(id);
       TaxiDto taxiDto =new TaxiDto();
        if (taxi.getId()!=null){
            BeanUtils.copyProperties(taxi, taxiDto);
            return taxiDto;
        }
        return null;
    }


    @GetMapping("/taxi")
    public List<TaxiDto> getAll(){
        List<Taxi>taxiList  = taxiService.getAll();
        List<TaxiDto> taxiDTOList = new ArrayList<>();
        for (Taxi p: taxiList) {
           TaxiDto taxiDto = new TaxiDto();
            BeanUtils.copyProperties(p,taxiDto);
            taxiDTOList.add(taxiDto);
        }
        return taxiDTOList;
    }


    @GetMapping("/custom")
    public List<Taxi> getCustom(){
        List<Taxi> list = taxiRepo.findAll();
        list.forEach(taxi -> {taxi.getDriver().setTaxi(null);});
        return list;
    }

    @GetMapping("/getCustom")
    public List<Taxi> getCustom2(){
        List<Taxi> list = taxiRepo.customGet();
        list.forEach(taxi -> {taxi.getDriver().setTaxi(null);});
        return list;
    }



}
