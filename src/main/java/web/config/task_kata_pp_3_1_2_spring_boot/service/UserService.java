package web.config.task_kata_pp_3_1_2_spring_boot.service;

import web.config.task_kata_pp_3_1_2_spring_boot.model.User;
import java.util.List;

public interface UserService {
    void create(User usr);
    Iterable<User> getAllUsers();
    void update(User usr);
    void delete(User usr);
}
