package Utility;

import org.apache.log4j.Logger;

/**
 * Created by fozersahin on 24/08/19.
 */
public class CommitTransactionException extends RevolutTransferException {
    private final static Logger logger = Logger.getLogger(CommitTransactionException.class);

    public CommitTransactionException(String message) {
        super(message);
        logger.error(message);
    }
}
