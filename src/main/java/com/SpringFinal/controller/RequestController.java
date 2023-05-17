package com.SpringFinal.controller;

import com.SpringFinal.Model.IncomingRequest;
import com.SpringFinal.dto.ResponseMessage;
import com.SpringFinal.repository.IncomingRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class RequestController {



    @Autowired
    IncomingRequestRepo incomingRequestRepo;

    @GetMapping("/request")
    List<IncomingRequest> all() {
        return incomingRequestRepo.findAll();
    }


    @PostMapping("/request")
    public void save(@RequestBody IncomingRequest incomingRequest) {
//        incomingRequest.setStatus(true);
        incomingRequestRepo.save(incomingRequest);
    }

//    @GetMapping("/customRequest")
//    List<IncomingRequest> getAll() {
//        return incomingRequestRepo.getCustom();
//    }
@GetMapping("/customRequest")
IncomingRequest getAll() {
    return incomingRequestRepo.getCustom();
}


//@PutMapping("/customUpdate/{id}")
//ResponseEntity<ResponseMessage> updateRequest(@PathVariable(value="id") Long id) {
//    incomingRequestRepo.updateCustom(id);
//    return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("Success update"));
//}

@GetMapping("/cus/{id}")
    public void customUpdate(@PathVariable Long id){
        incomingRequestRepo.updateCustom(id);
}

}
