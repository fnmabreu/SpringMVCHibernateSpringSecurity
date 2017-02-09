package org.delta.springmvc.dao;

import java.util.List;

import org.delta.springmvc.model.UserProfile;

public interface UserProfileDao {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);

}
