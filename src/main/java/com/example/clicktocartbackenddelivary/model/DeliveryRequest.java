package com.example.clicktocartbackenddelivary.model;

import java.util.List;

public class DeliveryRequest {

    private Delivery delivery;

    private List<DeliveryItem> deliveryItemList;

    public DeliveryRequest() {
    }

    public DeliveryRequest(Delivery delivery, List<DeliveryItem> deliveryItemList) {
        this.delivery = delivery;
        this.deliveryItemList = deliveryItemList;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public List<DeliveryItem> getDeliveryItemList() {
        return deliveryItemList;
    }

    public void setDeliveryItemList(List<DeliveryItem> deliveryItemList) {
        this.deliveryItemList = deliveryItemList;
    }
}
