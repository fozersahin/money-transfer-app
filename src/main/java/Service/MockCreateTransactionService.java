package Service;

import java.sql.SQLException;

/**
 * Created by fozersahin on 24/08/19.
 */
public class MockCreateTransactionService implements CreateTransaction{
    @Override
    public int createTransaction(String transactionDetails) throws SQLException {
        return 42;
    }
}
