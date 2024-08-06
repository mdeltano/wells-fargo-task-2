package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;;

@Entity
public class Security {
    @Id
    @GeneratedValue
    private long securityId;

    @Column(nullable=false)
    private String secName;
    
    @Column(nullable=false)
    private String secCat;

    @Column(nullable=false)
    private Date purchaseDate;

    @Column(nullable=false)
    private float purchasePrice;

    @Column(nullable=false)
    private int quantity;

    @Column(nullable=false)
    private long portfolioId;

    protected Security() {

    }

    public Security(long portfolio, String secN, String secC, Date purchase, float price, int quant) {
        this.portfolioId = portfolio;
        this.secName = secN;
        this.secCat = secC;
        this.purchaseDate = purchase;
        this.purchasePrice = price;
        this.quantity = quant;
    }

    public long getSecurityId() {
        return this.securityId;
    }

    public String getSecName() {
        return this.secName;
    }

    public String getSecCategory() {
        return this.secCat;
    }

    public Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public float getPurchasePrice() {
        return this.purchasePrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public long getPortfolioId() {
        return this.portfolioId;
    }

    public void setSecName(String sec) {
        this.secName = sec;
    }

    public void setSecCategory(String sec) {
        this.secCat = sec;
    }

    public void setPurchaseDate(Date date) {
        this.purchaseDate = date;
    }

    public void setPurchasePrice(float price) {
        this.purchasePrice = price;
    }

    public void setQuantity(int quant) {
        this.quantity = quant;
    }

    public void setPortfolio(long port) {
        this.portfolioId = port;
    }
    
}
