package Service;

import java.sql.SQLException;

/**
 * Created by fozersahin on 24/08/19.
 */
public class MockCommitTransactionService implements CommitTransaction {
    @Override
    public String commitTransaction(int transactionId) throws SQLException {
        if( transactionId == 42)
            return "Success";
        return "Failure";
    }
}
