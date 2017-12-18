package com.bridgeit.service;



import com.bridgeit.model.UserBean;

public class UserServiceImpl implements UserService{

	public UserBean getUser(int id) {
		UserBean user = new UserBean();
        user.setAge(15);
        user.setName("Akash");
        user.setId(id);

        return user;
	}

	public void saveUser(UserBean user) {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateUser(UserBean user) {
		// TODO Auto-generated method stub
		
	}

}
