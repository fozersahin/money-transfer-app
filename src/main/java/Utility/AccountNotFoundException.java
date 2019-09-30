package Utility;

import org.apache.log4j.Logger;

/**
 * Created by fozersahin on 24/08/19.
 */
public class AccountNotFoundException extends RevolutTransferException {
    private final static Logger logger = Logger.getLogger(AccountNotFoundException.class);

    public AccountNotFoundException(String message) {
        super(message);
        logger.error(message);
    }
}
