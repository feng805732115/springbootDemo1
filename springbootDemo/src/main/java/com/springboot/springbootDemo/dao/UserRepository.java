package com.springboot.springbootDemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.springboot.springbootDemo.pojo.SmbmsUser;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface UserRepository {
     @Select("select * from smbms_user")
    public List<SmbmsUser> findSmbmsUserList();
}
