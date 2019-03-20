package it.begear.CompagniaAerea.Util;

import java.io.Serializable;

public interface DAO {

	public <T> void create(T entity);
	public <T> void update(T entity);
	public <T> void delete(T entity);
	public <T> T read(Class<T> entity, Serializable id);
}
