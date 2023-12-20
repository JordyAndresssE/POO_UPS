/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.interfaz;

/**
 *
 * @author jordy
 */
public class Main {
    
    public static void main(String[] args) {
    VentanaBibliotecas ventanaBibliotecas = new VentanaBibliotecas();
    VentanaUsuarios ventanaUsuarios = new VentanaUsuarios();
    VentanaLibros ventanaLibros = new VentanaLibros();
    VentanaPrestamos ventanaPrestamos = new VentanaPrestamos();

    ventanaBibliotecas.setVisible(true);
    ventanaUsuarios.setVisible(true);
    ventanaLibros.setVisible(true);
    ventanaPrestamos.setVisible(true);
    }   
}
