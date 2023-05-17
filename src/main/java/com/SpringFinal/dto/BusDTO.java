package com.SpringFinal.dto;

import lombok.Data;

@Data
public class BusDTO {
    private Long id;
    private String registration;
    private String coach_type;
    private String from_;
    private String to_;
    private String deparature_time;
    private Integer fare;

}
