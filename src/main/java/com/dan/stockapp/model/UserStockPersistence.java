package com.dan.stockapp.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created By Dan on 2017/10/31
 */
public class UserStockPersistence {
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<StockPersistence> getStocks() {
        return stocks;
    }

    public void setStocks(Set<StockPersistence> stocks) {
        this.stocks = stocks;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    private  String userName;
    private  String password;
    private Set<StockPersistence> stocks = new HashSet<StockPersistence>();
    private int stockId;
    private String stockName;
    private Double stockPrice;

    public int getDeleteStockId() {
        return deleteStockId;
    }

    public void setDeleteStockId(int deleteStockId) {
        this.deleteStockId = deleteStockId;
    }

    private  int deleteStockId;
}
