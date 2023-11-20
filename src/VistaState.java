import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Clase que representa la vista del patrón state.
 * Esta clase maneja la interacción con el usuario y presenta menús para diferentes estados del programa.
 */
public class VistaState {

    public static final String RESET = "\u001B[0m";
    public static final String NEG = "\u001b[1m";
    public static final String CYAN = "\u001b[36m";
    public static final String YELLOW = "\u001B[33m";

    private ControladorState controller;

    /**
     * Constructor de la clase VistaState.
     * @param controller El controlador asociado a esta vista.
     */
    public VistaState(ControladorState controller) {
        this.controller = controller;
    }

    /**
     * Método para iniciar el juego.
     */
    public void start() {
        bienvenida();
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    case0();
                    break;
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                default:
                    caseDefault();
                    break;
            }
        }
    }

    /**
     * Método auxiliar que da la bienvenida al usuario.
     */
    private void bienvenida() {
		try{
			File sonido = new File("assets/entrar.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sonido));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch(Exception e){}
        System.out.println("");
        System.out.println("*** Bienvenid@ a GatocinaPurrfecta***");
        System.out.println("¿Cómo le podemos ayudar el día de hoy?");
    }

    /**
     * Método para recibir la elección del usuario e imprimir la opción correspondiente.
     * @param eleccion La opción seleccionada por el usuario.
     */
    private void recibirEleccion(int eleccion) {
        switch (eleccion) {
            case 1:
                controller.eleccion1();
                break;
            case 2:
                controller.eleccion2();
                break;
            case 3:
                controller.eleccion3();
                break;
            case 4:
                controller.eleccion4();
                break;
            case 5:
                controller.eleccion5();
								break;
            default:
                System.out.println("\u001B[31mPor favor introduce un número entre 1 y 5." + RESET);
        }
    }

    /**
     * Método para manejar las elecciones del estado inicial.
     */
    private void case0() {
        int eleccion = 0;
        do {
            Scanner sc = new Scanner(System.in);
            menu0();
            if (sc.hasNextInt()) {
                eleccion = sc.nextInt();
                recibirEleccion(eleccion);
            } else {
                System.out.println("\u001B[31m\u001b[1m\n\nPor favor ingrese una entrada válida!\n\u001B[0m");
                sc.nextLine();
            }
        } while (eleccion != 1);
    }

    /**
     * Método para manejar las elecciones del estado crear platillo.
     */
    private void case1() {
        int eleccion = 0;
        do {
            Scanner sc = new Scanner(System.in);
            menu1();
            if (sc.hasNextInt()) {
                eleccion = sc.nextInt();
                recibirEleccion(eleccion);
            } else {
                System.out.println("\u001B[31m\u001b[1m\n\nPor favor ingrese una entrada válida!\n\u001B[0m");
                sc.nextLine();
            }
        } while (eleccion != 2);
    }

    /**
     * Método para manejar las elecciones del estado del estado pagar.
     */
    private void case2() {
        int eleccion = 0;
        do {
            Scanner sc = new Scanner(System.in);
            menu2();
            if (sc.hasNextInt()) {
                eleccion = sc.nextInt();
                recibirEleccion(eleccion);
            } else {
                System.out.println("\u001B[31m\u001b[1m\n\nPor favor ingrese una entrada válida!\n\u001B[0m");
                sc.nextLine();
            }
        } while (eleccion != 3 && eleccion != 4);
    }

    /**
     * Método para el menú del estado pelear e irse.
     */
    private void caseDefault() {
        int eleccion = 0;
        do {
            Scanner sc = new Scanner(System.in);
            if (controller.ocurrioPelea()) {
                if (controller.finalizoPelea()) {
                    menu4();
                } else {
                    menu3();
                }
            } else {
                menu4();
            }
            if (sc.hasNextInt()) {
                eleccion = sc.nextInt();
                recibirEleccion(eleccion);
            } else {
                System.out.println("\u001B[31m\u001b[1m\n\nPor favor ingrese una entrada válida!\n\u001B[0m");
                sc.nextLine();
            }
        } while (true);
    }

    /**
     * Método para imprimir menú del estado elegir chef.
     */
    private void menu0() {
        System.out.println("");
        System.out.println("**Selecciona el" + CYAN + NEG + " número " + RESET + "de la opción que quieres.");
        System.out.println(NEG + CYAN + "1. " + YELLOW + "Elegir chef que le atenderá." + RESET);
        System.out.println(NEG + CYAN + "2. " + RESET + "Ver platillos.");
        System.out.println(NEG + CYAN + "3. " + RESET + "Dejar propina (sin haber consumido).");
        System.out.println(NEG + CYAN + "4. " + RESET + "Hacerla de a pedo (¿por qué no?).");
        System.out.println(NEG + CYAN + "5. " + RESET + "Irse.");
    }

    /**
     * Método para mprimir menú del estado crear platillo.
     */
    private void menu1() {
        System.out.println("");
        System.out.println(controller.getChefAscii());
        System.out.println("");
        System.out.println("**Selecciona el" + CYAN + NEG + " número " + RESET + "de la opción que quieres.");
        System.out.println(NEG + CYAN + "1. " + RESET + "Hablar con el chef.");
        System.out.println(NEG + CYAN + "2. " + YELLOW + "Ordenar." + RESET);
        System.out.println(NEG + CYAN + "3. " + RESET + "Dejar propina (sin haber consumido).");
        System.out.println(NEG + CYAN + "4. " + RESET + "Hacerla de a pedo (¿por qué no?).");
        System.out.println(NEG + CYAN + "5. " + RESET + "Irse.");
    }

    /**
     * Método para mprimir menú del estado de pagar.
     */
    private void menu2() {
        System.out.println("");
        System.out.println(controller.getChefAscii());
        System.out.println("");
        System.out.println("**Selecciona el" + CYAN + NEG + " número " + RESET + "de la opción que quieres.");
		System.out.println(NEG+CYAN+"1. " +RESET+ "Hablar con el chef.");
		System.out.println(NEG+CYAN+"2. " +RESET+ "Apreciar comida.");
		System.out.println(NEG+CYAN+"3. " +YELLOW+ "Pagar."+RESET);
		System.out.println(NEG+CYAN+"4. " +RESET+ "Hacerla de a pedo (¿por qué no?).");
		System.out.println(NEG+CYAN+"5. " +RESET+ "Irse.");
	}

	/**
	 * Método para mprimir menú del estado pelear.
	 */
	public void menu3(){
		System.out.println("");
		System.out.println(controller.getChefAscii());
		System.out.println("");
		System.out.println("**Selecciona el"+CYAN+NEG+ " número " +RESET+ "de la opción que quieres.");
		System.out.println(NEG+CYAN+"1. " +RESET+ "Hablar con el chef.");
		System.out.println(NEG+CYAN+"2. " +RESET+ "Apreciar comida.");
		System.out.println(NEG+CYAN+"3. " +RESET+ "Dejar propina.");
		System.out.println(NEG+CYAN+"4. " +YELLOW+ "Luchar por tu vida."+RESET);
		System.out.println(NEG+CYAN+"5. " +RESET+ "Irse.");
	}

	/**
	 * Método para mprimir menú del estado irse.
	 */
	public void menu4(){
		System.out.println("");
		System.out.println(controller.getChefAscii());
		System.out.println("");
		System.out.println("**Selecciona el"+CYAN+NEG+ " número " +RESET+ "de la opción que quieres.");
		System.out.println(NEG+CYAN+"1. " +RESET+ "Hablar con el chef.");
		System.out.println(NEG+CYAN+"2. " +RESET+ "Apreciar comida.");
		System.out.println(NEG+CYAN+"3. " +RESET+ "Dejar propina.");
		System.out.println(NEG+CYAN+"4. " +RESET+ "Hacerla de a pedo (¿por qué no?).");
		System.out.println(NEG+CYAN+"5. " +YELLOW+ "Irse."+RESET);
	}

}
