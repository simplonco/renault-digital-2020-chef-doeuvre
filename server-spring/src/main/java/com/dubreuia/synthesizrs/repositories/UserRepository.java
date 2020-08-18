package com.dubreuia.synthesizrs.repositories;

import com.dubreuia.synthesizrs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
