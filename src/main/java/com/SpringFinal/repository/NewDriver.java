package com.SpringFinal.repository;

import com.SpringFinal.Model.AdminEarnings;
import com.SpringFinal.Model.newDriver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewDriver extends JpaRepository<newDriver, Long> {
}
