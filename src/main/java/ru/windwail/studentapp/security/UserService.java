package ru.windwail.studentapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.windwail.studentapp.entity.SystemUser;
import ru.windwail.studentapp.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public SystemUser findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

}
