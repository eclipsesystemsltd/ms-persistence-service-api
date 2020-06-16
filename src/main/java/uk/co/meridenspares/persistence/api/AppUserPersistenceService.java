package uk.co.meridenspares.persistence.api;

import uk.co.meridenspares.domain.AppUser;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;

/**
 * Interface declaring methods for the 'AppUser' persistence service.
 * @author user
 *
 */
public interface AppUserPersistenceService extends GenericPersistenceService<AppUser, Long> {

	int getCountByName(String name) throws PersistenceServiceException;
}
