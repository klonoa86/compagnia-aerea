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
	 log.info("Sei nel metodo d'inserimento");
  try (Session session = createConnection()) {
   session.beginTransaction();
   session.save(d);
   session.getTransaction().commit();
   log.info("Hai inserito un nuovo oggetto");
  } catch (HibernateException e) {
	 log.warn("Errore!!! ",e);
	  e.printStackTrace();
  }
 }

 @Override
 public <D> D read(Class<D> classe, Serializable pk) {
  D d = null;
  log.info("Sei nel metodo di lettura");
  try (Session session = createConnection()) {
   session.beginTransaction();
   d = session.get(classe, pk);
   session.getTransaction().commit();
   log.info("Hai appena letto un oggetto");
  } catch (HibernateException e) {
	  log.warn("Errore!!! ", e);
	  e.printStackTrace();
	  

  }
  return d;
 }

 @Override
 public <D> void update(D d) {
	 log.info("Sei nel metodo di modifica");
  try (Session session = createConnection()) {
   session.beginTransaction();
   session.update(d);
   session.save(d);
   session.getTransaction().commit();
   log.info("Hai appena modificato un oggetto");
  } catch (Exception e) {
	  log.warn("Errore!!! ",e);
   e.printStackTrace();
  }

 }

 @Override
 public <D> void delete(D d) {
	 log.info("Sei nel metodo eliminazione");
  try (Session session = createConnection()) {
   session.beginTransaction();
   session.delete(d);
   session.getTransaction().commit();
   log.info("Hai appena eliminato un oggetto");
  } catch (Exception e) {
	  log.warn("Errore!!! ",e);
   e.printStackTrace();

  }


 }

//@Override
//public Prenotazione aggiungiPrenotazioneVolo(Prenotazione p) {
//		try (Session sessione = createConnection()) {
//			sessione.beginTransaction();
//			Volo volo = sessione.get(Volo.class, p.getVolo().getIdVolo());
//			p.getCliente().getListaPrenotazioniVoli().add(p);
//			sessione.getTransaction().commit();
//			return p;
//
//		}
//}

//@Override
//public Prenotazione aggiungiPrenotazioneCliente(Prenotazione p) {
//	return p;
////	try (Session sessione = createConnection()) {
////		sessione.beginTransaction();
////		Cliente cliente = sessione.get(Cliente.class, p.getCliente().getUsername());
////		p.getVolo().getListaPrenotazioniClienti().add(p);
////		sessione.getTransaction().commit();
////		return p;
////	}
//}

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

// @Override
// public <D> D LoadLazyRelations(Class<D> d, Serializable g) {
//  
//  return null;
// }

}
