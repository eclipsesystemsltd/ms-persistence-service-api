package uk.co.meridenspares.persistence.api;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
	 * Finds an object based on identifier.
	 * @param id
	 * @return
	 */
	T find(PK id) throws PersistenceServiceException;
	
	/**
	 * Returns a list of populated objects representing all the rows in the database corresponding to the
	 * instantiated type.
	 * @return List of populated objects
	 */
	List<T> findAll() throws PersistenceServiceException;
	
	/**
	 * Returns all records without duplicates.
	 * Note that if you use this method it is imperative that the model classes correctly implement the
	 * equals/hashCode methods.
	 * @return List of distinct populated objects
	 */
	List<T> findAllDistinct() throws PersistenceServiceException;
	
	/**
	 * Creates an object.
	 * @param object
	 * @return
	 */
	T create(T object) throws PersistenceServiceException;
	
	/**
	 * Updates an object.
	 * @param object
	 * @return
	 */
	T update(T object) throws PersistenceServiceException;
	
	/**
	 * Deletes an object.
	 * @param object
	 */
	void delete(T object) throws PersistenceServiceException;

    /**
     * Method that returns the number of entries from a table that meet some criteria (where clause params).
     *
     * @param params - SQL parameters
     * @return the number of records meeting the criteria
     */
    long countAll(Map<String, Object> params) throws PersistenceServiceException;	
}
