package Utility;

import java.sql.SQLException;

/**
 * Created by fozersahin on 24/08/19.
 */
public abstract class RevolutTransferException extends SQLException {
    protected final String message;

    protected RevolutTransferException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
