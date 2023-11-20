/**
 * La interfaz `Componente` define un conjunto de métodos que representan las características
 * comunes de los componentes utilizados en el armado de combos.
 */
public interface Componente {

    /**
     * Obtiene el precio del componente.
     *
     * @return El precio del componente.
     */
    public double precio();
    /**
     * Obtiene los puntos de sabrosura del componente.
     * 
     * @return Los puntos de sabrosura.
     */
    public int sabrosura();

    /**
     * Obtiene el nombre del componente.
     *
     * @return El nombre del componente.
     */
    public String nombre();

    /**
     * Obtiene la descripción del componente.
     *
     * @return La descripción del componente.
     */
    public String descripcion();

    /**
     * Muestra una descripción completa del componente, incluyendo su nombre, descripción, precio,
     * y sabrosura.
     */
    public void descripcionCompleta();
}
