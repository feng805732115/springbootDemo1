package com.springboot.springbootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootDemo.dao.UserRepository;
import com.springboot.springbootDemo.pojo.SmbmsUser;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
	public List<SmbmsUser> getUserList() {
		return userRepository.findSmbmsUserList();
	}


}
