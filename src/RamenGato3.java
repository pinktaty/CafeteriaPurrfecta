/**
 * La clase `RamenGato3` es una implementación concreta de la clase `PlatoFuerte` y representa
 * el primer tipo de plato fuerte para el gato 3 (japonés). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class RamenGato3 extends PlatoFuerte{
    @Override
    public double precio() {
        return 45.03;
    }
    @Override
    public int sabrosura(){
        return 320;
    }

    @Override
    public String nombre() {
        return "Ramen";
    }

    @Override
    public String descripcion() {
        return "Bueno y barato para humanos universitarios, con rodajas de carne, algas deshidratadas y cebolla verde";
    }
}
