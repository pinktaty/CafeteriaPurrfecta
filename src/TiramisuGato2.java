
/**
 * La clase `TiramisuGato2` es una implementación concreta de la clase `Postre` y representa
 * el primer tipo de postre para el gato 2 (italiano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class TiramisuGato2 extends Postre{
    @Override
    public double precio() {
        return 50.50;
    }
    @Override
    public int sabrosura(){
        return 105;
    }

    @Override
    public String nombre() {
        return "Tiramisú";
    }

    @Override
    public String descripcion() {
        return "Rebanada de pastel Tiramisú proveniente de Venecia, con alto contraste entre los sabores del café, el cacao y la crema";
    }
}
