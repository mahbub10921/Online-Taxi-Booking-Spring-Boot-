package com.SpringFinal.service;

import com.SpringFinal.Model.NewRegis;
import com.SpringFinal.Model.Taxi;
import com.SpringFinal.repository.NewReg;
import org.springframework.stereotype.Service;
@Service
public class NewRegisService {
NewReg newReg;
    public void save(NewRegis newRegis){
        if (newRegis.getId()!=null){
            newReg.findById(newRegis.getId())
                    .map(old->{
                        old.setName(newRegis.getName());
                        old.setEmail(newRegis.getEmail());
                        old.setRegis(newRegis.getRegis());
                        old.setModel(newRegis.getModel());
                        old.setPassword(newRegis.getPassword());
                        old.setNumber(newRegis.getNumber());
                        old.setCategory(newRegis.getCategory());

                        return newReg.save(old);
                    }).orElseGet(() -> {
                        return newReg.save(newRegis);
                    });
        }
        else {
            newReg.save(newRegis);
        }
    }

}
