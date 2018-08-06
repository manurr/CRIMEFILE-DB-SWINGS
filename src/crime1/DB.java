/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crime1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prabhu
 */
public class DB {
    private static final String driverName="oracle.jdbc.driver.OracleDriver";
    private static Connection con=null;
    public static Connection getConn() throws ClassNotFoundException
    {
        try {
            Class.forName(driverName);
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
}
