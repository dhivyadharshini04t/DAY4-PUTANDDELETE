package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Model;
import com.example.demo.Service.ApiService;

@RestController
public class controller {
	@Autowired
	ApiService stuService;
	@PostMapping("/addDetails")
	public Model addInfo(@RequestBody Model st)
	{
		return stuService.SaveDetails(st);
	}
	
@GetMapping("showDetails")
	public List<Model> fetchDetails()
	{
		return stuService.getDetails();
	}
@PutMapping("/updateDetails")
public Model updateInfo(@RequestBody Model st1)
{
	return stuService.updateDetails(st1);
}
@DeleteMapping("/deleteDetails/{id}")
public String deleteInfo(@PathVariable("id") int id)
{
	stuService.deleteDetails(id);
	return "Deleted details";
}
	
}