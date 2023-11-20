/**
 * La clase `CannoliGato2` es una implementación concreta de la clase `Postre` y representa
 * el primer tipo de postre llamado "Cannoli" para el gato 2(italiano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class CannoliGato2 extends Postre{
    @Override
    public double precio() {
        return 178.84;
    }
    @Override
    public int sabrosura(){
        return 25;
    }

    @Override
    public String nombre() {
        return "Cannoli";
    }

    @Override
    public String descripcion() {
        return "Pequeño tubo hecho de masa, relleno con queso ricotta, azúcar glas y algunos otros ingredientes";
    }
}
