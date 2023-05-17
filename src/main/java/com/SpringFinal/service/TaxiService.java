package com.SpringFinal.service;

import com.SpringFinal.Model.Bus;
import com.SpringFinal.Model.Taxi;
import com.SpringFinal.repository.BusRepo;
import com.SpringFinal.repository.TaxiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaxiService {
@Autowired
    TaxiRepo taxiRepo;

    public List<Taxi> getAll(){
        return taxiRepo.findAll();
    }

    public Taxi getById(Long id){
        return taxiRepo.findById(id).orElse(new Taxi());
    }
    public void deleteById(Long id){
        taxiRepo.deleteById(id);
    }
    public void save( Taxi newTaxi){
        if (newTaxi.getId()!=null){
            taxiRepo.findById(newTaxi.getId())
                    .map(old->{
                        old.setRegistration(newTaxi.getRegistration());
                        old.setModel(newTaxi.getModel());
                        old.setCompany(newTaxi.getCompany());
                        old.setCategory(newTaxi.getCategory());

                        return taxiRepo.save(old);
                    }).orElseGet(() -> {
                        return taxiRepo.save(newTaxi);
                    });
        }
        else {
            taxiRepo.save(newTaxi);
        }
    }




}
