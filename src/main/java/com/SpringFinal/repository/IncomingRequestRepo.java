package com.SpringFinal.repository;

import com.SpringFinal.Model.IncomingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IncomingRequestRepo extends JpaRepository<IncomingRequest, Long> {

//    @Query( value = "select * from incoming_request where status = 1 limit 1", nativeQuery = true)
//    public List<IncomingRequest> getCustom();
    @Query( value = "select * from incoming_request where status = 1 limit 1", nativeQuery = true)
    public IncomingRequest getCustom();

    @Modifying
    @Transactional
    @Query( value = "update incoming_request set status=false where id=?" , nativeQuery = true)
    public void updateCustom(Long id);

}
