/**
 * La clase {GatoMexicano} extiende la clase abstracta {GatoChef} e implementa las características
 * específicas de un gato chef mexicano. Este gato tiene una cantidad de vida, una representación visual,
 * un nombre, y habilidades culinarias centradas en la cocina mexicana.
 */
public class GatoMexicano extends GatoChef {

    /** La cantidad de vida del gato mexicano. */
    private int vida = 120;

    /**
     * Obtiene la cantidad de vida del gato mexicano.
     *
     * @return La cantidad de vida del gato mexicano.
     */
    public int getVida() {
        return this.vida;
    }

    /**
     * Devuelve una cadena que representa la presentación del gato mexicano,
     * incluyendo su nombre y presentación general.
     *
     * @return Una cadena que representa la presentación del gato mexicano.
     */
    @Override
    public String presentarse() {
        return nombre() + "\n" + presentacion();
    }

    /**
     * Obtiene la representación visual del gato mexicano en forma de arte ASCII.
     *
     * @return La representación visual del gato mexicano.
     */
    @Override
    public String getRepresentacion() {
        String gatoMexicano =
            color() +
            "      /\\_/\\\n" +
            " /\\  / o o \\\n" +
            "//\\\\ \\~(*)~/\n" +
            "`  \\/   ^ /\n" +
            "   | \\|| ||\n" +
            "   \\ '|| ||\n" +
            "    \\)()-())" + "\u001B[0m";
        return gatoMexicano;
    }

    /**
     * Obtiene el nombre del gato mexicano.
     *
     * @return El nombre del gato mexicano.
     */
    @Override
    public String getNombre() {
        return "Pancho";
    }

    /**
     * Obtiene el código de color asociado al gato mexicano.
     *
     * @return El código de color asociado al gato mexicano.
     */
    @Override
    public String color() {
        return "\u001B[38;5;57m"; // Devuelve el código de color violeta
    }

    /**
     * Obtiene el nombre y la presentación del gato mexicano con el código de color correspondiente.
     *
     * @return El nombre y la presentación del gato mexicano con formato de color.
     */
    @Override
    public String nombre() {
        return color() + "Hola!, mi nombre es Pancho y soy Tabasqueño" + "\u001B[0m";
    }

    /**
     * Obtiene la presentación culinaria del gato mexicano con el código de color correspondiente.
     *
     * @return La presentación culinaria del gato mexicano con formato de color.
     */
    @Override
    public String presentacion() {
        return color() + "Soy especialista en comida mexicana, anímate a escogerme carnal" + "\u001B[0m";
    }

    /**
     * Obtiene el primer plato fuerte que el gato mexicano puede preparar.
     *
     * @return El primer plato fuerte del gato mexicano.
     */
    @Override
    public PlatoFuerte plato1() {
        return new MoleConPolloGato1();
    }

    /**
     * Obtiene el segundo plato fuerte que el gato mexicano puede preparar.
     *
     * @return El segundo plato fuerte del gato mexicano.
     */
    @Override
    public PlatoFuerte plato2() {
        return new HuaracheVelozGato1();
    }

    /**
     * Obtiene la primera bebida que el gato mexicano puede preparar.
     *
     * @return La primera bebida del gato mexicano.
     */
    @Override
    public Bebida bebida1() {
        return new AguaHorchataGato1();
    }

    /**
     * Obtiene la segunda bebida que el gato mexicano puede preparar.
     *
     * @return La segunda bebida del gato mexicano.
     */
    @Override
    public Bebida bebida2() {
        return new MezcalGato1();
    }

    /**
     * Obtiene el primer postre que el gato mexicano puede preparar.
     *
     * @return El primer postre del gato mexicano.
     */
    @Override
    public Postre postre1() {
        return new PayMazapanGato1();
    }

    /**
     * Obtiene el segundo postre que el gato mexicano puede preparar.
     *
     * @return El segundo postre del gato mexicano.
     */
    @Override
    public Postre postre2() {
        return new ChurrosGato1();
    }

    /**
     * Obtiene el valor de ataque para la primera habilidad del gato mexicano.
     *
     * @return El valor de ataque para la primera habilidad.
     */
    @Override
    public int ataque1() {
        return 5;
    }

    /**
     * Obtiene el valor de ataque para la segunda habilidad del gato mexicano.
     *
     * @return El valor de ataque para la segunda habilidad.
     */
    @Override
    public int ataque2() {
        return 20;
    }

    /**
     * Obtiene el valor de ataque para la tercera habilidad del gato mexicano.
     *
     * @return El valor de ataque para la tercera habilidad.
     */
    @Override
    public int ataque3() {
        return 40;
    }
}
