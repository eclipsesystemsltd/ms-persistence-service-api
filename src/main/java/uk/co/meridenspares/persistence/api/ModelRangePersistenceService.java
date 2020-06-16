package uk.co.meridenspares.persistence.api;

import java.util.List;

import uk.co.meridenspares.domain.ModelRange;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;

/**
 * Interface declaring methods for the 'ModelRange' persistence service.
 * @author user
 *
 */
public interface ModelRangePersistenceService extends GenericPersistenceService<ModelRange, Long> {

	List<Integer> getModelRangeYears(ModelRange modelRange) throws PersistenceServiceException;
	
	ModelRange findByName(String modelRange) throws PersistenceServiceException;
}
