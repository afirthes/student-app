package ru.windwail.studentapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.windwail.studentapp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
