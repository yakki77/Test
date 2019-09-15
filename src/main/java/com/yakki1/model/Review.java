package com.yakki1.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class Review implements Serializable {
    private static final long serialVersionUID = 1L;

    private String autoid;
    private String itemid;
    private Date date;
    private String dateSeen;
    private Boolean didPurchase;
    private Boolean doRecommend;
    private BigInteger reviewid;
    private Integer numHelpful;
    private Integer rating;
    private String sourceURLs;
    private String text;
    private String title;
    private String username;

    public Review() {
        super();
    }

    public Review(String itemid, Date date, Integer rating, String title, String text, String username, Boolean didPurchase, Boolean doRecommend) {
        super();
        this.itemid = itemid;
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
        return "productid: " + this.itemid + ", title: "+ this.title + ", text: "+ this.text + ", rating: "+String.valueOf(rating);
    }

    public String getAutoid() {
        return autoid;
    }

    public void setAutoid(String autoid) {
        this.autoid = autoid;
    }

    public String getProductid() {
        return itemid;
    }

    public void setProductid(String itemid) {
        this.itemid = itemid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateSeen() {
        return dateSeen;
    }

    public void setDateSeen(String dateSeen) {
        this.dateSeen = dateSeen;
    }

    public Boolean getDidPurchase() {
        return didPurchase;
    }

    public void setDidPurchase(Boolean didPurchase) {
        this.didPurchase = didPurchase;
    }

    public Boolean getDoRecommend() {
        return doRecommend;
    }

    public void setDoRecommend(Boolean doRecommend) {
        this.doRecommend = doRecommend;
    }

    public BigInteger getReviewid() {
        return reviewid;
    }

    public void setReviewid(BigInteger reviewid) {
        this.reviewid = reviewid;
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
