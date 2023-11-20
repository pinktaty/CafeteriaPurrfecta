
/**
 * La clase `AguaHorchataGato1` es una implementación concreta de la clase `Bebida` y representa
 * el segundo tipo de bebida llamada "Agua de Horchada" para el gato 1(mexicano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class AguaHorchataGato1 extends Bebida {

    @Override
    public double precio() {
        return 25.00;
    }
    @Override
    public int sabrosura(){
        return 100;
    }

    @Override
    public String nombre() {
        return "Agua de Horchata";
    }

    @Override
    public String descripcion() {
        return "Deliciosa y fresca agua de horchata (mejor que la de jamaica)";
    }
}
