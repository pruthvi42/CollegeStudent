package com.pruthvi.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruthvi.college.VO.RequestTemplate;
import com.pruthvi.college.entity.College;
import com.pruthvi.college.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	
	@Autowired
	CollegeService clgService;
	
	@PostMapping
	public College add(@RequestBody College clg)
	{
		return clgService.add(clg);
	}
	
	@GetMapping
	public List<College> list()
	{
		return clgService.list();
	}
	
	@GetMapping("/{id}")
	public College searchById(@PathVariable long id)
	{
		return clgService.searchById(id);
	}
	
	@GetMapping("/all-college-student")
	public List<RequestTemplate> listWithStudent()
	{
		return clgService.listWithStudent();
	}
	
	@GetMapping("/college-with-student/{clg_id}")
	public RequestTemplate specificCollegeStudent(@PathVariable long clg_id)
	{
		return clgService.specificCollegeStudent(clg_id);
	}
	
	
}








