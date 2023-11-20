/**
 * La clase `PayMazapanGato1` es una implementación concreta de la clase `Postre` y representa
 * el primer tipo de postre llamado "Pay de Mazapán" para el gato 1(mexicano). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class PayMazapanGato1 extends Postre {

    @Override
    public double precio() {
        return 50.00;
    }
    @Override
    public int sabrosura(){
        return 98;
    }

    @Override
    public String nombre() {
        return "Pay de mazapán";
    }

    @Override
    public String descripcion() {
        return "Exquisito pay de mazapán, con un toque especial de catnip";
    }
}

