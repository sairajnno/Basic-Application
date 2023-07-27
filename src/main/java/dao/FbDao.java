package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Fb_login;

public class FbDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sk");

	public Fb_login save(Fb_login fb_login) {
		EntityManager entityManager2 = entityManagerFactory.createEntityManager();
		EntityTransaction et = entityManager2.getTransaction();
		
		et.begin();
		entityManager2.persist(fb_login);
		et.commit();

		return fb_login;
	}
	
}
