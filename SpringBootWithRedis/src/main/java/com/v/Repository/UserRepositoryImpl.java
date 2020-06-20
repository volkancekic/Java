package com.v.Repository;

import com.v.Model.User;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private RedisTemplate<Integer,User> redisTemplate;
    private HashOperations hashOperations;
    //autowired yerine bunu kullandik
    public UserRepositoryImpl(RedisTemplate<Integer,User> redisTemplate){
        this.redisTemplate=redisTemplate;
        hashOperations=redisTemplate.opsForHash();
    }

    @Override
    public void save(User user) {
        hashOperations.put("USERS",user.getId(),user); //hashmap yoksa olusuyor burada
    }

    @Override
    public Map<Integer, User> findAll() {
        return hashOperations.entries(("USERS"));
    }

    @Override
    public void update(User user) {
        save(user);
    }

    @Override
    public void delete(Integer id) {
        hashOperations.delete("USERS",id);
    }

    @Override
    public User findById(Integer id) {
        return (User) hashOperations.get("USERS",id);
    }
}
