package com.SpringFinal.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@RequiredArgsConstructor
public class Route{
    @Id
    private String location;
    private double latitude;
    private double longitude;

}
