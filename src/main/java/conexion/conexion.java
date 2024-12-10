/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    public Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/teatro";
    
    public Connection conectar(String user,String clave){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,user,clave);
            System.out.println("Conectado Correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida: "+e,"conexión",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        
        return  conn;
    }
}
