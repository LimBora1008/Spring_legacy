package com.javalab.dao;

import org.apache.ibatis.annotations.Mapper;

import com.javalab.vo.UserVo;

@Mapper
public interface LoginDao {

	public UserVo getUserById(UserVo vo);
}
