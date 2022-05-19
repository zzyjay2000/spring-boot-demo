package com.example.springbootdemo.mapper;
import com.example.springbootdemo.entity.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface SupplierMapper {
    @Select("select * from supplier")
    List<Supplier> supplierList();


}
