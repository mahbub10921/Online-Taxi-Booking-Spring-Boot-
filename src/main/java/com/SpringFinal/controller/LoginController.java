package com.SpringFinal.controller;

import com.SpringFinal.Model.Role;
import com.SpringFinal.Model.User;
import com.SpringFinal.dto.JwtResponse;
import com.SpringFinal.dto.LoginRequest;
import com.SpringFinal.dto.ResponseMessage;
import com.SpringFinal.dto.SignupRequest;
import com.SpringFinal.repository.RoleRepo;
import com.SpringFinal.repository.UserRepo;
import com.SpringFinal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;
@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")

public class LoginController {
//    @Autowired
//    private PasswordEncoder passwordEncoder;


    @Autowired
    UserRepo userRepo;
    @Autowired
    RoleRepo roleRepo;


    @Autowired
    UserService userService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleandUser();
    }
    @GetMapping({"/getUser"})
    public Iterable<User> getAll() {
        return userRepo.findAll();
    }


    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userRepo.save(user);
    }


    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleRepo.save(role);
    }


    @PostMapping({"/signin"})
    public ResponseEntity<?> createJwtToken22(@RequestBody LoginRequest loginRequest) throws Exception {
        System.out.println("Test Action");
//        (@RequestBody JwtRequest jwtRequest)
        User user = userRepo.findByUserNameAndPassword(loginRequest.getUsername(),loginRequest.getPassword()).get();

        return ResponseEntity.ok(new JwtResponse(user));
    }


    @PostMapping({"/signup"})
    public ResponseEntity<?> registerNewUserNew(@RequestBody SignupRequest signupRequest) {
        User user = new User();
        user.setUserName(signupRequest.getUsername());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());

//        BeanUtils.copyProperties(signupRequest,user,"username");
//        user.setRole((Set<Role>) new Role("User"));




        if (userRepo.existsByUserName(signupRequest.getUsername())) {
            return ResponseEntity
                    .badRequest()
                    .body(new ResponseMessage("Error: Username is already taken!"));
        }
//
        if (userRepo.existsByEmail(signupRequest.getEmail())) {
            return ResponseEntity
                    .badRequest()
                    .body(new ResponseMessage("Error: Email is already in use!"));
        }
//
//        // Create new user's account
//        User user = new User(signUpRequest.getUsername(),
//                signUpRequest.getEmail(),
//                encoder.encode(signUpRequest.getPassword()));
//
//        Set<String> strRoles = signUpRequest.getRole();
//        Set<Role> roles = new HashSet<>();
//
//        if (strRoles == null) {
//            Role userRole = roleRepository.findByName(ERole.ROLE_USER)
//                    .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//            roles.add(userRole);
//        } else {
//            strRoles.forEach(role -> {
//                switch (role) {
//                    case "admin":
//                        Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
//                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                        roles.add(adminRole);
//
//                        break;
//                    case "mod":
//                        Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
//                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                        roles.add(modRole);
//
//                        break;
//                    default:
//                        Role userRole = roleRepository.findByName(ERole.ROLE_USER)
//                                .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
//                        roles.add(userRole);
//                }
//            });
//        }
//
//        user.setRoles(roles);
//        userRepository.save(user);
//
//        return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
//    }

//        userService.registerNewUser(user);
        Role role = roleRepo.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
//        user.setPassword(getEncodedPassword(user.getPassword()));
        user.setPassword(user.getPassword());

        userRepo.save(user);
        return ResponseEntity.ok(new ResponseMessage("User registered successfully!"));

    }

//    public String getEncodedPassword(String password) {
//        return passwordEncoder.encode(password);
//    }

}
