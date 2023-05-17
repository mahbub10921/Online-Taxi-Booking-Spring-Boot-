package com.SpringFinal.repository;

import com.SpringFinal.Model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepo extends JpaRepository<Driver, Long> {
}
