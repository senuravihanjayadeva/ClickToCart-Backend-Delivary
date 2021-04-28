package com.example.clicktocartbackenddelivary.repository;

import com.example.clicktocartbackenddelivary.model.DeliveryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface DeliveryItemRepository extends JpaRepository<DeliveryItem,Integer> {

}
