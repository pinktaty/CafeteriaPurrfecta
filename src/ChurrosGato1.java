/**
 * La clase `ChurrosGato1` es una implementación concreta de la clase `Postre` y representa
 * el segundo tipo de postre llamado "Churros" para el gato 1(mexicano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class ChurrosGato1 extends Postre {

    @Override
    public double precio() {
        return 59.23;
    }
    @Override
    public int sabrosura(){
        return 110;
    }

    @Override
    public String nombre() {
        return "Churros";
    }

    @Override
    public String descripcion() {
        return "Tradicionales churros hechos con las garritas del chef tabasqueño";
    }
}
