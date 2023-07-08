package com.SpringFinal.repository;

import com.SpringFinal.Model.NewRegis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewReg extends JpaRepository<NewRegis, Long> {

}
