package it.begear.CompagniaAerea.dao;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import it.begear.CompagniaAerea.Main.Main;



public class DAOImpl implements DAO{
	SessionFactory sessionFactory = null;
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
	Logger log=Logger.getLogger(Main.class);
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
		log.info("Questo è il metodo inserimento");
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	public <T> void update(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		log.info("Questo è il metodo di aggiornamento");;
		session.update(entity);
		session.getTransaction().commit();
		session.close();
	}

	public <T> void delete(T entity) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		log.info("Questo è il metodo di eliminazione");
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
	}

	public <T> T read(Class<T> entity, Serializable id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		log.info("Questo è il metodo di lettura");
		T t = session.get(entity, id);
		session.getTransaction().commit();
		session.close();
		return t;
	}

}
