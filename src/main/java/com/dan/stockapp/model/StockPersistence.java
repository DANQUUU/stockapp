package com.dan.stockapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By Dan on 2017/10/22
 */


@Entity
@Table(name = "STOCKPRICE")

public class StockPersistence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="STOCKID")
    private int stockId;

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    @Column(name="STOCKNAME")
    private String stockName;
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }


    @Column(name="STOCKPRICE")
    private Double stockPrice;

    public Double getStockPrice() {
        return stockPrice;
    }
    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }


    @ManyToMany(mappedBy = "stocks")
    @JsonIgnore
    private Set<UserPersistence> userPersistenceSet = new HashSet<>();

    public Set<UserPersistence> getUserPersistenceSet() {
        return userPersistenceSet;
    }

    public void setUserPersistenceSet(Set<UserPersistence> userPersistenceSet) {
        this.userPersistenceSet = userPersistenceSet;
    }

}
