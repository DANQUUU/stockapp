package com.dan.stockapp.Repository;

import com.dan.stockapp.model.UserPersistence;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created By Dan on 2017/10/22
 */
public interface UserRepository extends CrudRepository<UserPersistence, Integer> {
    public List<UserPersistence> findByUserName(String name);
}
