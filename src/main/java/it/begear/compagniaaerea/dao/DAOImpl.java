package it.begear.compagniaaerea.dao;

import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DAOImpl implements DAO {

	private SessionFactory sessionFactory = null;

	private static DAOImpl instance = null;

	private DAOImpl() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
	}

	public static DAOImpl getInstance() {
		if (instance == null) {
			instance = new DAOImpl();
		}
		return instance;
	}

	Session createConnection() {
		Session session = sessionFactory.openSession();
		return session;
	}

	@Override
	public <D> void create(D d) {
		try (Session session = createConnection()) {
			session.beginTransaction();
			session.save(d);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public <D> D read(Class<D> classe, Serializable pk) {
		D d = null;
		try (Session session = createConnection()) {
			session.beginTransaction();
			d = session.get(classe, pk);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public <D> void update(D d) {
		try (Session session = createConnection()) {
			session.beginTransaction();
			session.update(d);
			session.save(d);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public <D> void delete(D d) {
		try (Session session = createConnection()) {
			session.beginTransaction();
			session.delete(d);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

		}


	}

//	@Override
//	public <D> D LoadLazyRelations(Class<D> d, Serializable g) {
//		
//		return null;
//	}

}
