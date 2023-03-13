package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredServiceImpl implements CredService{
	
	@Override
	public String generateEmailId(String firstName, String lastName, String dept) {
	 	String emailId = firstName+lastName+"@"+dept+"gl.com";
		return emailId;
		} 
	
	@Override
	public String generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = caps.toLowerCase();
		String nums = "0123456789";
		String spclchars = "!#@$%^&*()";
		String combined = caps+lower+nums+spclchars;
		Random random = new Random();
		String password = "";
		for (int i = 0; i<8; i++) {
			password = password+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		return password;
	} 
	
	@Override
	public void showDetail(Employee e1) {
		System.out.println("Employee's first Name: "+e1.getFirstName());
		System.out.println("Employee's last Name: "+e1.getLastName());
		System.out.println("Employee's Email Id: "+e1.getEmail());
		System.out.println("Employee's Password: "+e1.getPassword());
		
		
	}

}
