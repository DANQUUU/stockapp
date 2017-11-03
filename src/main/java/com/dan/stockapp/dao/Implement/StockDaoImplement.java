package com.dan.stockapp.dao.Implement;

import com.dan.stockapp.dao.StockDao;
import com.dan.stockapp.model.StockPersistence;
import com.dan.stockapp.model.UserPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created By Dan on 2017/10/25
 */

@Repository("stockDao")
@Transactional(propagation = Propagation.REQUIRED)
public class StockDaoImplement implements StockDao{

    Logger log= LoggerFactory.getLogger(StockDaoImplement.class);
    @PersistenceContext
    private EntityManager entityManager;
    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public StockPersistence insertStock(StockPersistence stockPersistence) {
        log.info("Insert data for{}",stockPersistence.getStockName());
        entityManager.persist(stockPersistence);
        entityManager.flush();
        log.info("StockId genarted:{}", stockPersistence.getStockId());
        return stockPersistence;
    }

    @Override
    public StockPersistence updateStock(int stockId, String stockName) {
        StockPersistence stockPersistence = entityManager.find(StockPersistence.class, stockId);
        //person.setName(name);
        entityManager.persist(stockPersistence);
        return stockPersistence;
    }

    @Override
    public int deleteStock(int stockId) {
        return 0;
    }

    @Override
    public StockPersistence fetchStockByStockId(int stockId) {
        return null;
    }

    @Override
    public List<StockPersistence> fetchAllStock() {
        return null;
    }

    @Override
    public List<StockPersistence> getStockByUserId(int userId) {

        return null;
    }
}
