package com.sam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Employee.class);

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();
		Employee e = new Employee(101, "Sam");
		session.persist(e);
		transaction.commit();
		System.out.println("end");
	}
}
