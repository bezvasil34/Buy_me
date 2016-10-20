package ua.com.buy_me.service;

import ua.com.buy_me.entity.SubCategory;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface SubCategoryService {

    void save(SubCategory subCategory);
    List<SubCategory> findAll();
    List<SubCategory> findAllfetch();
    SubCategory findOne(int id);
    void delete(int id);
    SubCategory findByName(String name);


}
