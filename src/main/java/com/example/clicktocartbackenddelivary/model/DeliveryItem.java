package com.example.clicktocartbackenddelivary.model;

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
    private int delID;
    @ManyToOne
    @JoinColumn(name="deliveryId")
    private Delivery delivery;
}
