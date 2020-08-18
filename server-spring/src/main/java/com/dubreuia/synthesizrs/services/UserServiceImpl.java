package com.dubreuia.synthesizrs.services;

import com.dubreuia.synthesizrs.model.User;
import com.dubreuia.synthesizrs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

}
