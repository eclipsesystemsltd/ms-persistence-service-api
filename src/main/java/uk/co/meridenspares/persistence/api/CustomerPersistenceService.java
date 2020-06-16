package uk.co.meridenspares.persistence.api;

import java.util.List;

import uk.co.meridenspares.domain.Customer;

/**
 * Interface declaring methods for the 'Customer' persistence service.
 * @author user
 *
 */
public interface CustomerPersistenceService extends GenericPersistenceService<Customer, Long> {

	public List<Customer> getCustomerByEmail(String email);
}
