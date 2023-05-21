package com.SpringFinal.repository;

import com.SpringFinal.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends CrudRepository<User, String> {
    Optional<User> findByUserName(String username);
    Optional<User> findByUserNameAndPassword(String username, String password);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);
}
