package com.SpringFinal.dto;


import com.SpringFinal.Model.Driver;
import lombok.Data;

@Data
public class TaxiDto {
    private Long id;
    private String registration;
    private String model;
    private String company;
    private String  category;
    private Driver driver;
}
