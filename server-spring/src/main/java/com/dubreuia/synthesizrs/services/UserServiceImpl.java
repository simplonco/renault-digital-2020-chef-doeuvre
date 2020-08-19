package com.dubreuia.synthesizrs.services;

import com.dubreuia.synthesizrs.model.Role;
import com.dubreuia.synthesizrs.model.User;
import com.dubreuia.synthesizrs.repositories.RoleRepository;
import com.dubreuia.synthesizrs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    public void verifyUser(String username, String password) {
        UserDetails user = userDetailsService.loadUserByUsername(username);
        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("bad credentials " + username);
        }
    }

    @Override
    public void registerUser(String username, String password) {
        Role roleUser = roleRepository.findById("USER").orElseThrow();
        User user = new User(username, passwordEncoder.encode(password), true, roleUser);
        userRepository.save(user);
    }

}
