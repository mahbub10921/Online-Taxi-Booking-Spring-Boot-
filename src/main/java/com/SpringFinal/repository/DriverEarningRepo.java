package com.SpringFinal.repository;

import com.SpringFinal.Model.DriverEarnings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface DriverEarningRepo extends JpaRepository<DriverEarnings, Long> {

    @Modifying
    @Transactional
    @Query( value = " update driver_earnings set earnings=(earnings + :value)  where id=1", nativeQuery = true)
    public int customUpdate(@Param("value") Long fare);

}
