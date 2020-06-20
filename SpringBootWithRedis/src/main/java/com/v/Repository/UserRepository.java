package com.v.Repository;

import com.v.Model.User;

import java.util.Map;

public interface UserRepository {
    void save(User user);
    Map<Integer,User> findAll();
    void update(User user);
    void delete (Integer id);
    User findById(Integer id);
}
