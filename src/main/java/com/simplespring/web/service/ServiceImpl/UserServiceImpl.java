package com.simplespring.web.service.ServiceImpl;

import com.simplespring.web.dao.IDao.IUserDao;
import com.simplespring.web.model.User;
import com.simplespring.web.service.IServiceContract.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Eyuel Tadesse on 12/15/2016.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    @Override
    public User getUserId(String id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        createUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userDao.findUserByEmail(email);
    }

    @Override
    public boolean authenticate(User user) {
        return false;
    }
}
