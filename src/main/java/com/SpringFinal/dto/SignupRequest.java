package com.SpringFinal.dto;

import lombok.Data;

import javax.persistence.Entity;


@Data

public class SignupRequest {
    private String username;

    //    @NotBlank
//    @Size(max = 50)
//    @Email
    private String email;

//    private Set<String> role;

    //    @NotBlank
//    @Size(min = 6, max = 40)
    private String password;
}
