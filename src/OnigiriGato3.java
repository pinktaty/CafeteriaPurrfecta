/**
 * La clase `OnigiriGato3` es una implementación concreta de la clase `PlatoFuerte` y representa
 * el segundo tipo de plato fuerte para el gato 3 (japonés). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class OnigiriGato3 extends PlatoFuerte {
    @Override
    public double precio() {
        return 25.00;
    }
    @Override
    public int sabrosura(){
        return 82;
    }

    @Override
    public String nombre() {
        return "Onigiri otaku";
    }

    @Override
    public String descripcion() {
        return "Bola de arroz cocido relleno de salmón (cazado por el gato chef japonés Taro), envuelto en alga";
    }
}
