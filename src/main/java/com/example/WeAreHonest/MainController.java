package com.example.WeAreHonest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@CrossOrigin(origins="http://localhost:4200")
@RestController
public class MainController {
	
	@Autowired
	EmployService esc;
	@Autowired
	AdminService admin;
	
	@GetMapping("/")
	public String hello() {
	    return "hello";}
	
	@GetMapping("/que/{query}")
	public String querydata(@PathVariable String query) {
		return esc.getquery(query);
	}
	
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
	 public String deleteLocation(@PathVariable int id) {
	    return  esc.deleteLocation(id);
	 }
	
	@RequestMapping(value = "/adm", method = RequestMethod.DELETE)
	 public String deletealladmindata() {
	    return  admin.deletealldata();
	 }
	
	
	@GetMapping("/data")
	public List<Employ> new1(){
		 return esc.getdata();
		
	}
	
	@GetMapping("/admindata")
	public List<Admin> new3(){
		 return admin.getadmindata();
		
	}


	@GetMapping("/stringdata")
	public String new2(){
		 return esc.getstringdata();
		
	}
	
	
	@PostMapping("/edd")
	public String addCustomer(@RequestBody Employ emp) {
		return esc.insert(emp);
	}
	@PostMapping("/Adminadd")
	public String addAdmin(@RequestBody Admin data) {
		return admin.insert(data);
	}
	
	
}
