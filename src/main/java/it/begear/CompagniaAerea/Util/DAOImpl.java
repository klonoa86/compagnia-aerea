package it.begear.CompagniaAerea.Util;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class DAOImpl implements DAO{
	SessionFactory sessionFactory = null;
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	private static DAOImpl instance = null;

	private DAOImpl() {
		this.sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}

	public static DAOImpl getInstance() {
		if (instance == null) {
			instance = new DAOImpl();
		}
		return instance;
	}

	public <T> void create(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("Inserimento...");
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	public <T> void update(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("Aggiornamento...");
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	public <T> void delete(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("Cancellazione...");
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
	}

	public <T> T read(Class<T> entity, Serializable id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		System.out.println("Lettura...");
		T t = session.get(entity, id);
		session.getTransaction().commit();
		session.close();
		return t;
	}

}
