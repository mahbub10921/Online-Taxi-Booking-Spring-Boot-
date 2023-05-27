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
public String getRegistration() {
	return registration;
}
public void setRegistration(String registration) {
	this.registration = registration;
}
public String getCoach_type() {
	return coach_type;
}
public void setCoach_type(String coach_type) {
	this.coach_type = coach_type;
}
public String getFrom_() {
	return from_;
}
public void setFrom_(String from_) {
	this.from_ = from_;
}
public String getTo_() {
	return to_;
}
public void setTo_(String to_) {
	this.to_ = to_;
}
public String getDeparature_time() {
	return deparature_time;
}
public void setDeparature_time(String deparature_time) {
	this.deparature_time = deparature_time;
}
public Integer getFare() {
	return fare;
}
public void setFare(Integer fare) {
	this.fare = fare;
}
public LocalDate getDeparature_date() {
	return deparature_date;
}
public void setDeparature_date(LocalDate deparature_date) {
	this.deparature_date = deparature_date;
}



}
