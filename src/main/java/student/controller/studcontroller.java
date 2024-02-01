package student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.model.student;

import student.service.studservice;

@RestController
@RequestMapping("/student")
public class studcontroller 
{
	@Autowired
	studservice ss;
	
	@PostMapping("/add")
	public student addata(@RequestBody student s)
	{
		return ss.adddata(s);
	}
	
	@GetMapping
	public List<student> getall()
	{
		return ss.getall();
	}
	
	@GetMapping("/{id}")
	public Optional<student> getbyid(@PathVariable int id)
	{
		return ss.getbyid(id);
	}
	
	@PutMapping("/upd")
	public student upd(@RequestBody student s)
	{
		return ss.upd(s);
	}
	
	@DeleteMapping("/{id}")
	public void del(@PathVariable int id)
	{
		 ss.del(id);
	}

}
