package com.example.springbootdemo.controller;
import com.example.springbootdemo.entity.Supplier;
import com.example.springbootdemo.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Service;


import java.util.List;


@RestController

public class SupplierController {
    @Autowired
    SupplierServiceImpl supplierServiceImpl;

    @GetMapping("/supplierList")
    public List<Supplier> queryAll() {
        return supplierServiceImpl.SupplierList();
    }
}
