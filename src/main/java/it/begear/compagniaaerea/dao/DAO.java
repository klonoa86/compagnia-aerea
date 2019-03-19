package it.begear.compagniaaerea.dao;

import java.io.Serializable;

public interface DAO {

	<D> void create(D d);

	<D> D read(Class<D> d, Serializable g);

	<D> void update(D d);

	<D> void delete(D d);

	

}
