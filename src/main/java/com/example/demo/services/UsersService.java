package com.example.demo.services;

import com.example.demo.entites.Users;

public interface UsersService
{

	public String addUser(Users user);
	
	public boolean emailExists(String email);
	
	public boolean validateUser(String email, String password);
	
	public String getRole(String email);

	public Users getUser(String email);
 
	public void updateuser(Users user);


	
	
}
