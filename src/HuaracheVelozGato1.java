/**
* La clase `HuaracheVelozGato1` es una implementación concreta de la clase `PlatoFuerte` y representa
* el segundo tipo de plato fuerte llamado "Mole con pollo" para el gato 1 (mexicano). Este plato tiene valores específicos
* para precio, sabrosura, nombre y descripción.
*/
public class HuaracheVelozGato1 extends PlatoFuerte {

    @Override
    public double precio() {
        return 60.00;
    }
    @Override
    public int sabrosura(){
        return 120;
    }

    @Override
    public String nombre() {
        return "Huarache veloz";
    }

    @Override
    public String descripcion() {
        return "Huarache con frijolitos, del tamaño de la patita del chef gato tabasqueño";
    }
} 

