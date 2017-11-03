package com.dan.stockapp.Repository;

import com.dan.stockapp.model.UserPersistence;

/**
 * Created By Dan on 2017/10/22
 */
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserPersistence, Integer>{
    public UserPersistence findByUserName(String userName);
}
