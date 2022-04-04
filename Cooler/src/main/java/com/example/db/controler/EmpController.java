package com.example.db.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.entities.Employee;
import com.example.db.repo.UserRepository;
import com.example.db.service.Empservice;


@RestController    
public class EmpController   
{    
@Autowired    
private Empservice userService;     
@RequestMapping("/")    
public List<Employee> getAllUser()  
{    
return userService.getAllUsers();    
}       
@RequestMapping(value="/add-user", method=RequestMethod.POST)    
public void addUser(@RequestBody Employee emp)  
{    
userService.addUser(emp);  
System.out.println("running");
}       





}

