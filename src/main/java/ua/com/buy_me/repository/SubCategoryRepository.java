package ua.com.buy_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.buy_me.entity.SubCategory;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface SubCategoryRepository extends JpaRepository<SubCategory, Integer>{


    @Query("select sc from SubCategory sc join fetch sc.category c")
    List<SubCategory> findSubCategoryFetch();

    @Query("select sc from SubCategory sc where sc.name =:name")
    SubCategory findByName(@Param(value = "name") String name);

}
