import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Clase que implementa la interfaz Estado y que representa el estado
 * en el que el usuario puede crear su platillo.
 */
public class ModoCrearPlatillo implements Estado {

    private ControladorState controller;
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";

    /**
     * Constructor de la clase ModoCrearPlatillo.
     * @param controller El controlador asociado al estado.
     */
    public ModoCrearPlatillo(ControladorState controller) {
        this.controller = controller;
    }

    /**
     * Método para simular la acción de pagar en el estado de creación de platillo.
     * Imprime mensajes relacionados con la acción.
     */
    public void pagar() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        if (controller.usuarioDejoPropina()) {
            System.out.println("Conocer al chef te convenció todavía más; ahora eres su fan número uno y decides agregar nuevamente $30 a la jarra de propinas.");
        } else {
            System.out.println("Tras haber elegido a " + controller.getNombreChef() + ", decides ahora ser su fan número uno.");
            System.out.println("Encuentras un billete de $50 en tu pantalón y lo agregas a la jarra de las propinas.");
        }
        System.out.println("Crees que has oído a tu " + controller.getNombreChef() + " ronronear, pero no estás seguro.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
        controller.agregarPropina();
    }

    /**
     * Método para simular la acción de hablar con el chef en el estado de creación de platillo.
     * Imprime mensajes relacionados con la acción.
     */
    public void hablarChef() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Le hablas a " + controller.getNombreChef() + ", quien estaba cocinando otra orden y, porque lo distrajiste, se quema un bigote.");
        System.out.println("Te mira feo y te ignora.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de checar el platillo en el estado de creación de platillo.
     * Llama a métodos del controlador para agregar el platillo y cambiar el estado del videojuego.
     */
    public void checarPlatillo() {
		try{
			File sonido = new File("assets/platos.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sonido));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch(Exception e){}
        controller.agregarPlatillo();
        controller.platilloCreado();
    }

    /**
     * Método para simular la acción de despedirse en el estado de creación de platillo.
     * Imprime mensajes relacionados con la acción y termina el programa.
     */
    public void despedirse() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Has herido el ego de " + controller.getNombreChef() + ", quien cree que te has ido porque no te ha gustado su presentación.");
        System.out.println("Te recordará por el resto de sus 7 vidas. No agradablemente.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
		try{
			File sonido = new File("assets/entrar.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sonido));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch(Exception e){}
        System.exit(0);
    }

    /**
     * Método para simular la acción de pelear en el estado de creación de platillo.
     * Imprime mensajes relacionados con la acción.
     */
    public void pelear() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Te entra la esquizofrenia y decides atacar a " + controller.getNombreChef() + " con agua.");
        System.out.println(controller.getNombreChef() + " te rasguña la cara; parece que ahora tendrás una cicatriz de por vida.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }
}
