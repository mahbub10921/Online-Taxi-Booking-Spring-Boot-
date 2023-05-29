package com.SpringFinal.service;

import com.SpringFinal.Model.*;
import com.SpringFinal.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    RouteRepo routeRepo;

    @Autowired
    TaxiRepo taxiRepo;

    @Autowired
    DriverRepo driverRepo;



public void initRoleandUser(){
    Role adminRole = new Role();
    adminRole.setRoleName("Admin");
    adminRole.setRoleDescription("Admin role");
    roleRepo.save(adminRole);

    Role userRole = new Role();
    userRole.setRoleName("User");
    userRole.setRoleDescription("Default role for newly created record");
    roleRepo.save(userRole);

    Role driverRole = new Role();
    driverRole.setRoleName("Driver");
    driverRole.setRoleDescription("Driver role");
    roleRepo.save(driverRole);



    User adminUser = new User();
    adminUser.setUserName("mahbub");
//        adminUser.setPassword(getEncodedPassword("admin@pass"));
    adminUser.setPassword("mahbub");

    adminUser.setEmail("mahbub@gmail.com");
    adminUser.setPhone("01537263505");
    Set<Role> adminRoles = new HashSet<>();
    adminRoles.add(adminRole);
    adminUser.setRole(adminRoles);

    userRepo.save(adminUser);


User driver19 = new User();
driver19.setUserName("jamal");
driver19.setEmail("jamal@gmail.com");
driver19.setPassword("jamalja");
driver19.setPhone("01527456857");
Set<Role> userRole1 = new HashSet<>();
userRole1.add(userRole);


    User user = new User();
    user.setUserName("raj");
    user.setPassword("rajraj");
    user.setEmail("raj@gmail.com");
    user.setPhone("01913486428");
    Set<Role> userRoles = new HashSet<>();
    userRoles.add(userRole);
    user.setRole(userRoles);
    userRepo.save(user);


    User driver = new User();
    driver.setUserName("kamal");
//  adminUser.setPassword(getEncodedPassword("admin@pass"));
    driver.setPassword("kamalkaku");
    driver.setEmail("kamal@gmail.com");
    driver.setPhone("01826636014");
    Set<Role> driverRoles = new HashSet<>();
    driverRoles.add(driverRole);
    driver.setRole(driverRoles);
    userRepo.save(driver);

    Route route = new Route();
    route.setLocation("Basabo");
    route.setLatitude(23.742810644669024);
    route.setLongitude(90.43087382292659);
    routeRepo.save(route);

    Route kazi = new Route();
    kazi.setLocation("Kazipara");
    kazi.setLatitude(23.79940524882003);
    kazi.setLongitude(90.37182231087452);
    routeRepo.save(kazi);

    Route mo = new Route();
    mo.setLocation("Mohammadpur");
    mo.setLatitude(23.74603182472281);
    mo.setLongitude( 90.3740109906217);
    routeRepo.save(mo);


    Route jat = new Route();
    jat.setLocation("Jatrabari");
    jat.setLatitude(23.711576864895765);
    jat.setLongitude(90.43447870933895);
    routeRepo.save(jat);


    Route mirpur = new Route();
    mirpur.setLocation("Mirpur10");
    mirpur.setLatitude(23.808122013011626);
    mirpur.setLongitude(90.37001986451726);
    routeRepo.save(mirpur);

    Route agar = new Route();
    agar.setLocation("Agargaon");
    agar.setLatitude(23.778178262503424);
    agar.setLongitude(90.37959106407965);
    routeRepo.save(agar);

    Route mali = new Route();
    mali.setLocation("Abul Hotel,Malibagh,Dhaka");
    mali.setLatitude(23.754285707376678);
    mali.setLongitude(90.41593784085504);
    routeRepo.save(mali);

    Route moti = new Route();
    moti.setLocation("Motijheel");
    moti.setLatitude(23.77847479920561);
    moti.setLongitude(90.38014788528353);
    routeRepo.save(moti);

    Route basu1 = new Route();
    basu1.setLocation("Bashundhara City Shopping Complex,Dhaka");
    basu1.setLatitude(23.749961792896833);
    basu1.setLongitude(90.3886410599775);
    routeRepo.save(basu1);

    Route basu2 = new Route();
    basu2.setLocation("Bashundhara Residential Area,Dhaka");
    basu2.setLatitude(23.77847479920561);
    basu2.setLongitude(90.38014788528353);
    routeRepo.save(basu2);

    Route basu3 = new Route();
    basu3.setLocation("Banani DOHS");
    basu3.setLatitude(23.79630502281683);
    basu3.setLongitude(90.39851158929955);
    routeRepo.save(basu3);

    Route basu4 = new Route();
    basu4.setLocation("Baridhara");
    basu4.setLatitude(23.77847479920561);
    basu4.setLongitude(90.38014788528353);
    routeRepo.save(basu4);

    Route basu5 = new Route();
    basu5.setLocation("Banani Super Market");
    basu5.setLatitude(23.79630502281683);
    basu5.setLongitude(90.39851158929955);
    routeRepo.save(basu5);

    Route basu6 = new Route();
    basu6.setLocation("Banani Club");
    basu6.setLatitude(23.79630502281683);
    basu6.setLongitude(90.39851158929955);
    routeRepo.save(basu6);

    Route basu7 = new Route();
    basu7.setLocation("Hazrat Shahjalal International Airport,Dhaka");
    basu7.setLatitude(23.850632347270384);
    basu7.setLongitude(90.40434141338267);
    routeRepo.save(basu7);

    Route basu9 = new Route();
    basu9.setLocation("Airport Railway Station,Dhaka");
    basu9.setLatitude(23.850632347270384);
    basu9.setLongitude(90.40434141338267);
    routeRepo.save(basu9);

    Route basu8 = new Route();
    basu8.setLocation("Banani Graveyard");
    basu8.setLatitude(23.79630502281683);
    basu8.setLongitude(90.39851158929955);
    routeRepo.save(basu8);

    Route basu10 = new Route();
    basu10.setLocation("Khilgaon Police Fari,Khilgaon,Dhaka");
    basu10.setLatitude(23.748469109329964);
    basu10.setLongitude(90.42614907083258);
    routeRepo.save(basu10);

    Route basu11 = new Route();
    basu11.setLocation("Khilgaon Model Schhol And College,Khilgaon,Dhaka");
    basu11.setLatitude(23.748469109329964);
    basu11.setLongitude(90.42614907083258);
    routeRepo.save(basu11);

    Route basu12 = new Route();
    basu12.setLocation("Khilgaon Railgate,Khilgaon,Dhaka");
    basu12.setLatitude(23.748469109329964);
    basu12.setLongitude(90.42614907083258);
    routeRepo.save(basu12);












//
//
//    Driver driver1 = new Driver();
//    driver1.setName("Md.Kamal Hasan");
//    driver1.setAddress("Khilgaon,Dhaka");
//    driver1.setNumber("01636455756");
//    driver1.setNid("43572555");
//    driver1.setImagePath("assets\\IMG.JPG");
//
//
//
//
//
//    Taxi taxi1 = new Taxi();
//    taxi1.setRegistration("D-5467DT");
//    taxi1.setModel("Axio");
//    taxi1.setCompany("Toyota");
//    taxi1.setCategory("4 seat");
//    taxi1.setFair(50);
//    driver1.setTaxi(taxi1);
//    taxi1.setDriver(driver1);
//    taxiRepo.save(taxi1);
//
//
//    Driver driver2 = new Driver();
//    driver2.setName("Jamal Uddin");
//    driver2.setAddress("Faridpur");
//    driver2.setNumber("01636455756");
//    driver2.setNid("43572555");
//    driver2.setImagePath("assets\\man1.jpeg");
//
//
//    Taxi taxi2 = new Taxi();
//    taxi2.setRegistration("C-756WU4");
//    taxi2.setModel("Premio");
//    taxi2.setCompany("Toyota");
//    taxi2.setCategory("4 seat");
//    taxi2.setFair(50);
//
//    driver2.setTaxi(taxi2);
//    taxi2.setDriver(driver2);
//    taxiRepo.save(taxi2);
//
//    Driver driver3 = new Driver();
//    driver3.setName("Rahim Patawary");
//    driver3.setAddress("Khilgaon,Dhaka");
//    driver3.setNumber("01636455756");
//    driver3.setNid("43572555");
//    driver3.setImagePath("assets\\man2.jpg");
//
//
//    Taxi taxi3 = new Taxi();
//    taxi3.setRegistration("D-5764JE");
//    taxi3.setModel("Noah");
//    taxi3.setCompany("Toyota");
//    taxi3.setCategory("7 seat");
//    taxi3.setFair(80);
//    driver3.setTaxi(taxi3);
//    taxi3.setDriver(driver3);
//    taxiRepo.save(taxi3);
//
//
//    Driver driver4 = new Driver();
//    driver4.setName("Mizan Sarker");
//    driver4.setAddress("Basabo");
//    driver4.setNumber("01636455756");
//    driver4.setNid("43572555");
//    driver4.setImagePath("assets\\man2.jpg");
//
//
//    Taxi taxi4 = new Taxi();
//    taxi4.setRegistration("D-5467DT");
//    taxi4.setModel("Bluebird");
//    taxi4.setCompany("Nissan");
//    taxi4.setCategory("4 seat");
//    taxi4.setFair(50);
//
//    driver4.setTaxi(taxi4);
//    taxi4.setDriver(driver4);
//    taxiRepo.save(taxi4);
//
//    Driver driver5 = new Driver();
//    driver5.setName("Riaz Uddin");
//    driver5.setAddress("Barishal");
//    driver5.setNumber("01636455756");
//    driver5.setNid("43572555");
//    driver5.setImagePath("assets\\man4.jpg");
//
//
//    Taxi taxi5 = new Taxi();
//    taxi5.setRegistration("H-5467DT");
//    taxi5.setModel("Allion");
//    taxi5.setCompany("Toyota");
//    taxi5.setCategory("4 seat");
//    taxi5.setFair(50);
//
//    driver5.setTaxi(taxi5);
//    taxi5.setDriver(driver5);
//    taxiRepo.save(taxi5);
//
//    Driver driver6 = new Driver();
//    driver6.setName("Ashraf Miah");
//    driver6.setAddress("Gazipur");
//    driver6.setNumber("01636455756");
//    driver6.setNid("43572555");
//    driver6.setImagePath("assets\\man2.jpg");
//
//
//    Taxi taxi6 = new Taxi();
//    taxi6.setRegistration("G-5467DT");
//    taxi6.setModel("Noah");
//    taxi6.setCompany("Toyota");
//    taxi6.setCategory("7 seat");
//    taxi6.setFair(80);
//
//    driver6.setTaxi(taxi6);
//    taxi6.setDriver(driver6);
//    taxiRepo.save(taxi6);
//
//    Driver driver7 = new Driver();
//    driver7.setName("Likhon Islam");
//    driver7.setAddress("Khilgaon,Dhaka");
//    driver7.setNumber("01636455756");
//    driver7.setNid("43572555");
//    driver7.setImagePath("assets\\man4.jpg");
//
//
//    Taxi taxi7 = new Taxi();
//    taxi7.setRegistration("K-5467DT");
//    taxi7.setModel("Lancer");
//    taxi7.setCompany("Mitsubishi");
//    taxi7.setCategory("4 seat");
//    taxi7.setFair(50);
//
//    driver7.setTaxi(taxi7);
//    taxi7.setDriver(driver7);
//    taxiRepo.save(taxi7);

}

}


