package com.customerorders.customerorders.entity;

public class Product {
    private Integer id;
    private String name;
    private String trademark;

    public Product() {

    }

    public Product(Integer id, String name, String trademark) {
        this.id = id;
        this.name = name;
        this.trademark = trademark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trademark='" + trademark + '\'' +
                '}';
    }
}