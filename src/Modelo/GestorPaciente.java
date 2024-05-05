/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rolan
 */
public class GestorPaciente {

    private static LinkedList<Paciente> pacientes;
    private static Connection conn;

    public GestorPaciente() {
        Recursos.Conexion conexion = new Recursos.Conexion();
        conn = conexion.getConexion();

        //pacientes = new LinkedList<Paciente>();
    }

    public void RegistrarPacientes(Paciente paciente) {
        PreparedStatement pst;
        
        try {
            pst = conn.prepareStatement("INSERT INTO PACIENTES (PacIdentificacion, PacNombre, PacApellidos, PacFechaNacimiento, PacSexo)VALUES(?,?,?,?,?)");
            pst.setString(1, paciente.getIdentificacion());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechaNacimiento());
            pst.setString(5, paciente.getGenero());
            pst.executeUpdate();
            System.out.println("**Paciente registrado**");
            JOptionPane.showMessageDialog(null, "¡Paciente Registrado!");
        } catch (Exception e) {
            Logger.getLogger(GestorPaciente.class.getName()).log(Level.SEVERE, null, e);
        }
//pacientes.add(paciente);
    }

    public static LinkedList<Paciente> getPacientebyParametro(int parametro, String valor) {
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql = "";
        //for (Paciente pac : pacientes) {
            switch (parametro) {
                case 1:
                    //if (pac.getIdentificacion().equals(valor)) {
                        sql = "SELECT * FROM PACIENTES WHERE PacIdentificacion='" + valor + "'";
                        //resultado.add(pac); }
                    break;
                case 2:
                    //if (pac.getNombres().equals(valor)) {
                        sql = "SELECT * FROM PACIENTES WHERE PacNombre='" + valor + "'";
                        //resultado.add(pac);}
                    break;
                case 3:
                    //if (pac.getApellidos().equals(valor)) {
                        sql = "SELECT * FROM PACIENTES WHERE PacApellidos='" + valor + "'";
                        //resultado.add(pac); }
                    break;
                case 4:
                    //if (pac.getGenero().equals(valor)) {
                        sql="SELECT * FROM PACIENTES WHERE PacSexo='"+valor+"'";
                        //resultado.add(pac);}
                    break;
            }

        //}
        try {
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {                
                resultado.add(new Paciente(rs.getString("PacIdentificacion"),rs.getString("PacNombre"),rs.getString("PacApellidos"),rs.getString("PacFechaNacimiento"),rs.getString("PacSexo")));
            }
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return resultado;
    }
}
