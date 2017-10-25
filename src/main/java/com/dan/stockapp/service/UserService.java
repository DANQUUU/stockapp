package com.dan.stockapp.service;

import com.dan.stockapp.Repository.UserRepository;
//import com.dan.stockapp.dao.StockDao;
import com.dan.stockapp.dao.UserDao;
import com.dan.stockapp.model.Stock;
import com.dan.stockapp.model.StockPersistence;
import com.dan.stockapp.model.User;
import com.dan.stockapp.model.UserPersistence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created By Dan on 2017/10/21
 */
@Service
public class UserService {

    UserRepository userRepository;
    @Autowired
    UserDao userDao;
//    @Autowired
//    StockDao stockDao;

    Logger log = LoggerFactory.getLogger(UserService.class);

    public User createUser(User user) {
        return user;
    }

    public UserPersistence createUser(UserPersistence userObj) {

        return userDao.insertUser(userObj);
    }

//    public Stock createStock(Stock stock) {
//        return stock;
//    }
//    public StockPersistence createStock(StockPersistence stockObj) {
//
//        return stockDao.insertStock(stockObj);
//    }


    public UserPersistence findByUserId(int userId) {
        log.info("Fetching data for{}", userId);
        UserPersistence userPersistence = userRepository.findOne(userId);
        return userPersistence;
    }

    public List<UserPersistence> findAllUser() {
        log.info("Fetching all User records");
        return (List<UserPersistence>) userRepository.findAll();
    }

    public List<UserPersistence> getUserByUserName(String userName) {
        return userRepository.findByUserName(userName);

    }

    public UserPersistence updateUser(int userId, String userName) {
        return userDao.updateUser(userId, userName);
    }
}
