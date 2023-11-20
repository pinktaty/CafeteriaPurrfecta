
public abstract class GatoChef {
    // Colores para la presentación del personaje.
    public static final String RESET = "\u001B[0m";
    public static final String NEG = "\u001b[1m";
    public static final String RESET_NEG = "\u001b[0m";
        /**
     * Devuelve una cadena que representa la presentación general del personaje.
     *
     * @return Una cadena con la presentación del personaje.
     */
    public abstract String presentarse();

    /**
     * Devuelve una cadena que representa el color del personaje.
     *
     * @return Una cadena con el color del personaje.
     */
    public abstract String color();

    /**
     * Devuelve una cadena que representa el nombre del personaje.
     *
     * @return Una cadena con el nombre del personaje.
     */
    public abstract String nombre();

    /**
     * Devuelve una cadena que representa la presentación específica del personaje, es decir, el conjunto
     * de todas las caracteristicas del personaje.
     *
     * @return Una cadena con la presentación específica del personaje.
     */
    public abstract String presentacion();

    /**
     * Devuelve un entero que representa el valor de ataque del primer ataque del personaje.
     *
     * @return Un entero con el valor de ataque del primer ataque.
     */
    public abstract int ataque1();

    /**
     * Devuelve un entero que representa el valor de ataque del segundo ataque del personaje.
     *
     * @return Un entero con el valor de ataque del segundo ataque.
     */
    public abstract int ataque2();

    /**
     * Devuelve un entero que representa el valor de ataque del tercer ataque del personaje.
     *
     * @return Un entero con el valor de ataque del tercer ataque.
     */
    public abstract int ataque3();

	/**
	 * Método que devuelve la representación en ascii del gato
	 * @return String 
	 */
	public abstract String getRepresentacion();
    /**
     * Método que representa el plato1 fuerte del gato específico
     * @return el plato fuerte 1
     */
    public abstract PlatoFuerte plato1();
    /**
     * Método que representa el plato2 fuerte del gato específico
     * @return el plato fuerte 2
     */
    public abstract PlatoFuerte plato2();
    /**
     * Método que representa la bebida1 del gato específico
     * @return la bebida 1 del menú del gato
     */
    public abstract Bebida bebida1();
    /**
     * Método que representa la bebida2 del gato específico
     * @return la bebida 2 del menú del gato
     */
    public abstract Bebida bebida2();
    /**
     * Método que representa el postre1 del gato específico
     * @return el postre 1 del menú del gato
     */
    public abstract Postre postre1();
    /**
     * Método que representa el postre2 del gato específico
     * @return el postre 2 del menú del gato
     */
    public abstract Postre postre2();

	/**
	 * Método que el nombre individual del gato
	 * @return nombre del gato
	 */

	public abstract String getNombre();
	/**
	 * Método que regresa la vida del gato
	 * @return vida del gato
	 */
	public abstract int getVida();

    /**
     * Método que imprime el menú del gato específico
     * @param gato específico
     */
    public void menuGato(GatoChef gato){
        String color = gato.color(); 
        System.out.println(NEG+color+"***PLATO FUERTE***"+RESET+color+"\n\n*"+plato1().nombre()+RESET);
        plato1().descripcionCompleta();
        System.out.println(  color+"\n*"+plato2().nombre()+RESET);
        plato2().descripcionCompleta();
        System.out.println(NEG+ color+"***BEBIDA***"+RESET+color+"\n\n*"+bebida1().nombre()+RESET);
        bebida1().descripcionCompleta();
        System.out.println( color+"\n*"+bebida2().nombre()+RESET);
        bebida2().descripcionCompleta();
        System.out.println(NEG+ color+"***POSTRE***"+RESET+color+"\n\n*"+postre1().nombre()+RESET);
        postre1().descripcionCompleta();
        System.out.println(  color+"\n*"+postre2().nombre()+RESET);
        postre2().descripcionCompleta();
    }


    
}
