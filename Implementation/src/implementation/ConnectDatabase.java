package implementation;

import java.sql.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author ceinwen.hilton
 */
public class ConnectDatabase
{
    private static String url;
    private static String username;
    private static String password;
    
    public static void init() throws ClassNotFoundException
    {
         url = "jdbc:derby://localhost:1527/NyimasDataBase";
         username = "nbuser";
         password = "nbuser";
         Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    
    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url, username, password);
    }
}

