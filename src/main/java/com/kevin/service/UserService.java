package com.kevin.service;

import java.util.List;
import org.apache.log4j.Logger;

import com.kevin.domain.User;
import com.kevin.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserService implements IUserService   {
	
 	@Autowired
 	private UserRepository repository;	
	protected static Logger logger = Logger.getLogger("service");
	
	public List<User> getAll() {
		logger.debug("Retrieving all users");

		return repository.findAll();
	}
	
	public User get( Long id ) {
		logger.debug("Retrieving an existing user");
		
		return 	repository.findOne(id);
	}

	public Boolean add( User user ) {
		logger.debug("Adding a new user");
		
		try {
			User saved = repository.save(user);
			if(saved == null){
				logger.debug("Failed1");
				return false;
			}
				
			return true;
		} catch (Exception e) {
			logger.debug("Failed3");
			return false;
		}
	}
	
	public Boolean delete(Long id ) {
		logger.debug("Deleting an existing user");
		
		try {
			User existingUser = repository.findById(id);
			if (existingUser == null){
				logger.debug("Failed1");
				return false;
			}
				
			
			repository.delete(existingUser);
			User deletedUser = repository.findById(id);
			if (deletedUser != null){
				logger.debug("Failed2");
				return false;
			}
				
			return true;
		} catch (Exception e) {
			logger.debug("Failed3");
			return false;
		}

	}
 	
	public Boolean edit( User user ) {
		logger.debug("Editing an existing user");
		
		try {
			User existingUser = repository.findById(user.getId());
			if (existingUser == null){
				logger.debug("Failed1");
				return false;
			}
				
			
			// Only firstName, lastName, and role fields are updatable
			existingUser.setFirstName(user.getFirstName());
			existingUser.setLastName(user.getLastName());
			existingUser.setAddress(user.getAddress());
			existingUser.setCity(user.getCity());
			existingUser.setState(user.getState());
			existingUser.setZipPostal(user.getZipPostal());
			existingUser.setPhoneNumber(user.getPhoneNumber());
			
			User saved = repository.save(existingUser);
			if (saved == null) {
				logger.debug("Failed2");
				return false;
			}
				
			
			return true;
		} catch (Exception e) {
			logger.debug("Failed3");
			return false;
		}
		
	}
}
