package com.rest1.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest1.example.Dao1.CoursesRepository;
import com.rest1.example.entities.Courses;

@Service
public class CourseService 
{
	@Autowired
    private CoursesRepository coursesRepository;

	public Courses addCourses(Courses course)
	{
		return coursesRepository.save(course);	
	}
}