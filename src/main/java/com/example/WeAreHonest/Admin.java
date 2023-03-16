package com.example.WeAreHonest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Admin {
@Id
	private String ad_name;
	private String ad_email;
	private int ad_ph_no;
	private String ad_pwd;
	private String ad_username;
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	@Override
	public String toString() {
		return "Admin [ad_name=" + ad_name + ", ad_email=" + ad_email + ", ad_ph_no=" + ad_ph_no + ", ad_pwd=" + ad_pwd
				+ ", ad_password=" + ad_username + "]";
	}
	public String getAd_email() {
		return ad_email;
	}
	public void setAd_email(String ad_email) {
		this.ad_email = ad_email;
	}
	public String getAd_username() {
		return ad_username;
	}
	public void setAd_username(String ad_username) {
		this.ad_username = ad_username;
	}
	public int getAd_ph_no() {
		return ad_ph_no;
	}
	public void setAd_ph_no(int ad_ph_no) {
		this.ad_ph_no = ad_ph_no;
	}
	public String getAd_pwd() {
		return ad_pwd;
	}
	public void setAd_pwd(String ad_pwd) {
		this.ad_pwd = ad_pwd;
	}
	
	
	
}
