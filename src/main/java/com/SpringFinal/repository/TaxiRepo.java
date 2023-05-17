package com.SpringFinal.repository;

import com.SpringFinal.Model.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaxiRepo extends JpaRepository<Taxi, Long> {

    @Query( value = "select * from taxi where active = 1", nativeQuery = true)
    public List<Taxi> customGet();

}
