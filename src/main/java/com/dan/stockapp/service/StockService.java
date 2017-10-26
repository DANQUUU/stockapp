package com.dan.stockapp.service;

import com.dan.stockapp.Repository.StockRepository;
import com.dan.stockapp.Repository.UserRepository;
import com.dan.stockapp.dao.StockDao;
import com.dan.stockapp.dao.UserDao;
import com.dan.stockapp.model.StockPersistence;
import com.dan.stockapp.model.User;
import com.dan.stockapp.model.UserPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Dan on 2017/10/25
 */

@Service
public class StockService {

    StockRepository stockRepository;
    @Autowired
    StockDao stockDao;

    Logger log = LoggerFactory.getLogger(StockService.class);

    public User createUser(User user) {
        return user;
    }

    public StockPersistence createStock(StockPersistence stockObj) {

        return stockDao.insertStock(stockObj);
    }


    public StockPersistence findByStockId(int stockId) {
        log.info("Fetching data for{}", stockId);
        StockPersistence stockPersistence = stockRepository.findOne(stockId);
        return stockPersistence;
    }

    public List<StockPersistence> findAllStock() {
        log.info("Fetching all User records");
        return (List<StockPersistence>) stockRepository.findAll();
    }

    public List<StockPersistence> getStockByStockName(String stockName) {
        return stockDao.getStockByStockName(stockName);
    }

    public StockPersistence updateStock(int stockId, String stockName) {
        return stockDao.updateStock(stockId, stockName);
    }
}
