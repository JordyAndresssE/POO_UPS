package ec.edu.ups.interfaz;
import java.awt.*;
/**
 *
 * @author jordy
 */
public class VentanaLibros extends Frame {

    private Label labelLibros = new Label("Libros");

    public VentanaLibros() {
        super("Libros");
        setSize(400, 300);
        setLayout(new GridLayout(2, 2));

        add(labelLibros);

        Button botonAgregarLibro = new Button("Agregar libro");
        add(botonAgregarLibro);

        Button botonEditarLibro = new Button("Editar libro");
        add(botonEditarLibro);

        Button botonEliminarLibro = new Button("Eliminar libro");
        add(botonEliminarLibro);

        Button botonBuscarLibro = new Button("Buscar libro");
        add(botonBuscarLibro);

        setVisible(true);
    }
}