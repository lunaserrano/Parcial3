package com.luna.sl.service;


import com.luna.sl.changepass.ChangePasswordForm;
import com.luna.sl.entity.User;
import com.luna.sl.exceptions.UsernameOrIdNotFound;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
}
