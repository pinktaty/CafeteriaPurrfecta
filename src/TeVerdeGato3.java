/**
 * La clase `TeVerdeGato3` es una implementación concreta de la clase `Bebida` y representa
 * el primer tipo de bebida llamada "Té verde" para el gato 3 (japonés). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class TeVerdeGato3 extends Bebida{
    @Override
    public double precio() {
        return 30.05;
    }
    @Override
    public int sabrosura(){
        return 15;
    }

    @Override
    public String nombre() {
        return "Té verde";
    }

    @Override
    public String descripcion() {
        return "Ryokucha (té verde), infusión de hojas de Camellia sinensi importadas desde japón";
    }
}
