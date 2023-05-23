package com.SpringFinal.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
@RequiredArgsConstructor
public class DriverEarnings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double earnings;
}
