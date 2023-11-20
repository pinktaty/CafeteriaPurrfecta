/**
 * La clase {GatoItaliano} extiende la clase abstracta {GatoChef} e implementa las características
 * específicas de un gato chef italiano. Este gato tiene una cantidad de vida, una representación visual,
 * un nombre, y habilidades culinarias centradas en la cocina italiana.
 */
public class GatoItaliano extends GatoChef {

    /** La cantidad de vida del gato italiano. */
    private int vida = 150;

    /**
     * Obtiene la cantidad de vida del gato italiano.
     *
     * @return La cantidad de vida del gato italiano.
     */
    public int getVida() {
        return this.vida;
    }

    /**
     * Devuelve una cadena que representa la presentación del gato italiano,
     * incluyendo su nombre y presentación general.
     *
     * @return Una cadena que representa la presentación del gato italiano.
     */
    @Override
    public String presentarse() {
        return nombre() + "\n" + presentacion();
    }

    /**
     * Obtiene la representación visual del gato italiano en forma de arte ASCII.
     *
     * @return La representación visual del gato italiano.
     */
    @Override
    public String getRepresentacion() {
        String gatoItaliano =
            color() +
            "|\\__/,|   (`\\\n" +
            "|_ _  |.--.) )\n" +
            "( T   )     /\n" +
            "(((^_(((/(((_/" + "\u001B[0m";
        return gatoItaliano;
    }

    /**
     * Obtiene el nombre del gato italiano.
     *
     * @return El nombre del gato italiano.
     */
    @Override
    public String getNombre() {
        return "Luigi";
    }

    /**
     * Obtiene el código de color asociado al gato italiano.
     *
     * @return El código de color asociado al gato italiano.
     */
    @Override
    public String color() {
        return "\u001B[33m"; // Devuelve el código de color café
    }

    /**
     * Obtiene el nombre y la presentación del gato italiano con el código de color correspondiente.
     *
     * @return El nombre y la presentación del gato italiano con formato de color.
     */
    @Override
    public String nombre() {
        return color() + "Ciao! Mi nombre e Luigi e sono italiano" + "\u001B[0m";
    }

    /**
     * Obtiene la presentación culinaria del gato italiano con el código de color correspondiente.
     *
     * @return La presentación culinaria del gato italiano con formato de color.
     */
    @Override
    public String presentacion() {
        return color() + "Sono uno chef esperto in cucina italiana. Vieni per un'esperienza deliziosa!" + "\u001B[0m";
    }

    /**
     * Obtiene el valor de ataque para la primera habilidad del gato italiano.
     *
     * @return El valor de ataque para la primera habilidad.
     */
    @Override
    public int ataque1() {
        return 10;
    }

    /**
     * Obtiene el valor de ataque para la segunda habilidad del gato italiano.
     *
     * @return El valor de ataque para la segunda habilidad.
     */
    @Override
    public int ataque2() {
        return 25;
    }

    /**
     * Obtiene el valor de ataque para la tercera habilidad del gato italiano.
     *
     * @return El valor de ataque para la tercera habilidad.
     */
    @Override
    public int ataque3() {
        return 35;
    }

    /**
     * Obtiene el primer plato fuerte que el gato italiano puede preparar.
     *
     * @return El primer plato fuerte del gato italiano.
     */
    @Override
    public PlatoFuerte plato1() {
        return new LasagnaGato2();
    }

    /**
     * Obtiene el segundo plato fuerte que el gato italiano puede preparar.
     *
     * @return El segundo plato fuerte del gato italiano.
     */
    @Override
    public PlatoFuerte plato2() {
        return new PizzaGato2();
    }

    /**
     * Obtiene la primera bebida que el gato italiano puede preparar.
     *
     * @return La primera bebida del gato italiano.
     */
    @Override
    public Bebida bebida1() {
        return new MacchiatoGato2();
    }

    /**
     * Obtiene la segunda bebida que el gato italiano puede preparar.
     *
     * @return La segunda bebida del gato italiano.
     */
    @Override
    public Bebida bebida2() {
        return new FernetGato2();
    }

    /**
     * Obtiene el primer postre que el gato italiano puede preparar.
     *
     * @return El primer postre del gato italiano.
     */
    @Override
    public Postre postre1() {
        return new CannoliGato2();
    }

    /**
     * Obtiene el segundo postre que el gato italiano puede preparar.
     *
     * @return El segundo postre del gato italiano.
     */
    @Override
    public Postre postre2() {
        return new TiramisuGato2();
    }
}
