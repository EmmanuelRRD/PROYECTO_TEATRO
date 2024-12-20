/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class comandUser {
    
    public static boolean busquedas(Connection conn, String comando){
        String query = "SELECT id_usuario, nombre, email FROM usuarios";

        try (PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            // Procesar resultados
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");

                System.out.printf("ID: %d, Nombre: %s, Email: %s%n", idUsuario, nombre, email);
            }

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta");
            e.printStackTrace();
        }
        
        
        return true;
    }
    
}
