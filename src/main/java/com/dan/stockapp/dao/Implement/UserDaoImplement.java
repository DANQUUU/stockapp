package com.dan.stockapp.dao.Implement;

import com.dan.stockapp.dao.UserDao;
import com.dan.stockapp.model.StockPersistence;
import com.dan.stockapp.model.User;
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
 * Created By Dan on 2017/10/22
 */

@Repository("userDao")
@Transactional(propagation = Propagation.REQUIRED)
public class UserDaoImplement implements UserDao {

        Logger log= LoggerFactory.getLogger(UserDaoImplement.class);
        @PersistenceContext
        private EntityManager entityManager;
        public EntityManager getEntityManager() {
            return entityManager;
        }

        public void setEntityManager(EntityManager entityManager) {
            this.entityManager = entityManager;
        }

        @Override
        public UserPersistence insertUser(UserPersistence userPersistence) {
            // TODO Auto-generated method stub
            log.info("Insert data for{}",userPersistence.getUserName());
            entityManager.persist(userPersistence);
            entityManager.flush();
            log.info("PersonId genarted:{}", userPersistence.getUserId());
            return userPersistence;
        }


    @Override
        public UserPersistence updateUser(int userId, StockPersistence stockPersistence) {
            // TODO Auto-generated method stub
            UserPersistence userPersistence = entityManager.find(UserPersistence.class, userId);
            userPersistence.getStocks().add(stockPersistence);
            entityManager.persist(userPersistence);
            return userPersistence;
        }

        @Override
        public int deleteUser(int personId) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public UserPersistence fetchUserByUserId(int userId) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public List<UserPersistence> fetchAllUser() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public UserPersistence getUserByUserName(String userName) {
            // TODO Auto-generated method stub

            return null;
        }
}
