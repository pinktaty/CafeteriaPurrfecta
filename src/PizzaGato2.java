/**
 * La clase `PizzaGato2` es una implementación concreta de la clase `PlatoFuerte` y representa
 * el segundo tipo de plato fuerte para el gato 2 (italiano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class PizzaGato2 extends PlatoFuerte{
    @Override
    public double precio() {
        return 340.00;
    }
    @Override
    public int sabrosura(){
        return 114  ;
    }

    @Override
    public String nombre() {
        return "Pizza Margherita";
    }

    @Override
    public String descripcion() {
        return "Pizza Margherita, traída desde Nápoles por el grandioso gato chef italianito";
    }
}
