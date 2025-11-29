package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Pro1 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session sess = sf.openSession();
		
		Student ob = new Student(101, "Vikas", 23, 345.45f);
		sess.save(ob);
		
		
		sess.beginTransaction().commit();
		sess.close();
		
		sf.close();

		System.out.println("Done");
	}

}
