package com.SpringFinal.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@RequiredArgsConstructor
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate date_booked;
    private Long refCode;
    private String pickup;
    private String dropup;
    private double fare;
    private double percentage;

}
