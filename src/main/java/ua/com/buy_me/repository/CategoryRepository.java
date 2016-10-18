package ua.com.buy_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.buy_me.entity.Category;

/**
 * Created by koko on 16.10.16.
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
