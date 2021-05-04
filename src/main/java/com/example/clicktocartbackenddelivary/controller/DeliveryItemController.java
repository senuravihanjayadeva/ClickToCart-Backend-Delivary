package com.example.clicktocartbackenddelivary.controller;


import com.example.clicktocartbackenddelivary.model.DeliveryItem;
import com.example.clicktocartbackenddelivary.service.DeliveryItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/deliveryItem")
public class DeliveryItemController{

    @Autowired
    DeliveryItemService deliveryItemService;

    @PostMapping("/addDeliveryItem")
//    @PreAuthorize("hasRole('MODERATOR')")
    public DeliveryItem addDeliveryItem (@RequestBody DeliveryItem deliveryItem){
        return deliveryItemService.addDeliveryItem(deliveryItem);
    }

    @PostMapping
//    @PreAuthorize("hasRole('MODERATOR')")
    public List<DeliveryItem> addQuestions(@RequestBody List<DeliveryItem> deliveryItems){
        return deliveryItemService.addDeliveryItems(deliveryItems);
    }

    @GetMapping
    public List<DeliveryItem> getAllDeliveryItems(){
        return deliveryItemService.getAllDeliveyItems();
    }

    @GetMapping("/{id}")
    public DeliveryItem getDeliveryItemBuId(@PathVariable int id){
        return deliveryItemService.getDeliveryItemById(id);
    }

    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('MODERATOR')")
    public String deleteDeliveryItemById(@PathVariable int id){
        return deliveryItemService.deleteDeliveryItemByID(id);
    }
}