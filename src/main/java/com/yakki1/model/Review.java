package com.yakki1.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class Review implements Serializable {
    private static final long serialVersionUID = 1L;

    private String auto_id;
    private String productid;
    private Date date;
    private Date dateSeen;
    private String didPurchase;
    private String doRecommend;
    private BigInteger id;
    private Integer numHelpful;
    private Integer rating;
    private String sourceURLs;
    private String text;
    private String title;
    private String username;

    public Review() {
        super();
    }

    public Review(String productid, Date date, Integer rating, String title, String text, String username, String didPurchase, String doRecommend) {
        super();
        this.productid = productid;
        this.date = date;
        this.rating = rating;
        this.title = title;
        this.text = text;
        this.username = username;
        this.doRecommend = doRecommend;
        this.didPurchase = didPurchase;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "productid: " + this.productid + ", title: "+ this.title + ", text: "+ this.text + ", rating: "+String.valueOf(rating);
    }

    public String getAuto_id() {
        return auto_id;
    }

    public void setAuto_id(String auto_id) {
        this.auto_id = auto_id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDateSeen() {
        return dateSeen;
    }

    public void setDateSeen(Date dateSeen) {
        this.dateSeen = dateSeen;
    }

    public String getDidPurchase() {
        return didPurchase;
    }

    public void setDidPurchase(String didPurchase) {
        this.didPurchase = didPurchase;
    }

    public String getDoRecommend() {
        return doRecommend;
    }

    public void setDoRecommend(String doRecommend) {
        this.doRecommend = doRecommend;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public Integer getNumHelpful() {
        return numHelpful;
    }

    public void setNumHelpful(Integer numHelpful) {
        this.numHelpful = numHelpful;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getSourceURLs() {
        return sourceURLs;
    }

    public void setSourceURLs(String sourceURLs) {
        this.sourceURLs = sourceURLs;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
