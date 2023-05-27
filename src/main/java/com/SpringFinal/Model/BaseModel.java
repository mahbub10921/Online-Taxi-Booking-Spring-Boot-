package com.SpringFinal.Model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean active;
    @Column(updatable = false)
    @CreationTimestamp

    private LocalDateTime createdAt;
    private Long createdBy;
@PrePersist
    public void prePersist() {

        this.active = true;
    }
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Boolean getActive() {
	return active;
}
public void setActive(Boolean active) {
	this.active = active;
}
public LocalDateTime getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(LocalDateTime createdAt) {
	this.createdAt = createdAt;
}
public Long getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(Long createdBy) {
	this.createdBy = createdBy;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}




}
