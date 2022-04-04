package com.example.db.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.db.entities.Employee;

public interface UserRepository extends CrudRepository <Employee,String>{

}
