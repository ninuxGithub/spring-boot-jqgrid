package com.kevin.service;

import java.util.List;

import com.kevin.domain.User;

public interface IUserService {

	public List<User> getAll();
	public User get(Long id);
	public Boolean add(User user);
	public Boolean delete(Long id);
	public Boolean edit(User user);

}