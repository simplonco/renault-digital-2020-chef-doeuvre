package com.dubreuia.synthesizrs.services;

public interface UserService {

    void verifyUser(String username, String password);

    void registerUser(String username, String password);

}
