/**
 * 
 */
package uk.co.meridenspares.persistence.api.exception;

/**
 * @author user
 *
 */
public class PersistenceServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public PersistenceServiceException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public PersistenceServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public PersistenceServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PersistenceServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public PersistenceServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
