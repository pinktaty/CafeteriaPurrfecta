import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Clase que implementa la interfaz Estado y representa el estado
 * en el que el usuario puede realizar el pago.
 */
public class ModoPagar implements Estado {

    private ControladorState controller;
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";

    /**
     * Constructor de la clase ModoPagar.
     * @param controller El controlador asociado al estado.
     */
    public ModoPagar(ControladorState controller) {
        this.controller = controller;
    }

    /**
     * Método para simular la acción de pagar en el estado de pagar.
     * Verifica si el pago fue aceptado y toma acciones según el resultado.
     */
    public void pagar() {
        boolean pagoAceptado = controller.fuePagoAceptado();
        if (pagoAceptado) {
			try{
				File sonido = new File("assets/pagar.wav");
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sonido));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength() / 1000);
			} catch(Exception e){}
            controller.horaDeIrse();
        } else {
            System.out.println("");
            System.out.println(MAGENTA + "-------------------------------");
            System.out.println("Oh no, parece que tu pago no ha pasado.");
            System.out.println(controller.getNombreChef() + " te mira con dureza, cree que le has intentado ver la cara de tonto.");
            System.out.println("Ahora tienes que pelear por tu derecho a vivir.");
            System.out.println("-------------------------------" + RESET);
            System.out.println("");
			try{
				File sonido = new File("assets/gatoEnojao.wav");
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sonido));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength() / 1000);
			} catch(Exception e){}
            controller.elUsuarioPelea();
            controller.pelea();
        }
    }

    /**
     * Método para simular la acción de hablar con el chef en el estado de pagar.
     * Muestra mensajes relacionados con la acción.
     */
    public void hablarChef() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Le preguntas a " + controller.getNombreChef() + " cómo ha gastado sus vidas pasadas.");
        System.out.println("Te responde \"Eso no se pregunta\". Pasas vergüenza, como sueles hacerlo.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de checar el platillo en el estado de pagar.
     * Muestra mensajes relacionados con la acción.
     */
    public void checarPlatillo() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Hueles el delicioso aroma de tu comida.");
        System.out.println("Se te ocurre que la vida merece ser vivida.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de despedirse en el estado de pagar.
     * Muestra mensajes de despedida y termina el programa.
     */
    public void despedirse() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Decides irte sin pagar, intentas correr hacia la puerta del restaurante pero entre los 3 chefs te atrapan.");
        System.out.println("Sus garras son filosas y te hacen reflexionar. Sabes que tomaste una mala decisión");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de pelear en el estado de pagar.
     * Muestra mensajes relacionados con la acción.
     */
    public void pelear() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Has decidido luchar por tu derecho a comer.");
        System.out.println("A " + controller.getNombreChef() + " le llegan días de antaño a su memoria, cuando solo era un gatito en las frías calles.");
        System.out.println("No sabes si has tomado la decisión correcta, la pelea será difícil.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
		try{
			File sonido = new File("assets/gatoEnojao.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sonido));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength() / 1000);
		} catch(Exception e){}
        controller.elUsuarioPelea();
        controller.pelea();
    }
}
