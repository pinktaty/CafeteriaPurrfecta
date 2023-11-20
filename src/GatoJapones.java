/**
 * La clase {GatoJapones} extiende la clase abstracta {GatoChef} e implementa las características
 * específicas de un gato chef japonés. Este gato tiene una cantidad de vida, una representación visual,
 * un nombre, y habilidades culinarias centradas en la cocina tradicional japonesa.
 */
public class GatoJapones extends GatoChef {

    /** La cantidad de vida del gato japonés. */
    private int vida = 110;

    /**
     * Obtiene la cantidad de vida del gato japonés.
     *
     * @return La cantidad de vida del gato japonés.
     */
    public int getVida() {
        return this.vida;
    }

    /**
     * Devuelve una cadena que representa la presentación del gato japonés,
     * incluyendo su nombre y presentación general.
     *
     * @return Una cadena que representa la presentación del gato japonés.
     */
    @Override
    public String presentarse() {
        return nombre() + "\n" + presentacion();
    }

    /**
     * Obtiene la representación visual del gato japonés en forma de arte ASCII.
     *
     * @return La representación visual del gato japonés.
     */
    @Override
    public String getRepresentacion() {
        String gatoJapones =
            color() +
            "  /\\_/\\  (\n" +
            " ( ^.^ ) _)\n" +
            "   \\\"/  (\n" +
            " ( | | )\n" +
            "(__d b__)" + "\u001B[0m";
        return gatoJapones;
    }

    /**
     * Obtiene el nombre del gato japonés.
     *
     * @return El nombre del gato japonés.
     */
    @Override
    public String getNombre() {
        return "Taro";
    }

    /**
     * Obtiene el código de color asociado al gato japonés.
     *
     * @return El código de color asociado al gato japonés.
     */
    @Override
    public String color() {
        return "\u001B[31m"; // Devuelve el código de color rojo
    }

    /**
     * Obtiene el nombre y la presentación del gato japonés con el código de color correspondiente.
     *
     * @return El nombre y la presentación del gato japonés con formato de color.
     */
    @Override
    public String nombre() {
        return color() + "Arigato! Mi nombre es Taro y soy originario de Japón." + "\u001B[0m";
    }

    /**
     * Obtiene la presentación culinaria del gato japonés con el código de color correspondiente.
     *
     * @return La presentación culinaria del gato japonés con formato de color.
     */
    @Override
    public String presentacion() {
        return color() + "Soy un experto en la cocina tradicional japonesa. Elígeme para probar la gastronomía japonesa." + "\u001B[0m";
    }

    /**
     * Obtiene el valor de ataque para la primera habilidad del gato japonés.
     *
     * @return El valor de ataque para la primera habilidad.
     */
    @Override
    public int ataque1() {
        return 15;
    }

    /**
     * Obtiene el valor de ataque para la segunda habilidad del gato japonés.
     *
     * @return El valor de ataque para la segunda habilidad.
     */
    @Override
    public int ataque2() {
        return 25;
    }

    /**
     * Obtiene el valor de ataque para la tercera habilidad del gato japonés.
     *
     * @return El valor de ataque para la tercera habilidad.
     */
    @Override
    public int ataque3() {
        return 35;
    }

    /**
     * Obtiene el primer plato fuerte que el gato japonés puede preparar.
     *
     * @return El primer plato fuerte del gato japonés.
     */
    @Override
    public PlatoFuerte plato1() {
        return new RamenGato3();
    }

    /**
     * Obtiene el segundo plato fuerte que el gato japonés puede preparar.
     *
     * @return El segundo plato fuerte del gato japonés.
     */
    @Override
    public PlatoFuerte plato2() {
        return new OnigiriGato3();
    }

    /**
     * Obtiene la primera bebida que el gato japonés puede preparar.
     *
     * @return La primera bebida del gato japonés.
     */
    @Override
    public Bebida bebida1() {
        return new TeVerdeGato3();
    }

    /**
     * Obtiene la segunda bebida que el gato japonés puede preparar.
     *
     * @return La segunda bebida del gato japonés.
     */
    @Override
    public Bebida bebida2() {
        return new SakeGato3();
    }

    /**
     * Obtiene el primer postre que el gato japonés puede preparar.
     *
     * @return El primer postre del gato japonés.
     */
    @Override
    public Postre postre1() {
        return new MitarashiDangoGato3();
    }

    /**
     * Obtiene el segundo postre que el gato japonés puede preparar.
     *
     * @return El segundo postre del gato japonés.
     */
    @Override
    public Postre postre2() {
        return new MochiGato3();
    }
}
