import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

import java.util.Scanner;

/**
 * Clase que implementa la interfaz Estado y representa el estado
 * en el que el gato debe pelear contra el usuario porque no ha podido pagar.
 */
public class ModoPelear implements Estado {

    private ControladorState controller;
    private GatoChef gato;
    private int vidaGato;
    private int vidaUsuario;
    public static final String RESET = "\u001B[0m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String NEG = "\u001b[1m";

    /**
     * Constructor de la clase ModoPelear.
     * @param controller El controlador asociado al estado.
     */
    public ModoPelear(ControladorState controller) {
        this.controller = controller;
        this.vidaGato = 0;
        this.vidaUsuario = 130;
    }

    /**
     * Método para simular la acción de pagar en el estado de pelear.
     * Muestra mensajes relacionados con la acción.
     */
    public void pagar() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Ves tu vida pasar frente a tus ojos y decides pedir misericordia.");
        System.out.println(controller.getNombreChef() + " se ríe. \"Es demasiado tarde para eso\" te dice.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de hablar con el chef en el estado de pelear.
     * Muestra mensajes relacionados con la acción.
     */
    public void hablarChef() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Ves a " + controller.getNombreChef() + " afilándose las uñas.");
        System.out.println("Ya no se ve tan tierno ahora.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de checar el platillo en el estado de pelear.
     * Muestra mensajes relacionados con la acción.
     */
    public void checarPlatillo() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Tu platillo sigue en la mesa, no sabes si la pelea valdrá la pena.");
        System.out.println("Tus tripas rugen y quieres creer que sí.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de despedirse en el estado de pelear.
     * Muestra mensajes de despedida y termina el programa.
     */
    public void despedirse() {
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("Recuerdas a Epicteto, quien decía que \"El arte de la vida consiste en hacer que las peleas elegidas valgan la pena, sabiendo que algunas batallas se ganan al dejarlas ir.\"");
        System.out.println("Así que decides correr, como un cobarde.");
        System.out.println(controller.getNombreChef() + " es más rápido, te atrapa, ya no tienes escapatoria.");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
    }

    /**
     * Método para simular la acción de pelear en el estado de pelear.
     * Inicia la pelea entre el usuario y el gato chef.
     */
    public void pelear() {
        this.gato = controller.obtenerChef();
        this.vidaGato = gato.getVida();
        System.out.println("");
        System.out.println(MAGENTA + "-------------------------------");
        System.out.println("La pelea ha comenzado, ¿estás listo para ser humillado?");
        System.out.println("-------------------------------" + RESET);
        System.out.println("");
        boolean quienGano = iniciarPelea();
        if (quienGano) {
            controller.ganoUsuario();
        }
        controller.horaDeIrse();
    }

    /**
     * Método auxiliar que inicia la pelea.
     * @return true si gana el usuario, false si gana el gato
     */
    private boolean iniciarPelea() {
        if (controller.usuarioDejoPropina()) {
            System.out.println("");
            System.out.println(MAGENTA + "-------------------------------");
            System.out.println("Tu pasada generosidad tiene recompensas ahora. Por haber dejado propina ganas 30 extra de vida.");
            System.out.println("-------------------------------" + RESET);
            System.out.println("");
            vidaUsuario = vidaUsuario + 30;
        }

		System.out.println("");
		System.out.println(MAGENTA+"-------------------------------");
		System.out.println(controller.getNombreChef() + " tiene " + vidaGato + " de vida.");
		System.out.println("Tu tienes " + vidaUsuario + " de vida.");
		System.out.println("-------------------------------"+RESET);
		System.out.println("");
		while(true){
			int ataque = numRandom();
			if(ataque == 0){
				try{
					File sonido = new File("assets/sarten.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch(Exception e){}
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println(controller.getNombreChef() + " te ha golpeado con un sarten. Pierdes " + gato.ataque1() + " de vida.");
				vidaUsuario -= gato.ataque1();
				System.out.println("Tienes " + vidaUsuario + " de vida.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
			} else if(ataque == 1){
				try{
					File sonido = new File("assets/raton.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch(Exception e){}
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println(controller.getNombreChef() + " te ha traído un ratón, ahora tienes tularemia. Pierdes " + gato.ataque2() + " de vida.");
				vidaUsuario -= gato.ataque2();
				System.out.println("Tienes " + vidaUsuario + " de vida.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
			} else {
				try{
					File sonido = new File("assets/pipi.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch(Exception e){}
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println(controller.getNombreChef() + " te mió tu mochila. El impacto del olor es demasiado. Pierdes " + gato.ataque3() + " de vida.");
				vidaUsuario -= gato.ataque3();
				System.out.println("Tienes " + vidaUsuario + " de vida.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
			}

			if(vidaUsuario > 0 && vidaGato > 0){
				usuarioPelea();
			} else if(vidaGato < 1){
				try{
					File sonido = new File("assets/ganar.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch(Exception e){}
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println("¡Has ganado! Nadie lo creía pero ha sido así, no dudes que tu chef se vengará tarde o temprano.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
				controller.peleaFinalizada();
				return true;
			} else {
				try{
					File sonido = new File("assets/perder.wav");
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sonido));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch(Exception e){}
				System.out.println("");
				System.out.println(MAGENTA+"-------------------------------");
				System.out.println("Te han dado el ataque final, aceptar tu derrota es tu única opción.");
				System.out.println("-------------------------------"+RESET);
				System.out.println("");
				controller.peleaFinalizada();
				return false;
			}
		}
	}

	/**
	 * Método auxiliar para que el usuario pelee de vuelta
	 */
	private void usuarioPelea(){
		System.out.println("");
		System.out.println("¿Cómo quieres responder?");
		System.out.println(NEG+CYAN+"1. " +RESET+ "Mostrar aprecio.");
		System.out.println(NEG+CYAN+"2. " +RESET+ "Espantar.");
		System.out.println(NEG+CYAN+"3. " +RESET+ "Mojar.");
		System.out.println(NEG+CYAN+"4. " +RESET+ "Distraer.");
		System.out.println(NEG+CYAN+"5. " +RESET+ "Abrazos, no balazos.");
		System.out.println("");
		System.out.println(NEG+CYAN+"Cualquier otra tecla. " +RESET+ "*No hace nada.*");

		Scanner s = new Scanner(System.in);
		if(s.hasNextInt()){
			int aux = s.nextInt();
			switch(aux){
				case 1:
					try{
						File sonido = new File("assets/abrazo.wav");
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sonido));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength() / 1000);
					} catch(Exception e){}
					System.out.println("");
					System.out.println(MAGENTA+"-------------------------------");
					System.out.println("Abrazas a " + controller.getNombreChef() + " con mucha fuerza, está tan disgustado por tanto amor que pierde 30 de vida.");
					vidaGato -= 30;
					System.out.println(controller.getNombreChef() + " tiene " + vidaGato + " de vida.");
					System.out.println("-------------------------------"+RESET);
					System.out.println("");
					break;
				case 2:
					try{
						File sonido = new File("assets/perros.wav");
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sonido));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength() / 1000);
					} catch(Exception e){}
					System.out.println("");
					System.out.println(MAGENTA+"-------------------------------");
					System.out.println("En tu teléfono pones el sonido de perros ladrando. " + controller.getNombreChef() + " se asusta y pierde 15 de vida.");
					vidaGato -= 15;
					System.out.println(controller.getNombreChef() + " tiene " + vidaGato + " de vida.");
					System.out.println("-------------------------------"+RESET);
					System.out.println("");
					break;
				case 3:
					try{
						File sonido = new File("assets/lanzarAgua.wav");
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sonido));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength() / 1000);
					} catch(Exception e){}
					System.out.println("");
					System.out.println(MAGENTA+"-------------------------------");
					System.out.println("Sacas una pistola de agua y le echas agua. " + controller.getNombreChef() + " se enfurece y pierde 20 de vida.");
					vidaGato -= 20;
					System.out.println(controller.getNombreChef() + " tiene " + vidaGato + " de vida.");
					System.out.println("-------------------------------"+RESET);
					System.out.println("");
					break;
				case 4:
					try{
						File sonido = new File("assets/laser.wav");
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sonido));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength() / 1000);
					} catch(Exception e){}
					System.out.println("");
					System.out.println(MAGENTA+"-------------------------------");
					System.out.println("Misteriosamente un punto rojo aparece en el suelo. " + controller.getNombreChef() + " se distrae para perseguirlo, pierde 25 de vida.");
					vidaGato -= 25;
					System.out.println(controller.getNombreChef() + " tiene " + vidaGato + " de vida.");
					System.out.println("-------------------------------"+RESET);
					System.out.println("");
					break;
				case 5:
					try{
						File sonido = new File("assets/noDialogo.wav");
						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(sonido));
						clip.start();
						Thread.sleep(clip.getMicrosecondLength() / 1000);
					} catch(Exception e){}
					System.out.println("");
					System.out.println(MAGENTA+"-------------------------------");
					System.out.println("Intentas dialogar con " + controller.getNombreChef() + ", pero está tan enojado que eso sólo lo enfurece más.");
					System.out.println("Te gruñe y te lanza una mordida, te salvas por muy poco.");
					vidaUsuario -= 5;
					System.out.println("Pierdes 5 de vida.");
					System.out.println("-------------------------------"+RESET);
					System.out.println("");
					break;
				default:
					break;
			}
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
