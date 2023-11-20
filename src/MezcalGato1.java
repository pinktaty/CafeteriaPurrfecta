/**
 * La clase `MezcalGato1` es una implementación concreta de la clase `Bebida` y representa
 * el primer tipo de bebida llamada "Mezcal" para el gato 1(mexicano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class MezcalGato1 extends Bebida {

    @Override
    public double precio() {
        return 350.00;
    }
    @Override
    public int sabrosura(){
        return 85;
    }

    @Override
    public String nombre() {
        return "Mezcal";
    }

    @Override
    public String descripcion() {
        return "Shot de mezcal para vivir una experiencia auténtica con una de las mejores bebidas de México (no apto para niños ni gatos)";
    }
}
