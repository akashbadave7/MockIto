package com.bridgeit.service;

import com.bridgeit.model.UserBean;

public interface UserService {


    public UserBean getUser(int id);

    public void saveUser(UserBean user);

    public void deleteUser(int id);

    public void updateUser(UserBean user);
}
