package ua.com.buy_me.service;

import ua.com.buy_me.entity.Country;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface CountryService {

    void save(Country country);
    List<Country> findAll();
    Country findOne(int id);
    void delete(int id);

}
