package com.example.db.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.db.entities.Employee;
import com.example.db.repo.UserRepository;

@Service    
public class Empservice  
{    
@Autowired    
private UserRepository userRepository;    
public List<Employee> getAllUsers()  
{    
List<Employee>userRecords = new ArrayList<>();    
userRepository.findAll().forEach(userRecords::add);    
return userRecords;    
}    
public void addUser(Employee emp)  
{    
userRepository.save(emp);    
} 
}

