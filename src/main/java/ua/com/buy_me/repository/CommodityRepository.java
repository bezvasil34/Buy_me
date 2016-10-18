package ua.com.buy_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.buy_me.entity.Commodity;

/**
 * Created by koko on 16.10.16.
 */
public interface CommodityRepository extends JpaRepository<Commodity, Integer> {
}
