/**
 * La clase `MacchiatoGato2` es una implementación concreta de la clase `Bebida` y representa
 * el primer tipo de bebida llamada "Macchiato" para el gato 2 (italiano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class MacchiatoGato2 extends Bebida {
    @Override
    public double precio() {
        return 92.50;
    }
    @Override
    public int sabrosura(){
        return 122;
    }

    @Override
    public String nombre() {
        return "Latte Macchiato";
    }

    @Override
    public String descripcion() {
        return "Café latte con leche";
    }
}
