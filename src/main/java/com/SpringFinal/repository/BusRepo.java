package com.SpringFinal.repository;

import com.SpringFinal.Model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepo extends JpaRepository<Bus, Long> {
}
