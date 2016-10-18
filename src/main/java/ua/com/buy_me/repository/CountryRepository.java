package ua.com.buy_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.buy_me.entity.Country;

/**
 * Created by koko on 16.10.16.
 */
public interface CountryRepository extends JpaRepository<Country, Integer>{
}
