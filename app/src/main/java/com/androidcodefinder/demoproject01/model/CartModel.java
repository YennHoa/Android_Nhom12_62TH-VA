package com.androidcodefinder.demoproject01.model;

public class CartModel {
    String Name;
    int Quantity, Image;
    double Price, Tax, Total;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double Tax) {
        Price = Tax;
    }
    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        Price = Total;
    }
}
