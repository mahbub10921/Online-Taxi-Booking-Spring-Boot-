package com.SpringFinal.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Pickup;
    private String Dropup;
    private Float Fare;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPickup() {
		return Pickup;
	}
	public void setPickup(String pickup) {
		Pickup = pickup;
	}
	public String getDropup() {
		return Dropup;
	}
	public void setDropup(String dropup) {
		Dropup = dropup;
	}
	public Float getFare() {
		return Fare;
	}
	public void setFare(Float fare) {
		Fare = fare;
	}
    
    
}
