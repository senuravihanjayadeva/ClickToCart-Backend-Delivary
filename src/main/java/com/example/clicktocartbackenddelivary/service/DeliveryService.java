package com.example.clicktocartbackenddelivary.service;

import com.example.clicktocartbackenddelivary.model.Delivery;
import com.example.clicktocartbackenddelivary.model.DeliveryItem;
import com.example.clicktocartbackenddelivary.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    @Autowired
    private DeliveryRepository deliveryRepository;

    public Delivery addDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public List<Delivery> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Delivery getDeliveryById(int id) {
        return deliveryRepository.findById(id).orElse(null);
    }

    public String deleteDeliveryByID(int id) {
        deliveryRepository.deleteById(id);
        return "Record deleted";
    }
}
