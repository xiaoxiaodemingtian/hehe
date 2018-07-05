package com.xiao.service;

import java.util.List;  

import com.xiao.entiy.User;  
  
public interface UserService {  
    void save(User user);  
    boolean update(User user);  
    boolean delete(int id);  
    User findById(int id);  
    List<User> findAll();  
}  