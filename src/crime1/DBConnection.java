/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crime1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Prabhu
 */
public class DBConnection
{

//private static final String driverName="oracle.jdbc.driver.OracleDriver";

private static final String driverName="oracle.jdbc.driver.OracleDriver";
//private static final String username="hr";
//private static final String password="hr";
private static Connection con=null;

private DBConnection()
{
    
}

public static Connection getConnection() throws ClassNotFoundException,SQLException

{
	try
	{
	//Step 1: Load the Driver using Class.forName();
	//Class.forName(driverName);


	//Driver d=new oracle.jdbc.driver.OracleDriver();
	//DriverManager.registerDriver(d);

//java.util.Properties p=new java.util.Properties();
//p.load(new java.io.FileInputStream("database.properties"));

//Class.forName(p.getProperty("driver"));

	//Step 2: establish the connection to the Database useing getConnection() method of DriverManager class
//	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",p.getProperty("username"),p.getProperty("password"));



Class.forName(driverName);
/*java.util.Properties p=new java.util.Properties();
p.put("user","hr");
p.put("password","hr");

*/
	//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe",p);

	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manu1234"); 
}
/*catch(ClassNotFoundException exe)
{

	throw exe;
}*/
	catch(SQLException exe1)
	{

		throw exe1;
}


return con;

}


}