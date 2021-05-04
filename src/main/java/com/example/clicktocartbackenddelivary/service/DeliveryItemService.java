package com.example.clicktocartbackenddelivary.service;
import com.example.clicktocartbackenddelivary.model.Delivery;
import com.example.clicktocartbackenddelivary.model.DeliveryItem;
import com.example.clicktocartbackenddelivary.repository.DeliveryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeliveryItemService {
    @Autowired
    private DeliveryItemRepository deliveryItemRepository;

    public DeliveryItem addDeliveryItem(DeliveryItem deliveryItem) {
        return deliveryItemRepository.save(deliveryItem);
    }

    public List<DeliveryItem> addDeliveryItems(List<DeliveryItem> deliveryItems, int deliveryid){
        Delivery delivery = new Delivery();
        List<DeliveryItem> deliveryItemList = new ArrayList<>();
        delivery.setId(deliveryid);
        for(DeliveryItem deliveryItem: deliveryItems){
            DeliveryItem newDeliveryItem = new DeliveryItem();
            newDeliveryItem.setItemId(deliveryItem.getItemId());
            newDeliveryItem.setQty(deliveryItem.getQty());
            newDeliveryItem.setTotalPrice(deliveryItem.getTotalPrice());
            newDeliveryItem.setDelivery(delivery);
            deliveryItemList.add(newDeliveryItem);
        }

        return deliveryItemRepository.saveAll(deliveryItemList);
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
