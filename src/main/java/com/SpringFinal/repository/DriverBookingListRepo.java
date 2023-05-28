package com.SpringFinal.repository;

import com.SpringFinal.Model.DriverBookingList;
import com.SpringFinal.Model.Taxi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface DriverBookingListRepo extends JpaRepository<DriverBookingList, Long> {
    @Query( value = "select * from driver_booking_list where state = 1 limit 1", nativeQuery = true)
    public DriverBookingList customGet();

//    @Modifying
//    @Transactional
//    @Query( value = "update driver_booking_list set state=false where id=?", nativeQuery = true)
//    public void customUpdate(Long id);


    @Modifying
   @Transactional
   @Query( value = "update driver_booking_list set state=false,status='Booked' where id=?", nativeQuery = true)
    public void customUpdate(Long id);


    @Query( value = "select * from driver_booking_list where state = 0 order by id desc", nativeQuery = true)
    public List<DriverBookingList> gett();



}
