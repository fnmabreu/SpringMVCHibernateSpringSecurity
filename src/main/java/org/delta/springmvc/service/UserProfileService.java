package org.delta.springmvc.service;

import java.util.List;

import org.delta.springmvc.model.UserProfile;

public interface UserProfileService {

	UserProfile findById(int id);
	 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
    
}
