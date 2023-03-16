package com.example.WeAreHonest;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDao {
	@Autowired  
    JdbcTemplate jdbc; 
	String a,variable,value;
	public String validation(String query) {
		
		if(query.contains("employ")) {
			String strquery[]=query.split("where") ;
			a = strquery[1].trim();
			String strquery2[]=a.split("=");
			variable=strquery2[0].trim();
			value=strquery2[1].trim();
		
			return variable+value;
	}
		
		return "invalid tablename";
	
	}}
