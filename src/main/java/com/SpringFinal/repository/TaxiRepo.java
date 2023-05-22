package com.SpringFinal.repository;

import com.SpringFinal.Model.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface TaxiRepo extends JpaRepository<Taxi, Long> {

    @Query( value = "select * from taxi where active = 1", nativeQuery = true)
    public List<Taxi> customGet();


    @Modifying
    @Transactional
    @Query( value = "update taxi set active=false where id=?", nativeQuery = true)
    public int customUpdate(Long id);


}
