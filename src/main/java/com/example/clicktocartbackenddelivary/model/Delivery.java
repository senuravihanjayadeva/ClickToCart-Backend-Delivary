package com.example.clicktocartbackenddelivary.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "delivery_tbl")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private String phonenumber;
    private Date paymentdate;
    private String cusName;
    private String cusID;
    //bi-directional one-to-many
    //orphanRemoval- Remove All the questions when QuestionPool Removed
    @OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST,mappedBy = "delivery")
    private List<DeliveryItem> deliveryItems;

    @JsonManagedReference
    public List<DeliveryItem> getDeliveryItems() {
        return deliveryItems;
    }
}
