package org.delta.springmvc.service;

import java.util.List;

import org.delta.springmvc.dao.UserProfileDao;
import org.delta.springmvc.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService{

	@Autowired
	UserProfileDao dao;
	
	public UserProfile findById(int id){
		return dao.findById(id);
	}
	
	public UserProfile findByType(String type){
		return dao.findByType(type);
	}
	
	public List<UserProfile> findAll(){
		return dao.findAll();
	}
}
