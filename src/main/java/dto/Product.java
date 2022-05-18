package dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomnyson
 */
public class Product {
   private String name;
   private String description;
   private double price;
   private boolean status;
   // ham khoi tao
    public Product() {
    }
    
    public Product(String name, String des, double price, boolean status) {
        this.name = name;
        this.description = des;
        this.price = price;
        this.status = status;
    }
    // get/set
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public  void xuatThongTin() {
        System.out.println("Name: " + this.name + "Price: " + this.price);
    }
}
