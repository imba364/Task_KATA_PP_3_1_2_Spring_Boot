package web.config.task_kata_pp_3_1_2_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;
import web.config.task_kata_pp_3_1_2_spring_boot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
