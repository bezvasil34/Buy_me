package ua.com.buy_me.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.buy_me.entity.Category;
import ua.com.buy_me.repository.CategoryRepository;
import ua.com.buy_me.service.CategoryService;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
@Service
public class CategoryServiceImpl  implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findOne(int id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        categoryRepository.delete(id);
    }
}
