package com.example.onlineshop.model;

public class Products {

    String ProductName;
    Integer ProductID;
    String ProductQty;
    String ProductPrice;
    Integer ImageUrl;

    public Products(String productName, Integer productID, String productQty, String productPrice, Integer imageUrl) {
        ProductName = productName;
        ProductID = productID;
        ProductQty = productQty;
        ProductPrice = productPrice;
        ImageUrl = imageUrl;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Integer getProductID() {
        return ProductID;
    }

    public void setProductID(Integer productID) {
        ProductID = productID;
    }

    public String getProductQty() {
        return ProductQty;
    }

    public void setProductQty(String productQty) {
        ProductQty = productQty;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String productPrice) {
        ProductPrice = productPrice;
    }

    public Integer getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        ImageUrl = imageUrl;
    }
}
