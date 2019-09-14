package com.yakki1.model;

import org.springframework.format.datetime.standard.DateTimeContext;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private Date dateAdded;
    private Date dateUpdated;
    private String asins;
    private String brand;
    private String categories;
    private String primaryCategories;
    private String imageURLs;
    private String keys;
    private String manufacturer;
    private String manufacturerNumber;
    private String sourceURLs;

    public Product() {
        super();
    }

    public Product(String id, String name, String brand, String primaryCategories, String manufacturer, String manufacturerNumber) {
        super();
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.primaryCategories = primaryCategories;
        this.manufacturer = manufacturer;
        this.manufacturerNumber = manufacturerNumber;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name: " + this.name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getAsins() {
        return asins;
    }

    public void setAsins(String asins) {
        this.asins = asins;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getPrimaryCategories() {
        return primaryCategories;
    }

    public void setPrimaryCategories(String primaryCategories) {
        this.primaryCategories = primaryCategories;
    }

    public String getImageURLs() {
        return imageURLs;
    }

    public void setImageURLs(String imageURLs) {
        this.imageURLs = imageURLs;
    }

    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerNumber() {
        return manufacturerNumber;
    }

    public void setManufacturerNumber(String manufacturerNumber) {
        this.manufacturerNumber = manufacturerNumber;
    }

    public String getSourceURLs() {
        return sourceURLs;
    }

    public void setSourceURLs(String sourceURLs) {
        this.sourceURLs = sourceURLs;
    }

}
