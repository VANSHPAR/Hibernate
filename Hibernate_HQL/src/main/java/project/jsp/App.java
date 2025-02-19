package project.jsp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

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
		//To print list of all users
//		s.beginTransaction();
//		List<Users> users=s.createQuery("from userhiber").getResultList();	
//		for(Users temp:users) {
//			System.out.println(temp);
		
		
		//Where clause
//			s.beginTransaction();
//			List<Users> users=s.createQuery("from userhiber where username='bansh' OR last_name='lastname'").getResultList();	
//			for(Users temp:users) {
//				System.out.println(temp);
		
		//Update query
		s.beginTransaction();
		s.createQuery("update userhiber set password='vans30700' "
				+ "where password like'%0700%' " ).executeUpdate();
		
		
		
		
		
		
		
		
	} finally {
		s.close();
		fact.close();
	}
	

	}

}
