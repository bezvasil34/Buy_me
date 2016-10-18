package ua.com.buy_me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.buy_me.entity.Country;
import ua.com.buy_me.repository.CountryRepository;
import ua.com.buy_me.service.CommodityService;
import ua.com.buy_me.service.CountryService;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void save(Country country) {
        countryRepository.save(country);
    }

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country findOne(int id) {
        return countryRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        countryRepository.delete(id);
    }
}
