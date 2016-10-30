package ua.com.buy_me.service;

import org.springframework.web.multipart.MultipartFile;
import ua.com.buy_me.entity.User;

import java.security.Principal;
import java.util.List;

/**
 * Created by koko on 16.10.16.
 */
public interface UserService {

    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void delete(int id);
    User findUserFetch(int id);
    void saveImage(Principal principal, MultipartFile multipartFile);
    void getOrder(Principal principal, String commodityId, String quantity);
    void deleteCommodityFromUser(Principal principal, String id);

}
