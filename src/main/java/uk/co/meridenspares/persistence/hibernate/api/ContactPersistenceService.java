package uk.co.meridenspares.persistence.hibernate.api;

import uk.co.meridenspares.domain.Contact;
import uk.co.meridenspares.persistence.api.exception.PersistenceServiceException;

/**
 * Interface declaring methods for the 'Contact' persistence service.
 * @author user
 *
 */
public interface ContactPersistenceService extends GenericPersistenceService<Contact, Long> {

	int getCountByName(String name) throws PersistenceServiceException;
}
