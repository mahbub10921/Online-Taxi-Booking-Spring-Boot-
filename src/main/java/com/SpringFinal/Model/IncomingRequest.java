package com.SpringFinal.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IncomingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pickup;
    private String dropup;
    private Float fare;
    private Boolean status;


    @PrePersist
    public void prePersist() {

        this.status = true;
    }

}
