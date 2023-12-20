package ec.edu.ups.interfaz;
import java.awt.*;

/**
 *
 * @author jordy
 */
public class VentanaBibliotecas extends Frame {

    private Label labelBibliotecas = new Label("Bibliotecas");

    public VentanaBibliotecas() {
        super("Bibliotecas");
        setSize(400, 300);
        setLayout(new GridLayout(2, 2));

        add(labelBibliotecas);

        Button botonAgregarBiblioteca = new Button("Agregar biblioteca");
        add(botonAgregarBiblioteca);

        Button botonEditarBiblioteca = new Button("Editar biblioteca");
        add(botonEditarBiblioteca);

        Button botonEliminarBiblioteca = new Button("Eliminar biblioteca");
        add(botonEliminarBiblioteca);

        Button botonBuscarBiblioteca = new Button("Buscar biblioteca");
        add(botonBuscarBiblioteca);

        setVisible(true);
    }
}