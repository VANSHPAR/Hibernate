package project.jsp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import org.hibernate.Session;
import project.jsp.entity.Users;

public class App {

	public static void main(String[] args) {
	SessionFactory fact=new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Users.class)
			.buildSessionFactory();
	Session s=fact.getCurrentSession();
	
	try {
		//add operation
//		//create object of entity class
//		Users user=new Users("a00","passwordapp","app_name","lastapp_name");
//		//start transaction
//		s.beginTransaction();
//		//perform operation
//		s.save(user);
//		//commit the transaction
//		s.getTransaction().commit();
//		System.out.println("Row added!");
//		
//		//get operation
//		Users user=new Users();
//		s.beginTransaction();
//		user=s.get(Users.class, 4);
//		s.getTransaction().commit();
//		System.out.println(user);
		
//		//update operation
		Users use=new Users();
		s.beginTransaction();
		use=s.get(Users.class, 5);
		use.setPassword("stringpassword");
		s.getTransaction().commit();
		System.out.println(use);
//		
//		Users use=new Users();
//		s.beginTransaction();
//		use=s.get(Users.class, 4);
//		s.delete(use);
//		s.getTransaction().commit();
//		
		
		
		
		
	} finally {
		s.close();
		fact.close();
	}
	

	}

}
