/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexion {
    Connection conn = null;
    String url = "jdbc:postgresql://localhost:5432/teatro";
    String user = "postgres";
    String contrasenia = "PassEmmanuel";
    
    public void conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,user,contrasenia);
            System.out.println("Conectado Correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion exitosa"+e,"conexion",JOptionPane.ERROR_MESSAGE);
        }
    }
}
