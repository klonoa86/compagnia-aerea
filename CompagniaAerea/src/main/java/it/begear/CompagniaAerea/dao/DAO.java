package it.begear.CompagniaAerea.dao;

import java.io.Serializable;
import java.util.List;

import it.begear.CompagniaAerea.Model.Cliente;
import it.begear.CompagniaAerea.Model.Prenotazione;
import it.begear.CompagniaAerea.Model.Volo;

public interface DAO {

	public <T> void create(T entity);
	public <T> void update(T entity);
	public <T> void delete(T entity);
	public <T> T read(Class<T> entity, Serializable id);
	public List<Volo> stampaListaVoliMondiali();
	public List<Integer> stampaNumeroPrenotazioni();
	
}
