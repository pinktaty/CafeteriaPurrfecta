import java.awt.Desktop;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Clase que implementa la interfaz Estado y que representa el estado
 * en el que se despide al usuario porque ha podido pagar.
 */
public class ModoDespedir implements Estado {

    ControladorState controller;
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";

    /**
     * Constructor de la clase ModoDespedir.
     * @param controller El controlador asociado al estado.
     */
    public ModoDespedir(ControladorState controller) {
        this.controller = controller;
    }

    /**
     * Método para simular la acción de pagar en el estado de despedir.
     * Imprime mensajes relacionados con la acción.
     * Si ocurrió una pelea, muestra mensajes específicos para la situación.
     */
    public void pagar() {
        if (controller.ocurrioPelea()) {
            if (controller.usuarioGano()) {
                System.out.println("");
                System.out.println(MAGENTA + "-------------------------------");
                System.out.println("Piensas en pagar a pesar de haber ganado, pero no querrías hacer pasar por tal humillación a " + controller.getNombreChef() + ".");
                System.out.println("-------------------------------" + RESET);
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println(MAGENTA + "-------------------------------");
                System.out.println("Demasiado tarde, admite tus pecados y tus derrotas.");
                System.out.println("-------------------------------" + RESET);
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println(MAGENTA + "-------------------------------");
            System.out.println("Gracias a que te caíste de chiquito, parece ser que olvidaste que ya pagaste. " + controller.getNombreChef() + " te mira raro pero toma el dinero aún así.");
            System.out.println("-------------------------------" + RESET);
            System.out.println("");
        }
    }

    /**
     * Método para simular la acción de hablar con el chef en el estado de despedir.
     * Imprime mensajes relacionados con la acción.
     * Si ocurrió una pelea, muestra mensajes específicos para la situación.
     */
    public void hablarChef() {
        if (controller.ocurrioPelea()) {
            if (controller.usuarioGano()) {
                System.out.println("");
                System.out.println(MAGENTA + "-------------------------------");
                System.out.println("Le hablas a " + controller.getNombreChef() + ", pero no hay respuesta.");
                System.out.println("-------------------------------" + RESET);
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println(MAGENTA + "-------------------------------");
                System.out.println(controller.getNombreChef() + " no te mira, sólo te señala a la cocina para que vayas a lavar trastes.");
                System.out.println("-------------------------------" + RESET);
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println(MAGENTA + "-------------------------------");
            System.out.println("\"Gracias por venir, vuelve pronto.\"");
            System.out.println("-------------------------------" + RESET);
            System.out.println("");
        }
    }

    /**
     * Método para simular la acción de checar el platillo en el estado de despedir.
     * Imprime mensajes relacionados con la acción.
     * Si ocurrió una pelea, muestra mensajes específicos para la situación.
     */
    public void checarPlatillo() {
        if (controller.ocurrioPelea()) {
            if (controller.usuarioGano()) {
                System.out.println("");
                System.out.println(MAGENTA + "-------------------------------");
                System.out.println("Triunfante y con tu comida gratis, no puedes esperar a volver a tu casa para ver anime.");
                System.out.println("-------------------------------" + RESET);
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println(MAGENTA + "-------------------------------");
                System.out.println("Ahora tu platillo en la mesa es sólo una muestra más de tu derrota; volteas la mirada.");
                System.out.println("-------------------------------" + RESET);
                System.out.println("");
            }
        } else {
            System.out.println("");
            System.out.println(MAGENTA + "-------------------------------");
            System.out.println("El aroma de la comida hace que tus tripas rugan, comienzas a comer.");
            System.out.println("-------------------------------" + RESET);
            System.out.println("");
        }
    }

    /**
     * Método para simular la acción de despedirse en el estado de despedir.
     * Imprime mensajes relacionados con la acción y termina el programa.
     * Si ocurrió una pelea, muestra mensajes específicos para la situación
     * y abre una imagen relacionada con la derrota en el combate.
     */
		 public void despedirse(){
 		if(controller.ocurrioPelea()){
 			if(controller.usuarioGano()){
 				System.out.println("");
 				System.out.println(MAGENTA+"-------------------------------");
 				System.out.println("Sales de la tienda, feliz como una lombriz.");
 				System.out.println("-------------------------------"+RESET);
 				System.out.println("");
				try{
					File sonido = new File("assets/entrar.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch(Exception e){}
 				System.exit(0);
 			} else {
 				// AQUI
 				System.out.println("");
 				System.out.println(MAGENTA+"-------------------------------");
 				System.out.println("Ya no hay vuelta atrás, tus días de libertad se terminaron. Ahora ahora a lo que te dedicarás es a lavar trastes por siempre.");
 				System.out.println("-------------------------------"+RESET);
 				System.out.println("");
				try{
					File sonido = new File("assets/bomba.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
				} catch(Exception e){}
 				try{
 					int aux = numRandom();
 					File archivo = null;
 					if(aux == 0){
 						archivo = new File("assets/enojao1.jpeg");
 					} else if(aux == 1){
 						archivo = new File("assets/enojao2.jpeg");
 					} else {
 						archivo = new File("assets/enojao3.jpeg");
 					}
 					if(Desktop.isDesktopSupported()){
 						Desktop desktop = Desktop.getDesktop();
 						desktop.open(archivo);
 					}
 				} catch(IOException e){
 				}
 			}
 		} else {
 				System.out.println("");
 				System.out.println(MAGENTA+"-------------------------------");
 				System.out.println("Tu chef te da la gracias por haber venido y se pone a atender a otro cliente.");
 				System.out.println("Piensas en lo fugaces que son los momentos y en lo rápido que es el olvido y sales de la tienda.");
 				System.out.println("-------------------------------"+RESET);
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
 	}

	/**
	 * Método para simular la acción de pelear en el estado de despedirse.
	 * Imprime mensajes relacionados con la acción y termina el programa.
	 * Si ocurrió una pelea, muestra mensajes específicos para la situación.
	 */
	public void pelear(){
		if(controller.ocurrioPelea()){
			if(controller.usuarioGano()){
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println("Aún tienes hambre de sangre, pero sabes que no la encontrarás aquí.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
			} else {
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println("Aunque pelearas sucio, sabes que no tienes posibilidad, el pensamiento se va de tu mente.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
			}
		} else {
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println("Como último acto le gritas a los chefs que son unos nacos y estúpidos y te vas corriendo.");
				System.out.println("No te arrepientes de nada.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
				System.exit(0);
		}
	}

	/**
	 * Método auxiliar que regresa un número random entre 3 y 0
	 * @return numeroRandom: int
	 */
	private int numRandom(){
		int numeroRandom = (int) (Math.random() * 3);
		return numeroRandom;
	}

}

