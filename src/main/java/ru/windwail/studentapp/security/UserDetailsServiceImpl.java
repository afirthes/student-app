package ru.windwail.studentapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.windwail.studentapp.entity.Role;
import ru.windwail.studentapp.entity.SystemUser;
import ru.windwail.studentapp.repositories.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SystemUser su = userService.findByLogin(s);
        if (su == null) {
            throw new UsernameNotFoundException("User not found");
        }

        Set<SimpleGrantedAuthority> authorities = new HashSet<>();

        for(Role role: su.getRoles()) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }

        return new User(s, su.getPassword(), authorities);
    }
}
