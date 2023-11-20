import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que representa la Vista del patrón Builder de MVC. Aquí se imprimen los menús de elección
 * de gato y el armado de platillos (el cual es controlado por ControladorElegirComp)
 */
public class VistaBuilder {
    // Creamos un controlador para actualizar esta vista
    protected ControladorElegirComp controller = new ControladorElegirComp();
    protected GatoMexicano gato1 = new GatoMexicano();
    protected GatoItaliano gato2 = new GatoItaliano();
    protected GatoJapones gato3 = new GatoJapones();
    protected Cliente cliente = new Cliente();

    // Personalización de la terminal
    public static final String RESET = "\u001B[0m";
    public static final String NEG = "\u001b[1m";
    public static final String CYAN = "\u001b[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";

    /**
     * Método para elegir un gato chef.
     * @return El GatoChef seleccionado.
     */
    public GatoChef elegirGato() {
        int eleccion = -1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("**Selecciona el" + CYAN + NEG + " número " + RESET + "de gato que quieres**");
            System.out.println(NEG + CYAN + "\n1. " + RESET + "Pancho: " + gato1.nombre() +
                    "\n" + gato1.presentacion() + "\nTe mostraré mi menú a continuación: " +
                    "\n");
            gato1.menuGato(gato1);
            System.out.println(NEG + CYAN + "\n2. " + RESET + "Luigi:  " + gato2.nombre() +
                    "\n" + gato2.presentacion() + "\nTe mostraré mi menú a continuación: " +
                    "\n");
            gato2.menuGato(gato2);
            System.out.println(NEG + CYAN + "\n3. " + RESET + "Taro: " + gato3.nombre() +
                    "\n" + gato3.presentacion() + "\nTe mostraré mi menú a continuación: " +
                    "\n");
            gato3.menuGato(gato3);
            System.out.print(CYAN + NEG + "\nSeleccione el número de su chef purrrfecto: " + RESET);

            if (sc.hasNextInt()) {
                eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return gato1;
                    case 2:
                        return gato2;
                    case 3:
                        return gato3;
                    default:
                        System.out.println("\u001B[31m\u001b[1m\n\nPor favor ingrese una entrada valida!\n\u001B[0m");
                        break;
                }
            } else {
                System.out.println("\u001B[31m\u001b[1m\n\nPor favor ingrese una entrada valida!\n\u001B[0m");
                sc.nextLine();
            }
        } while (eleccion < 1 || eleccion > 3);
        return gato1;
    }

    /**
     * Método para armar un combo(platillo) con el GatoChef seleccionado.
     * @param gato El GatoChef seleccionado.
     * @return El ComboGatuno armado.
     */
    public ComboGatuno armarPlatillo(GatoChef gato) {
        ComboGatuno combo = new ComboConstruido();
        String color = gato.color();
        combo = controller.armarCombo(gato);
        System.out.println(NEG + "\nGenial! Su combo gatuno tiene lo siguiente: " + RESET);
        combo.muestraCombo();
        System.out.println("El costo total a pagar es de "+ color +"$" + (float) combo.obtenCosto() + RESET);
        return combo;
    }

    /**
     * Método para realizar el pago del ComboGatuno.
     * @param combo El ComboGatuno a pagar.
     * @return true si el pago fue exitoso, false si no.
     */
    public boolean pagar(ComboGatuno combo) {
        int intentos = 0;
        System.out.println(RED + "Ingrese su NÚMERO DE TARJETA (***OJO solo tiene 3 intentos***): " + RESET);
        // System.out.println("Sólo tiene tres intentos.");

        do {
            Scanner sc = new Scanner(System.in);

            try {
                int cuentaIngresada = sc.nextInt();
                System.err.println("\nCuenta ingresada: " + YELLOW + cuentaIngresada + RESET);
                cliente.realizarCompra(cuentaIngresada, combo.obtenCosto());
                if (cliente.getDineroDisponible() < combo.obtenCosto()) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
            }

            intentos++;

            if (intentos == 3) {
                mostrarMensajeError();
                return false;
            }

            System.out.println("Por favor, inténtelo de nuevo.");

        } while (intentos < 3);

        return false;
    }

    /**
     * Método privado para mostrar un mensaje de error cuando se alcanza el límite de intentos.
     */
    private void mostrarMensajeError() {
        System.out.println("¡Error! Se alcanzó el límite de intentos. Por favor, contacta al servicio de atención al cliente.");
    }
}
