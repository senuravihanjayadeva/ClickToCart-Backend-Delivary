package com.example.clicktocartbackenddelivary.service;
import com.example.clicktocartbackenddelivary.model.DeliveryItem;
import com.example.clicktocartbackenddelivary.repository.DeliveryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryItemService {
    @Autowired
    private DeliveryItemRepository deliveryItemRepository;

    public DeliveryItem addDeliveryItem(DeliveryItem deliveryItem) {
        return deliveryItemRepository.save(deliveryItem);
    }
    public List<DeliveryItem> addDeliveryItems(List<DeliveryItem> deliveryItems){
        return deliveryItemRepository.saveAll(deliveryItems);
    }
    public List<DeliveryItem> getAllDeliveyItems() {
        return deliveryItemRepository.findAll();
    }
    public DeliveryItem getDeliveryItemById(int id) {
        return deliveryItemRepository.findById(id).orElse(null);
    }
    public String deleteDeliveryItemByID(int id) {
        deliveryItemRepository.deleteById(id);
        return "Record deleted";
    }
}
