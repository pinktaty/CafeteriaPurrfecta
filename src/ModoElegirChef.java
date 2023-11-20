import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Clase que implementa la interfaz Estado y que representa el estado
 * en el que el usuario puede elegir a su chef.
 */
public class ModoElegirChef implements Estado {

    ControladorState controller;
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";

    /**
     * Constructor de la clase ModoElegirChef.
     * @param controller El controlador asociado al estado.
     */
    public ModoElegirChef(ControladorState controller) {
        this.controller = controller;
    }

    /**
     * Método para simular la acción de pagar en el estado de elegir chef.
     * Agrega propina y muestra mensajes relacionados con la acción.
     */
    public void pagar() {
        controller.agregarPropina();
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Has decidido que los gatos chefs son tan adorables que les vas a dejar propina solo por bonitos.");
        System.out.println("Encuentras un billete de $20 en tu pantalón y lo agregas a la jarra de las propinas.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
        controller.agregarPropina();
    }

    /**
     * Método para simular la acción de hablar con el chef en el estado de elegir chef.
     * Agrega un chef al juego y cambia al estado de crear platillo.
     */
    public void hablarChef() {
		try{
			File sonido = new File("assets/chefPresentación.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sonido));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch(Exception e){}
        controller.agregarChef();
        controller.chefElegido();
    }

    /**
     * Método para simular la acción de checar el platillo en el estado de elegir chef.
     * Muestra mensajes relacionados con la acción.
     */
    public void checarPlatillo() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("El aroma de la cocina inunda tus sentidos del olfato, te da hambre.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de despedirse en el estado de elegir chef.
     * Muestra mensajes de despedida y termina el programa.
     */
    public void despedirse() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Willians estaba en lo cierto cuando escribió: \"Siempre hay un tiempo para marchar, aunque no haya sitio a donde ir.\" Esperamos volver a verte.");
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
     * Método para simular la acción de pelear en el estado de elegir chef.
     * Muestra mensajes relacionados con la acción.
     */
    public void pelear() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Te conviertes en una Karen de repente y comienzas a gritonear.");
        System.out.println("Todos te ignoran.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }
}
