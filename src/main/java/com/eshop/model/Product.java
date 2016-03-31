package com.eshop.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.List;

/**
 * Created by cicctusers on 2/25/2016.
 */

@Entity
public class Product implements Serializable{

    //need to install serializable plugin

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;

    @NotEmpty (message="The product name must not be null.")
    private String productName;
    private String productCategory;
    private String productDescription;

    @Min(value=0, message="The product price must no be lesser than zero.")
    private double productPrice;
    private String productCondition;
    private String productStatus;

    @Min(value=0, message="The product unit must no be lesser than zero.")
    private int unitInStock;
    private String productManufacturer;

    @Transient
    private MultipartFile productImage;

    /*@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItemList;*/

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getProductPrice() {

        return productPrice;
    }

    public void setProductPrice(double productPrice) {

        this.productPrice = productPrice;
    }

    public String getProductCondition() {

        return productCondition;
    }

    public void setProductCondition(String productCondition) {
        this.productCondition = productCondition;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public MultipartFile getProductImage() {
        return productImage;
    }

    public void setProductImage(MultipartFile productImage) {
        this.productImage = productImage;
    }
}
