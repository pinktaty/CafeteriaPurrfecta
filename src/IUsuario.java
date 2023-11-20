/**
 * La interfaz {IUsuario} describe el contrato que deben seguir las clases que representan usuarios
 * en un sistema de pagos. Proporciona métodos para realizar pagos, obtener el número de cuenta
 * bancaria y obtener la cantidad de dinero disponible para el usuario. Esta interfaz se utiliza para 
 * el patrón proxy
 */
public interface IUsuario {

    /**
     * Realiza un pago desde la cuenta bancaria del usuario.
     *
     * @param cuentaBanco El número de cuenta bancaria a partir del cual se realizará el pago.
     * @param precio      La cantidad de dinero que se pagará.
     */
    void pagar(int cuentaBanco, double precio);

    /**
     * Obtiene el número de cuenta bancaria del usuario.
     *
     * @return El número de cuenta bancaria del usuario.
     */
    int getCuenta();

    /**
     * Obtiene la cantidad de dinero disponible para el usuario.
     *
     * @return La cantidad de dinero disponible para el usuario.
     */
    double getDinero();
}
