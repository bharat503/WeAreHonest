package com.example.WeAreHonest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class EmployService {
	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	private EmploysRepository repo;
	@Autowired
	private EmployDao dao;

	public List<Employ> getdata() {
		return repo.findAll();
	}

	public String insert(Employ emp2) {
		System.out.println(emp2.getId());
		System.out.println(emp2.getAge());
		System.out.println(emp2.getName());

		String cmd = "insert into employ(id,name,age)  " + " values(?,?,?)";
		jdbc.update(cmd, new Object[] { emp2.getId(),emp2.getName(), emp2.getAge() });

		return "inserted";

	}


	
	

	public String getquery(String query) {
		
		return dao.validation(query);
	}

	public String deleteLocation(int id) {
		
//		   return repo.deleteById(id);;

			String cmd = "delete from employ where id = ?";
			jdbc.update(cmd, new Object[] {id});

			return "deleted";
			
		
		
	}

	public String getstringdata() {
		
		List<Employ> sb=repo.findAll();
		StringBuffer sb1 =new StringBuffer();
		sb1.append(sb);
		String Abc=sb1.toString();
		
	  
		return  Abc;
	}
}
