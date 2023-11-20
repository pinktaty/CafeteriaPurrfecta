import java.util.Scanner;

/**
 * Clase controlador del patrón de diseño MVC para controlar la elección del usuario para armar sus combos
 */
public class ControladorElegirComp {
    
    /**
     * Método único para la construcción de combos para diferentes tipos de gatos, pero hay
     * que especificar el tipo de gato que es (GatoMexicano,GatoItaliano,GatoJapones)
     * @param gato es el gato del tipo que queramos (gato mexicano, gato italiano o gato japones)
     * @return el combo ya armado
     */
    protected ArmarCombo armador = new ArmarCombo();
    public ComboConstruido armarCombo(GatoChef gato) {
        armador.armaCombo(elegirPlatoFuerte(gato));
        armador.armaCombo(elegirBebida(gato));
        armador.armaCombo(elegirPostre(gato));
            return armador.regresaCombo();
        
    }
    /**
     * Método para realizar el proceso de selección del plato fuerte
     * @param gato específico
     * @return la elección del plato fuerte
     */
    public PlatoFuerte elegirPlatoFuerte(GatoChef gato){
        PlatoFuerte plato1= gato.plato1();
        PlatoFuerte plato2= gato.plato2();
            do {
            Scanner sc = new Scanner(System.in);
            System.out.println( "\nElige el \u001B[32m número\u001B[0m de plato fuerte te gustaría." );
			System.out.println("");
            System.out.println( "\u001B[32m1.\u001B[0m " + plato1.nombre());
            plato1.descripcionCompleta();
			System.out.println("");
            System.out.println( "\u001B[32m2.\u001B[0m " + plato2.nombre());
            plato2.descripcionCompleta();
            System.out.print("\n\u001B[32mNúmero de plato elegido: \u001B[0m");

            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return plato1;
                    case 2: 
                        return plato2;
                    default:
                        break;
                }
            }
            System.out.println("\n\u001B[31mPor favor ingrese una entrada valida!\u001B[0m" );
            sc.nextLine();
        } while (true);
        
    }
    /**
     * Método para realizar el proceso de selección de una bebida
     * @param gato específico
     * @return la bebida elegida
     */
    public Bebida elegirBebida(GatoChef gato){
        Bebida bebida1= gato.bebida1();
        Bebida bebida2= gato.bebida2();
            do {
            Scanner sc = new Scanner(System.in);
            System.out.println( "\nElige el \u001B[32mnúmero\u001B[0m de bebida que te gustaría." );
			System.out.println("");
            System.out.println( "\u001B[32m1.\u001B[0m " + bebida1.nombre());
            bebida1.descripcionCompleta();
			System.out.println("");
            System.out.println( "\u001B[32m2.\u001B[0m " + bebida2.nombre());
            bebida2.descripcionCompleta();                  
            System.out.print("\n\u001B[32mNúmero de bebida elegida: \u001B[0m");


            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return bebida1;
                    case 2: 
                        return bebida2;
                    default:
                        break;
                }
            }
            System.out.println("\n\u001B[31mPor favor ingrese una entrada valida!\u001B[0m" );
            sc.nextLine();
        } while (true);
        
    }
    /**
     * Método para realizar el proceso de selección del postre
     * @param gato específico
     * @return el postre seleccionado
     */
    public Postre elegirPostre(GatoChef gato){
        Postre postre1= gato.postre1();
        Postre postre2= gato.postre2();
            do {
            Scanner sc = new Scanner(System.in);
            System.out.println( "\nElige el \u001B[32mnúmero\u001B[0m de postre que te gustaría." );
			System.out.println("");
            System.out.println( "\u001B[32m1.\u001B[0m " + postre1.nombre());
            postre1.descripcionCompleta();
			System.out.println("");
            System.out.println( "\u001B[32m2.\u001B[0m " + postre2.nombre());
            postre2.descripcionCompleta();
            System.out.print("\n\u001B[32mNúmero de postre elegido: \u001B[0m");

            if (sc.hasNextInt()) {
                int eleccion = sc.nextInt();
                switch (eleccion) {
                    case 1:
                        return postre1;
                    case 2: 
                        return postre2;
                    default:
                        break;
                }
            }
            System.out.println("\n\u001B[31mPor favor ingrese una entrada valida!\u001B[0m" );
            sc.nextLine();
        } while (true);
        
    }
}
