package com.example.springbootdemo.service.impl;
import  com.example.springbootdemo.entity.Supplier;
import com.example.springbootdemo.mapper.SupplierMapper;
import com.example.springbootdemo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;

    @Override
    public List<Supplier> SupplierList(){
        return supplierMapper.supplierList();
    }
}
