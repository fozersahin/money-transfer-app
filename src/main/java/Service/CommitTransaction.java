package Service;

import java.sql.SQLException;

/**
 * Created by fozersahin on 24/08/19.
 */
public interface CommitTransaction {

    public String commitTransaction(int transactionId ) throws SQLException;
}
