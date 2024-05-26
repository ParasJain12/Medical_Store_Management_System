package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName(DBDetails.DRIVER);
            con = DriverManager.getConnection(DBDetails.CONSTR,DBDetails.USERNAME,DBDetails.PASSWORD);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e.toString());
        }
        return con;
    }
}
