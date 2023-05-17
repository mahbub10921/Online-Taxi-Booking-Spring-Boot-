package com.SpringFinal.Model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;


@Getter
@Setter
@ToString
@Entity
@RequiredArgsConstructor
public class Bus extends BaseModel{

    private String registration;
    private String coach_type;
    private String from_;
 private String to_;
 private String deparature_time;
 private Integer fare;
 private LocalDate deparature_date;



}
