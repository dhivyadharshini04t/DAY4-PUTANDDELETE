package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Model;
import com.example.demo.Repository.studRepo;

@Service
public class ApiService {
	@Autowired
	studRepo stRepo;

	public List<Model> getDetails()
	{
		return stRepo.findAll();
	}
	public 	Model SaveDetails(Model e)
	{
		return stRepo.save(e);
	}
	public Model updateDetails(Model e1)
	{
		return stRepo.saveAndFlush(e1);
	}
    public void deleteDetails(int id)
    {
    	stRepo.deleteById(id);
    }
}