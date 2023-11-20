import java.util.ArrayList;

/**
 * En la clase {Cliente} que actua como controlador, se construyen los usuarios y se meten a una lista en la que 
 * posteriormente se itera para realizar la compra.
 */
public class Cliente {

    /** El usuario proxy utilizado para realizar compras seguras. */
    private UsuarioProxy usuario;

    /** La lista de usuarios disponibles para el cliente. */
    private ArrayList<UsuarioReal> usuarios;

    /**
     * Construye un nuevo objeto {Cliente} que inicializa una lista de usuarios disponibles.
     */
    public Cliente() {
        UsuarioReal mantecado = new UsuarioReal("Mantecado", 123456, 100);
        UsuarioReal laBigotes = new UsuarioReal("LaBigotes", 654321, 5000);
        UsuarioReal biscuit = new UsuarioReal("Biscuit", 987654, 10000);

        usuarios = new ArrayList<>();
        usuarios.add(mantecado);
        usuarios.add(laBigotes);
        usuarios.add(biscuit);
    }

    /**
     * Realiza una compra utilizando el usuario asociado al número de cuenta proporcionado,
     * utilizando un proxy para controlar el acceso.
     *
     * @param cuenta El número de cuenta bancaria desde la cual se realizará la compra.
     * @param precio La cantidad de dinero que se pagará en la compra.
     */
    public void realizarCompra(int cuenta, double precio) {
        for (UsuarioReal user : usuarios) {
            if (user.getCuenta() == cuenta) {
                usuario = new UsuarioProxy(user);
                break;
            }
        }
        usuario.pagar(cuenta, precio);
    }

    /**
     * Obtiene la cantidad de dinero disponible del usuario asociado al proxy.
     *
     * @return La cantidad de dinero disponible del usuario.
     */
    public double getDineroDisponible() {
        return usuario.getDinero();
    }
}
