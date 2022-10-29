package com.example.MoveInSync.controller;

import com.example.MoveInSync.entity.Purchasepojo;
import com.example.MoveInSync.entity.Shippingpojo;
import com.example.MoveInSync.repository.Purchaserepo;
import com.example.MoveInSync.repository.Shippingrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Shipping {
    @Autowired
    public Shippingrepo repository;
    @PostMapping
    @ResponseBody
    @RequestMapping(path="/shipp")
    public String postBody(@RequestBody Shippingpojo customer) {

          repository.save(customer);


        return "AddedSuccesfully";

    }
}
