package com.SpringFinal.controller;

import com.SpringFinal.Model.Bus;
import com.SpringFinal.dto.BusDTO;
import com.SpringFinal.service.BusService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.SpringFinal.dto.ResponseMessage;





import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class BusController {

    @Autowired
    BusService busService;

//    @GetMapping("/bus")
//    List<Bus> all() {
//        return busService.getAll();
//    }

//    @GetMapping("/bus/{postId}")
//    Bus getById(@PathVariable("postId") Long id) {
//        return busService.getById(id);
//    }


//    @PostMapping("/bus")
//    public void save(@RequestBody Bus bus) {
//         busService.save(bus);
//    }


    @PostMapping("/bus")
    public void save(@RequestBody BusDTO busDTO){

        Bus bus = new Bus();
        BeanUtils.copyProperties(busDTO, bus);
        busService.save(bus);
    }





//    @PutMapping("/bus")
//    public void update(@RequestBody Bus bus){ busService.save(bus);}

@PutMapping("/bus")
public void update(@RequestBody BusDTO busDTO){
     Bus bus = new Bus();
     BeanUtils.copyProperties(busDTO,bus);
     busService.save(bus);
}



    @DeleteMapping("/bus/{id}")
    ResponseEntity<ResponseMessage> deleteEmployee(@PathVariable Long id) {
        busService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Success Delete"));
    }


    @GetMapping("bus/{id}")
    public BusDTO getById(@PathVariable("id")Long id){
        Bus bus = busService.getById(id);
        BusDTO busDTO = new BusDTO();
        if (bus.getId()!=null){
            BeanUtils.copyProperties(bus, busDTO);
            return busDTO;
        }
        return null;
    }


    @GetMapping("/bus")
    public List<BusDTO> getAll(){
         List<Bus> busList  = busService.getAll();
         List<BusDTO> busDTOList = new ArrayList<>();
        for (Bus p: busList) {
            BusDTO busDTO = new BusDTO();
            BeanUtils.copyProperties(p,busDTO);
            busDTOList.add(busDTO);
        }
         return busDTOList;
    }










}