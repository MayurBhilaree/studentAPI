package student.service;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

import student.model.student;

public interface studservice {

	public student adddata(student s);
	
	public List<student> getall();
	
	public Optional<student> getbyid(int id);
	
	public student upd(student s);
	
	public void del(int id);
}
