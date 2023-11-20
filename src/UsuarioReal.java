/**
 * La clase {UsuarioReal} implementa la interfaz {IUsuario} y representa a un usuario real
 * en un sistema de pagos. Esta clase almacena información real sobre el nombre del usuario, el número de cuenta bancaria,
 * y la cantidad de dinero disponible para realizar pagos. Información que no se debería exponer directamente al usuario por lo que
 * se utiliza el patrón proxy para controlar el acceso a esta información.
 */
public class UsuarioReal implements IUsuario {

    /** El nombre del usuario. */
    String nombreUsuario;

    /** El número de cuenta bancaria del usuario. */
    int cuentaBanco;

    /** La cantidad de dinero disponible para el usuario. */
    double dineroDisponible;

    /**
     * Construye un nuevo objeto {UsuarioReal} con la información proporcionada.
     *
     * @param nombreUsuario    El nombre del usuario.
     * @param cuentaBanco      El número de cuenta bancaria del usuario.
     * @param dineroDisponible La cantidad de dinero disponible para el usuario.
     */
    public UsuarioReal(String nombreUsuario, int cuentaBanco, double dineroDisponible) {
        this.nombreUsuario = nombreUsuario;
        this.cuentaBanco = cuentaBanco;
        this.dineroDisponible = dineroDisponible;
    }

    /**
     * Obtiene la cantidad de dinero disponible para el usuario.
     *
     * @return La cantidad de dinero disponible para el usuario.
     */
    public double getDineroDisponible() {
        return dineroDisponible;
    }

    /**
     * Realiza un pago desde la cuenta bancaria del usuario, deduciendo el monto del dinero disponible.
     *
     * @param cuentaBanco El número de cuenta bancaria a partir del cual se realizará el pago.
     * @param precio      La cantidad de dinero que se pagará.
     */
    @Override
    public void pagar(int cuentaBanco, double precio) {
        if (precio <= dineroDisponible) {
            dineroDisponible -= precio;
            System.out.println("\u001B[92m¡Compra realizada con éxito!\u001B[0m");
            System.out.println("Dinero disponible: \u001B[92m" + dineroDisponible + "\u001B[0m");
        } else {
            System.out.println("Error: No tienes dinero suficiente");
            // Otro manejo de error si es necesario
        }
    }

    /**
     * Obtiene el número de cuenta bancaria del usuario.
     *
     * @return El número de cuenta bancaria del usuario.
     */
    @Override
    public int getCuenta() {
        return cuentaBanco;
    }

    /**
     * Obtiene la cantidad de dinero disponible para el usuario.
     *
     * @return La cantidad de dinero disponible para el usuario.
     */
    @Override
    public double getDinero() {
        return dineroDisponible;
    }
}
