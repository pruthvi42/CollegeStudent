package com.pruthvi.college.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pruthvi.college.VO.RequestTemplate;
import com.pruthvi.college.entity.College;

@Service
public interface CollegeService {
	College add(College clg);
	List<College> list();
	College update(long id,String name);
	College searchById(long id);
	List<RequestTemplate> listWithStudent();
	RequestTemplate specificCollegeStudent(long clg_id);
}
