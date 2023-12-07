package com.demo.microservices.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.microservices.model.SampleUser;

@Mapper
public interface SampleUserDao {

	/*
	 * 
	 */
	List<SampleUser> selectUserAll() throws Exception;
	SampleUser selectUser(String userId) throws Exception;
	int insertUser(SampleUser user) throws Exception;
	int updateUser(SampleUser user) throws Exception;
	int deleteUser(String userId) throws Exception;
}
