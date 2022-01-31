package ru.windwail.studentapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.windwail.studentapp.entity.SystemUser;

public interface UserRepository extends JpaRepository<SystemUser, Long> {

    SystemUser findByLogin(String login);
}
