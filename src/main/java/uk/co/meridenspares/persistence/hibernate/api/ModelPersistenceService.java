package uk.co.meridenspares.persistence.hibernate.api;

import java.util.List;

import uk.co.meridenspares.domain.Model;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;

/**
 * Interface declaring methods for the 'Model' persistence service.
 * @author user
 *
 */
public interface ModelPersistenceService extends GenericPersistenceService<Model, Long> {

	List<Integer> getModelYears() throws PersistenceServiceException;
	
	List<Model> getModelsForYear(int year) throws PersistenceServiceException;
}
