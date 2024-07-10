package web.config.task_kata_pp_3_1_2_spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.task_kata_pp_3_1_2_spring_boot.model.User;
import web.config.task_kata_pp_3_1_2_spring_boot.repository.UserRepository;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userDao;
    @Override
    public void create(User usr) {
        userDao.save(usr);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public void update(User usr) {
        userDao.save(usr);
    }

    @Override

    public void delete(User usr) {
        userDao.delete(usr);
    }
}
