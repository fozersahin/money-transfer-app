import Model.Database;
import io.vertx.core.Vertx;
import org.apache.log4j.BasicConfigurator;

import java.sql.SQLException;

/**
 * Created by fozersahin on 24/08/19.
 */
public class RevolutTransfer {
    public static void main(String[] args) throws SQLException {
        BasicConfigurator.configure();
        Database.initialiseDatabase();

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(TransferVerticle.class.getName());
    }
}
