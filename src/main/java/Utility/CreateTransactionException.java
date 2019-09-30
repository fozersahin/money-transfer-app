package Utility;

import org.apache.log4j.Logger;

/**
 * Created by fozersahin on 24/08/19.
 */
public class CreateTransactionException extends RevolutTransferException {
    private final static Logger logger = Logger.getLogger(CreateTransactionException.class);

    public CreateTransactionException(String message) {
        super(message);
        logger.error(message);
    }
}
