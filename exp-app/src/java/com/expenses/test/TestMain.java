package com.expenses.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.expenses.app.models.User;

public class TestMain {
	public static void main(String[] args) {
		User user = new User().id(1l).email("pvaibhav.1510@gmail.com")
				.passHash("password");

		SessionFactory sessionFactpry = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactpry.openSession();
		session.beginTransaction();
		session.save(user);
		Transaction txn = session.getTransaction();
		txn.commit();
	}
}
