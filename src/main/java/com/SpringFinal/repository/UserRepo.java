package com.SpringFinal.repository;

import com.SpringFinal.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends CrudRepository<User, String> {
    Optional<User> findByUserName(String username);
    Optional<User> findByUserNameAndPassword(String username, String password);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);


    @Query(value = "select phone from user where user_name = :username", nativeQuery = true)
public String getUser(@Param("username") String username);


}
