package implementation;

import java.sql.*;
/*
 tests a database installation by creating and querying
 *a sample table
 */
public class TestDatabase {
    
    /** Creates a new instance of TestDB */
    public static void main(String[] args) throws Exception {

try{
     //connect to the database
     ConnectDatabase.init();
     Connection conn = ConnectDatabase.getConnection();
        
     //enable SQL statements to be created and run
     Statement stmt= conn.createStatement();	
                
     stmt.execute("CREATE TABLE Testdb (Name VARCHAR(20))");
     stmt.execute("INSERT into Testdb VALUES ('Yourname')");

     ResultSet result = stmt.executeQuery("SELECT * from Testdb");
     result.next();
        
     System.out.println(result.getString("Name"));
     result.close();
        
                 stmt.execute("DROP TABLE Testdb");
      stmt.close();
      conn.close();
      }
      catch (Exception ex)
     {
           System.err.print("SQLException: ");
	System.err.println(ex.getMessage());
      }
      }
}
