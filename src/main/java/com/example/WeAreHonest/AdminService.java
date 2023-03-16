package com.example.WeAreHonest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	private AdminRepository adm1;
	
	
	public String insert(Admin data) {
		System.out.println(data.getAd_name());
		
		String cmd = "insert into admin(ad_name,ad_email,ad_ph_no,ad_pwd,ad_username)  " + " values(?,?,?,?,?)";
		jdbc.update(cmd, new Object[] { data.getAd_name(),data.getAd_email(), data.getAd_ph_no(),data.getAd_pwd(),data.getAd_username() });
		return "Admin Added Successfully";
	}


	public List<Admin> getadmindata() {
		
		return adm1.findAll();
	}


	public String deletealldata() {
		String cmd = "delete from admin";
		jdbc.update(cmd, new Object[] {});

		

		return "deleted";
	}
	
}
