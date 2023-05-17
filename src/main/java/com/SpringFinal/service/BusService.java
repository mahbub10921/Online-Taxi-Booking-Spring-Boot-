package com.SpringFinal.service;

import com.SpringFinal.Model.Bus;
import com.SpringFinal.repository.BusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {
    
    @Autowired
    BusRepo busRepo;

    public List<Bus> getAll(){
     return busRepo.findAll();
    }

   public Bus getById(Long id){
        return busRepo.findById(id).orElse(new Bus());
   }
   public void deleteById(Long id){
         busRepo.deleteById(id);
   }
   public void save( Bus newBus){
        if (newBus.getId()!=null){
            busRepo.findById(newBus.getId())
                    .map(old->{
                        old.setRegistration(newBus.getRegistration());
                        old.setCoach_type(newBus.getCoach_type());
                        old.setFrom_(newBus.getFrom_());
                        old.setTo_(newBus.getTo_());
                        old.setDeparature_time(newBus.getDeparature_time());
                        old.setFare(newBus.getFare());
                        old.setDeparature_date(newBus.getDeparature_date());
                        return busRepo.save(old);
                    }).orElseGet(() -> {
                return busRepo.save(newBus);
            });
        }
        else {
            busRepo.save(newBus);
        }
   }


}
