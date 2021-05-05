package com.example.clicktocartbackenddelivary.controller;

import com.example.clicktocartbackenddelivary.model.DeliveryItem;
import com.example.clicktocartbackenddelivary.service.DeliveryItemService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/deliveryitem")
public class DeliveryItemController{

    @Autowired
    DeliveryItemService deliveryItemService;

    @PostMapping("/addDeliveryItem")
    public DeliveryItem addDeliveryItem (@RequestBody DeliveryItem deliveryItem){
        return deliveryItemService.addDeliveryItem(deliveryItem);
    }

    @PostMapping("/{deliveryid}")
    public List<DeliveryItem> addDeliveryItems(@RequestBody List<DeliveryItem> deliveryItems, @PathVariable int deliveryid){
        return deliveryItemService.addDeliveryItems(deliveryItems,deliveryid);
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
    public String deleteDeliveryItemById(@PathVariable int id){
        return deliveryItemService.deleteDeliveryItemByID(id);
    }
}