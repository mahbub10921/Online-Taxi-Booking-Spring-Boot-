package com.SpringFinal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Driver extends BaseModel{
    private  String name;
    private String address;
    private String number;
    private String nid;
    @OneToOne
    @JoinColumn(name="taxi_id")
    private Taxi taxi;
}
