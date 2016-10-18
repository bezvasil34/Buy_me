package ua.com.buy_me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.buy_me.entity.SubCategory;
import ua.com.buy_me.repository.SubCategoryRepository;
import ua.com.buy_me.service.SubCategoryService;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
@Service
public class SubCategoryServiceImpl implements SubCategoryService{

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Override
    public void save(SubCategory subCategory) {
        subCategoryRepository.save(subCategory);
    }

    @Override
    public List<SubCategory> findAll() {
        return subCategoryRepository.findAll();
    }

    @Override
    public List<SubCategory> findAllfetch() {
        return subCategoryRepository.findSubCategoryFetch();
    }

    @Override
    public SubCategory findOne(int id) {
        return subCategoryRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        subCategoryRepository.delete(id);
    }
}
