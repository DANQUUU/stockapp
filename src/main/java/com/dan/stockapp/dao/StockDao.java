package com.dan.stockapp.dao;

import com.dan.stockapp.model.StockPersistence;


import java.util.List;

/**
 * Created By Dan on 2017/10/25
 */
public interface StockDao {
    public StockPersistence insertStock(StockPersistence stockPersistence);
    public StockPersistence updateStock(int stockId, String stockName);
    public int deleteStock(int stockId);
    public StockPersistence fetchStockByStockId(int stockId);
    public List<StockPersistence> fetchAllStock();
    public List<StockPersistence> getStockByStockName(String stockName);
}
