package com.SpringFinal.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;

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
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getFair() {
		return fair;
	}
	public void setFair(int fair) {
		this.fair = fair;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}

    

}
