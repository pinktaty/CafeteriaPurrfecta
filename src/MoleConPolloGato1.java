/**
 * La clase `MoleConPolloGato1` es una implementación concreta de la clase `PlatoFuerte` y representa
 * el primer tipo de plato fuerte llamado "Mole con pollo" para el gato 1 (mexicano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class MoleConPolloGato1 extends PlatoFuerte {

    @Override
    public double precio() {
        return 120.00;
    }
    @Override
    public int sabrosura(){
        return 52;
    }

    @Override
    public String nombre() {
        return "Mole con pollo";
    }

    @Override
    public String descripcion() {
        return "La riqueza de la comida mexicana en nuestro platillo de mole artesanal con pollo cazado por el gran chef gato tabasqueño";
    }
}
