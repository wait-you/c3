package cn.wenhe9.anotation.dao.impl;

import cn.wenhe9.anotation.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("userDao");
    }
}
