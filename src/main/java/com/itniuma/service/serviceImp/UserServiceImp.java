package com.itniuma.service.serviceImp;

import com.itniuma.dao.UserDao;
import com.itniuma.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp  {
    @Autowired(required = false)
    private UserDao userDao;
    public List<User> selectAll() {
        return userDao.selectAllUser();
    }
    public List<User> selectBySingleInfo(String userName) {
        return userDao.selectBySingleInfo(userName);
    }
    public void updateUser(User user){userDao.updateUser(user);}
    public void addUser(User user) {
        userDao.addUser(user);
    }

    public void delete(Integer id) {
        userDao.deleteById(id);
    }
    public User selectById(Integer id){
        return userDao.selectById(id);
    }
}
