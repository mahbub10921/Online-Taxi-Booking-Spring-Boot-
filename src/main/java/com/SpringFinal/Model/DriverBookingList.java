package com.SpringFinal.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@RequiredArgsConstructor
public class DriverBookingList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(updatable = false)
    @CreatedDate
    private LocalDate date_booked;
    private Long Ref_code;
    private String pickup;
    private String dropup;
    private double fare;
    private String status;
    private boolean state;
    @PrePersist
    public void prePersist() {

        this.state = true;
    }


}
