package com.SpringFinal.controller;

import com.SpringFinal.Model.Notification;
import com.SpringFinal.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api")

@CrossOrigin(value = "http://localhost:4200", allowCredentials = "true")
public class WebSocketController {


    @Autowired
    SimpMessagingTemplate template;
    @Autowired
    NotificationRepository notificationRepository;




    @GetMapping(value = "/send/message")
    public void publishUpdates(@RequestParam(value = "Pickup") String Pickup, @RequestParam(value = "Dropup") String Dropup, @RequestParam(value = "Fare") Float Fare ) {
        Notification notification = new Notification();
        notification.setPickup(Pickup);
        notification.setDropup(Dropup);
        notification.setFare(Fare);
        notificationRepository.save(notification);
        template.convertAndSend("/topic/greeting", notification);
    }

    @GetMapping(value = "/send/allMessage")
    public List<Notification> getAll() {
        List<Notification> notification = new ArrayList<>();
        notification = notificationRepository.findAll();
        return notification;
    }
        @Scheduled(fixedRate = 3000)
        public void publishUpdates() {
        template.convertAndSend("/topic/greeting", "Message: Hello!!!");
//        template.convertAndSend("/topic/greeting", greetingService.getMessage());
    }

}
