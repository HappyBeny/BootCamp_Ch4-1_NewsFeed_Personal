package practice.ch4_1_newsfeed_personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.ch4_1_newsfeed_personal.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
