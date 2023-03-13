package com.greatlearning.service;
import com.greatlearning.model.Employee;

public interface CredService {
	String generateEmailId(String firstName, String lastName, String dept); 
	String generatePassword();
	void showDetail(Employee e1);
}
