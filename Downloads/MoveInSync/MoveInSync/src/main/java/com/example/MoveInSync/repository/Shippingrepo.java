package com.example.MoveInSync.repository;

import com.example.MoveInSync.entity.Purchasepojo;
import com.example.MoveInSync.entity.Shippingpojo;
import org.springframework.data.repository.CrudRepository;

public interface Shippingrepo extends CrudRepository<Shippingpojo, Integer> {
}
