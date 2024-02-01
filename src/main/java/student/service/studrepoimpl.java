package student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student.model.student;
import student.repo.studrepo;

@Service
public class studrepoimpl implements studservice
{
	@Autowired
	studrepo sr;
	@Override
	public student adddata(student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public List<student> getall() {
		// TODO Auto-generated method stub
		return (List<student>) sr.findAll();
	}

	@Override
	public Optional<student> getbyid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id);
	}

	@Override
	public student upd(student s) {
		// TODO Auto-generated method stub
		if(sr.existsById(s.getId()))
		{
		return	sr.save(s);
		}
		else
		{
			return null;
		}
		
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

}
