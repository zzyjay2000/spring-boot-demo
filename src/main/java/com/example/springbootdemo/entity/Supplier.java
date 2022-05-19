package com.example.springbootdemo.entity;

public class Supplier {
    private Integer SupplierId;
    private String SupplierName;
    private Integer SupplierCount;
    private String SupplierPerson;

    public Integer getSupplierId() {
        return SupplierId;
    }

    public void setId(Integer SupplierId) {
        this.SupplierId = SupplierId;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierName = SupplierName;
    }

    public Integer getSupplierCount() {
        return SupplierCount;
    }

    public void setCount(Integer SupplierCount) {
        this.SupplierCount = SupplierCount;
    }

    public  String getSupplierPerson(){
        return SupplierPerson;
    }

    public void setSupplierPerson(String SupplierPerson){
        this.SupplierPerson= SupplierPerson;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + SupplierId +
                ", SupplierName='" + SupplierName + '\'' +
                ", SupplierCount='" + SupplierCount+ '\'' +
                ", SupplierPerson='" + SupplierPerson + '\'' +
                '}';
    }

}

