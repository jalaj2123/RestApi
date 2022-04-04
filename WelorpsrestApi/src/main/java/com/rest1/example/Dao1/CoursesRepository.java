package com.rest1.example.Dao1;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest1.example.entities.Courses;


@Repository 
public interface CoursesRepository extends JpaRepository<Courses,Integer>
{
	
}
