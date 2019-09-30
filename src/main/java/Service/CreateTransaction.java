package Service;

import java.sql.SQLException;

/**
 * Created by fozersahin on 24/08/19.
 */
public interface CreateTransaction {
    public int createTransaction(String transactionDetails) throws SQLException;
}
