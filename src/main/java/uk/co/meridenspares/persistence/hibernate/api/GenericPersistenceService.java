package uk.co.meridenspares.persistence.hibernate.api;

import java.io.Serializable;
import java.util.List;

import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;

/**
 * This interface declares some basic methods that will be included in all domain object persistence services
 * @author user
 *
 * @param <T>
 * @param <PK>
 */
public interface GenericPersistenceService<T, PK extends Serializable> {

	/**
	 * Returns instantiated type with given id.
	 * @param id
	 * @return Populated object or null if not in database
	 * @throws PersistenceServiceException
	 */
	T get(PK id) throws PersistenceServiceException;
	
	/**
	 * Returns all objects of instantiated type.
	 * @return List of instantiated objects
	 * @throws PersistenceServiceException
	 */
	List<T> getAll() throws PersistenceServiceException;
	
	/**
	 * Returns instantiated type with given id.
	 * This method will throw an exception if there is no row in the database corresponding to the id.
	 * The object returned may be a proxy.
	 * @param id
	 * @return
	 * @throws PersistenceServiceException
	 */
	T load(PK id) throws PersistenceServiceException;
	
	/**
	 * Saves provided object to the database.
	 * @param object
	 * @return
	 * @throws PersistenceServiceException
	 */
	T save(T object) throws PersistenceServiceException;
	
	/**
	 * Removes row corresponding to id from database.
	 * @param id
	 * @throws PersistenceServiceException
	 */
	void remove(PK id) throws PersistenceServiceException;
	
	/**
	 * Removes row corresponding to object from database.
	 * @param object
	 * @throws PersistenceServiceException
	 */
	void remove(T object) throws PersistenceServiceException;
	
	/**
	 * Determines if row corresponding to id exists in database.
	 * @param id
	 * @return
	 * @throws PersistenceServiceException
	 */
	boolean exists(PK id) throws PersistenceServiceException;
	
	/**
	 * Flushes the current state of persistent objects in the persistence session to the database.
	 */
	void flush();
	
	/**
	 * Evicts the object from the current persistence session.
	 * @param object
	 * @throws PersistenceServiceException
	 */
	void evict(T object) throws PersistenceServiceException;
	
	/**
	 * Forces initialisation of a Hibernate or persistent collection.
	 * @param obj
	 */
	void initialise(Object object);
	
	/**
	 * Returns a UID representing the current persistence session.
	 * @return
	 * @throws PersistenceServiceException
	 */
	long getSessionUid() throws PersistenceServiceException;
}
