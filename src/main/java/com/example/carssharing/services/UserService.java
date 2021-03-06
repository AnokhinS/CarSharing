package com.example.carssharing.services;

import com.example.carssharing.model.Role;
import com.example.carssharing.model.User;
import com.example.carssharing.repositories.RoleRepository;
import com.example.carssharing.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;


@Service
public class UserService {
	private UserRepository userRep;
	private RoleRepository roleRepository;

	public UserService(UserRepository userRep, RoleRepository roleRepository) {
		this.userRep = userRep;
		this.roleRepository = roleRepository;
	}

	public Iterable<User> findAll() {
		return userRep.findAll();
	}

	public User findById(long id) {
		return userRep.findById(id);
	}


	public void delete(User user) {
		userRep.delete(user);
	}

	public User findByEmail(String email) {
		return userRep.findByEmailIgnoreCase(email);
	}

	public void deleteById(long id) {
		userRep.deleteById(id);
	}

	public void create(User user) throws Exception{
		if (emailExist(user.getEmail()))
			throw new Exception("Данный почтовый адрес занят");
		user.setActive(1);
		Role userRole = roleRepository.findByRole("USER");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRep.save(user);
	}

	public void update(User user) throws Exception{
		userRep.save(user);
	}

	private boolean emailExist(String email) {
		User user = userRep.findByEmailIgnoreCase(email);
		if (user != null) {
			return true;
		}
		return false;
	}
}
