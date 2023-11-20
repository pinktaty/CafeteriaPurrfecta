/**
 * La clase `FernetGato2` es una implementación concreta de la clase `Bebida` y representa
 * el segundo tipo de bebida llamada "Fernet" para el gato 2 (italiano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class FernetGato2 extends Bebida {
    @Override
    public double precio() {
        return 552.50;
    }
    @Override
    public int sabrosura(){
        return 40;
    }

    @Override
    public String nombre() {
        return "Fernet";
    }

    @Override
    public String descripcion() {
        return "Bebida alcohólica amarga obtenida de hierbas como el cardamomo, el azafrán, el orégano o la manzanilla";
    }
}
