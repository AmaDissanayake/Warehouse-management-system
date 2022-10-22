/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBwarehouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ama
 */
public class DBconnector {
    
public static Connection getConnection(){
 Connection con = null;
try {
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse_system?serverTimezone=UTC","root","");

} catch (SQLException ex) {
Logger.getLogger(DBconnector.class.getName()).log(Level.SEVERE, null, ex);
System.out.print(ex.getMessage());
JOptionPane.showMessageDialog(null, "Connection Failed Faild. Try again", "ERROR", JOptionPane.ERROR_MESSAGE);

}
return con;
    
}
}
