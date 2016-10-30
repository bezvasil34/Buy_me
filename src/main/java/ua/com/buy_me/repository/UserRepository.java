package ua.com.buy_me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.buy_me.entity.User;

import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUsername(String username);

    @Query(value = "select u from User u left join fetch u.commodities c where u.id =:id")
    User findfetchUser(@Param("id") int id);

}
