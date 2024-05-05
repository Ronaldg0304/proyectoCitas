/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

/**
 *
 * @author rolan
 */
public class PacienteControlador implements ActionListener {

    Vista.RegpacienteInternalFrame pacienteVista;
    Modelo.Paciente pacienteModelo;
    Modelo.GestorPaciente gestorpacienteModelo;

    public PacienteControlador(Vista.RegpacienteInternalFrame pacienteVista) {
        this.pacienteVista = pacienteVista;
        gestorpacienteModelo = new Modelo.GestorPaciente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(pacienteVista.jButton1)) {
            String identificacion = pacienteVista.txt_identificacion.getText();
            String nombres = pacienteVista.txt_nombres.getText();
            String apellidos = pacienteVista.txt_apellidos.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha_nacimiento = formato.format(pacienteVista.Dtd_fecha_nacimiento.getDate());
            String genero = "";

            if (pacienteVista.rdb_masculino.isSelected()) {
                genero = "M";
            }
            if (pacienteVista.rdb_femenino.isSelected()) {
                genero = "F";
            }
            pacienteModelo = new Modelo.Paciente(identificacion, nombres, apellidos, fecha_nacimiento, genero);
            gestorpacienteModelo.RegistrarPacientes(pacienteModelo);
        }
        if (e.getSource().equals(pacienteVista.jButton2)) {
            pacienteVista.txt_identificacion.setText("");
            pacienteVista.txt_nombres.setText("");
            pacienteVista.txt_apellidos.setText("");
            pacienteVista.Dtd_fecha_nacimiento.setDate(null);
            pacienteVista.rdb_masculino.setSelected(true);
            pacienteVista.rdb_femenino.setSelected(false);
            pacienteVista.txt_identificacion.requestFocus();
        }
    }
}
