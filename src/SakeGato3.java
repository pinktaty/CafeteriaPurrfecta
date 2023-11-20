/**
 * La clase `SakeGato3` es una implementación concreta de la clase `Bebida` y representa
 * el segundo tipo de bebida llamada "Sake" para el gato 3 (japonés). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class SakeGato3 extends Bebida{
    @Override
    public double precio() {
        return 340.05;
    }
    @Override
    public int sabrosura(){
        return 25;
    }

    @Override
    public String nombre() {
        return "Sake";
    }

    @Override
    public String descripcion() {
        return "Bebida alcohólica nacional de japón, hecha a partir de la fermentación del arroz";
    }
}
