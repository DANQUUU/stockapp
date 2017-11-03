package com.dan.stockapp.dao;

import com.dan.stockapp.model.StockPersistence;
import com.dan.stockapp.model.UserPersistence;

import java.util.List;

/**
 * Created By Dan on 2017/10/22
 */
public interface UserDao {
    public UserPersistence insertUser(UserPersistence userPersistence);
    public UserPersistence updateUser(int userId, StockPersistence stockPersistence);
    public int deleteUser(int userId);
    public UserPersistence fetchUserByUserId(int userId);
    public List<UserPersistence> fetchAllUser();
    public List<UserPersistence> getUserByUserName(String userName);
}
