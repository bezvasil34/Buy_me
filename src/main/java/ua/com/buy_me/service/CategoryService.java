package ua.com.buy_me.service;

import ua.com.buy_me.entity.Category;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
    Category findOne(int id);
    void delete(int id);

}
