package ua.com.buy_me.service;

import ua.com.buy_me.entity.Commodity;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface CommodityService {

    void save(Commodity commodity);
    List<Commodity> findAll();
    Commodity findOne(int id);
    void delete(int id);

}
