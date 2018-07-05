package com.xiao.dao;

import com.xiao.entiy.User;

import java.util.List;   
/** 
 * 做为 DAO的接口 
 * @author */  
public interface UserDao{    
    void save(User user);    
    boolean update(User user);    
    boolean delete(int id);    
    User findById(int id);    
    List<User> findAll();    
}  