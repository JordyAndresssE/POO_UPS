package ec.edu.ups.interfaz;
import java.awt.*;
/**
 *
 * @author jordy
 */
public class VentanaUsuarios extends Frame {

    private Label labelUsuarios = new Label("Usuarios");

    public VentanaUsuarios() {
        super("Usuarios");
        setSize(400, 300);
        setLayout(new GridLayout(2, 2));

        add(labelUsuarios);

        Button botonAgregarUsuario = new Button("Agregar usuario");
        add(botonAgregarUsuario);

        Button botonEditarUsuario = new Button("Editar usuario");
        add(botonEditarUsuario);

        Button botonEliminarUsuario = new Button("Eliminar usuario");
        add(botonEliminarUsuario);

        Button botonBuscarUsuario = new Button("Buscar usuario");
        add(botonBuscarUsuario);

        setVisible(true);
    }
}