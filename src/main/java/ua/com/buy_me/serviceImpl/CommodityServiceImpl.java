package ua.com.buy_me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.buy_me.entity.Commodity;
import ua.com.buy_me.repository.CommodityRepository;
import ua.com.buy_me.service.CommodityService;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
@Service
public class CommodityServiceImpl implements CommodityService{

    @Autowired
    private CommodityRepository commodityRepository;

    @Override
    public void save(Commodity commodity) {
        commodityRepository.save(commodity);
    }

    @Override
    public List<Commodity> findAll() {
        return commodityRepository.findAll();
    }

    @Override
    public Commodity findOne(int id) {
        return commodityRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        commodityRepository.delete(id);
    }
}
