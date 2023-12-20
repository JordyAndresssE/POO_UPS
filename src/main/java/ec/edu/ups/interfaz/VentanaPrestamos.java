package ec.edu.ups.interfaz;
import java.awt.*;
/**
 *
 * @author jordy
 */
public class VentanaPrestamos extends Frame {

    private Label labelPrestamos = new Label("Préstamos");

    public VentanaPrestamos() {
        super("Préstamos");
        setSize(400, 300);
        setLayout(new GridLayout(2, 2));

        add(labelPrestamos);

        Button botonAgregarPrestamo = new Button("Agregar préstamo");
        add(botonAgregarPrestamo);

        Button botonEditarPrestamo = new Button("Editar préstamo");
        add(botonEditarPrestamo);

        Button botonEliminarPrestamo = new Button("Eliminar préstamo");
        add(botonEliminarPrestamo);

        Button botonBuscarPrestamo = new Button("Buscar préstamo");
        add(botonBuscarPrestamo);

        setVisible(true);
    }
}