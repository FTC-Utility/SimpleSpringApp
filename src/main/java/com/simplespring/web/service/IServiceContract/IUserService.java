package com.simplespring.web.service.IServiceContract;

import com.simplespring.web.model.User;

import java.util.List;

/**
 * Created by Eyuel Tadesse on 12/15/2016.
 */
public interface IUserService {
    User getUserId(String id);
    List<User> findAll();
    User createUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
    User findUserByEmail(String username);
    boolean authenticate(User user);
}
