package it.begear.CompagniaAerea.dao;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import it.begear.CompagniaAerea.Model.Cliente;
import it.begear.CompagniaAerea.Model.Prenotazione;
import it.begear.CompagniaAerea.Model.Volo;

public class DAOImpl implements DAO {
	Logger log = Logger.getLogger("logProva");

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

	public List<Volo> stampaListaVoliMondiali() {
		try (Session sessione = createConnection()) {
			sessione.beginTransaction();
			Query<Volo> query = sessione.createQuery("from Volo v", Volo.class);
			List<Volo> voli = query.getResultList();
			sessione.getTransaction().commit();

			return voli;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

}
