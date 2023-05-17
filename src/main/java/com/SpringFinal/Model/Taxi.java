package com.SpringFinal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Taxi extends BaseModel{
    private String registration;
    private String model;
    private String company;
    private String category;
    private int fair;
    @OneToOne(mappedBy = "taxi", cascade = CascadeType.ALL)
    private Driver driver;

}
