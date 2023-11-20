/**
 * La clase `LasagnaGato2` es una implementación concreta de la clase `PlatoFuerte` y representa
 * el primer tipo de plato fuerte para el gato 2 (italiano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class LasagnaGato2 extends PlatoFuerte{
    @Override
    public double precio() {
        return 180.00;
    }
    @Override
    public int sabrosura(){
        return 75;
    }

    @Override
    public String nombre() {
        return "Lasanga";
    }

    @Override
    public String descripcion() {
        return "Lasagna, finas capas de pasta con carne y tomate, al horno";
    }
}
