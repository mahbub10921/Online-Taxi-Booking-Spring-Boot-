package com.SpringFinal.service;

import com.SpringFinal.Model.Driver;
import com.SpringFinal.repository.DriverRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    private DriverRepo driverRepo;

    public DriverService(DriverRepo driverRepo) {
        this.driverRepo = driverRepo;
    }

   public List<Driver> getAll(){
        return driverRepo.findAll();
    }

    public void save(Driver newdriver){
        if (newdriver.getId()!=null){
            Driver olddriver = new Driver();
            olddriver.setName(newdriver.getName());
            olddriver.setAddress(newdriver.getAddress());
            olddriver.setNumber(newdriver.getNumber());
            olddriver.setNid(newdriver.getNid());
            driverRepo.save(olddriver);
        }else{
            driverRepo.save(newdriver);
        }
    }

    public Driver getById(Long id){
        return driverRepo.findById(id).orElse(new Driver());
    }

    public void deleteById(Long id){
        driverRepo.deleteById(id);
    }


}
