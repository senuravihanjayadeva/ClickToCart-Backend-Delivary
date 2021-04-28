package com.example.clicktocartbackenddelivary.controller;


import com.example.clicktocartbackenddelivary.model.Delivery;
import com.example.clicktocartbackenddelivary.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @Autowired
    DeliveryService deliveryService;

    @PostMapping
//    @PreAuthorize("hasRole('MODERATOR')")
    public Delivery addDelivery (@RequestBody Delivery delivery){
        return deliveryService.addDelivery(delivery);
    }

    @GetMapping
    public List<Delivery> getAllDeliveries(){
        return deliveryService.getAllDeliveries();
    }

    @GetMapping("/{id}")
    public Delivery getDeliveryById(@PathVariable int id){
        return deliveryService.getDeliveryById(id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('MODERATOR')")
    public String deleteDeliveryItemById(@PathVariable int id){
        return deliveryService.deleteDeliveryByID(id);
    }
}
