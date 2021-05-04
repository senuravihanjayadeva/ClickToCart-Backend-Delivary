package com.example.clicktocartbackenddelivary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "deliveryitem_tbl")
public class DeliveryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int qty;
    private double price;
    private int itemID;
    @ManyToOne
    @JoinColumn(name="deliveryId")
    private Delivery delivery;

    @JsonBackReference
    public Delivery getDelivery() {
        return delivery;
    }
}
