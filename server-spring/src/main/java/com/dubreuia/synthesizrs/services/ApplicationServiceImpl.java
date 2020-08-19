package com.dubreuia.synthesizrs.services;

import com.dubreuia.synthesizrs.model.Role;
import com.dubreuia.synthesizrs.model.Synthesizer;
import com.dubreuia.synthesizrs.model.User;
import com.dubreuia.synthesizrs.repositories.RoleRepository;
import com.dubreuia.synthesizrs.repositories.SynthesizerRepository;
import com.dubreuia.synthesizrs.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SynthesizerRepository synthesizerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void insertData() {
        Role user = new Role("USER");
        Role admin = new Role("ADMIN");
        roleRepository.save(user);
        roleRepository.save(admin);

        User adminUser = new User("admin", passwordEncoder.encode("supermotdepasse1!"), true, admin);
        userRepository.save(adminUser);

        synthesizerRepository.save(new Synthesizer("Juno-106", "Roland", "1984", adminUser, "1984-JUNO-106.jpeg"));
        synthesizerRepository.save(new Synthesizer("Synthesizer 1c/2c/3c", "Moog", "1964", adminUser, null));
    }

}
