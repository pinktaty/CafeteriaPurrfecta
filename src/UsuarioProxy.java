/**
 * La clase {UsuarioProxy} implementa la interfaz y actúa como un proxy para un objeto
 * de tipo {IUsuario}. Este proxy controla el acceso a las cuentas actuando como un intermediario
 * entre el usuario y el sistema de pagos. Con este aseguramos que el usuario no interactue directamente
 * con sus cuentas bancarias.
 */
public class UsuarioProxy implements IUsuario {

    /**
     * El objeto de usuario real que este proxy representa.
     */
    private IUsuario usuario;

    /**
     * El número de cuenta bancaria asociado al usuario.
     */
    private int cuentaBanco;

    /**
     * La cantidad de dinero disponible para el usuario.
     */
    private double dineroDisponible;

    /**
     * Construye un nuevo {UsuarioProxy} asociado a un usuario dado.
     *
     * @param usuario El objeto de usuario real que este proxy representará.
     */
    public UsuarioProxy(IUsuario usuario) {
        this.usuario = usuario;
        this.cuentaBanco = usuario.getCuenta();
        this.dineroDisponible = usuario.getDinero();
    }

    /**
     * Realiza un pago desde la cuenta bancaria del usuario, verificando primero si el número de cuenta
     * coincide con el asociado al proxy.
     *
     * @param cuentaBanco El número de cuenta bancaria a partir del cual se realizará el pago.
     * @param precio      La cantidad de dinero que se pagará.
     * @throws IllegalArgumentException Si el número de cuenta proporcionado no coincide con el asociado al proxy.
     */
    @Override
    public void pagar(int cuentaBanco, double precio) throws IllegalArgumentException {
        if (this.cuentaBanco == cuentaBanco) {
            usuario.pagar(cuentaBanco, precio);
        } else {
            throw new IllegalArgumentException("No tienes acceso a esta cuenta");
        }
    }

    /**
     * Obtiene el número de cuenta bancaria del usuario representado por el proxy.
     *
     * @return El número de cuenta bancaria asociado al usuario.
     */
    @Override
    public int getCuenta() {
        return cuentaBanco;
    }

    /**
     * Obtiene la cantidad de dinero disponible para el usuario representado por el proxy.
     *
     * @return La cantidad de dinero disponible para el usuario.
     */
    @Override
    public double getDinero() {
        return dineroDisponible;
    }
}
