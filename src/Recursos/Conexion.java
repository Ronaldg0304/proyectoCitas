/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rolan
 */
public class Conexion {

    //Conectando a la base de datos.
    Connection con;
    // URL y driver de conexión a la base de datos
    String URL = "jdbc:sqlserver://localhost:1433;encrypt=false;databaseName=BD_CITAS";
    String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    // Nombre de usuario y contraseña para acceder a la base de datos
    String USUARIO = "sa";
    String CONTRASENA = "1234";

    public Conexion() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos");
        }
    }

    public Connection getConexion() {
        System.out.println("Conexión establecida");
        return con;
    }

    public Connection CerrarConexion() throws SQLException {

        con.close();
        con = null;
        return con;
    }
}
