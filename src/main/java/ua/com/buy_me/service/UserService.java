package ua.com.buy_me.service;

import ua.com.buy_me.entity.User;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface UserService {

    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void delete(int id);

}
