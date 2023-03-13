package com.greatlearning.app;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredServiceImpl;
public class EmailDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name: ");
		String firstName = sc.next();
		System.out.println("Enter the Last Name: ");
		String lastName = sc.next();
		Employee e1 = new Employee(firstName, lastName);
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Lega");
		System.out.println("Enter Choice: ");
		int choice = sc.nextInt();
		sc.close();
		CredServiceImpl cs = new CredServiceImpl();
		String generatedEmail = null, generatedPassword = null;
		switch (choice)
		{
		case 1:
			generatedEmail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase() , "tech");
			break;
		case 2:
			generatedEmail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase() , "admin");
			break;
		case 3:
			generatedEmail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase() , "hr");
			break;
		case 4:
			generatedEmail = cs.generateEmailId(e1.getFirstName().toLowerCase(), e1.getLastName().toLowerCase() , "legal");
			break;
		default:
			System.out.println("Insert a valid choice"); 
		}
		generatedPassword = cs.generatePassword();
		e1.setEmail(generatedEmail);
		e1.setPassword(generatedPassword);
		cs.showDetail(e1);
	}
}
