package souza.charles.sc3005071_p2.database.utils;

import java.sql.SQLException;

public class NotDataFoundException extends SQLException {

    public NotDataFoundException(String message) {
        super("ATENÇÃO: " + message);
    }
}
