package com.dan.stockapp.Repository;

import com.dan.stockapp.model.Stock;
import com.dan.stockapp.model.StockPersistence;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Dan on 2017/10/24
 */
public interface StockRepository extends JpaRepository<StockPersistence, Integer> {
}
