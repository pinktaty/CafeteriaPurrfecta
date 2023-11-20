/**
 * La clase `MochiGato3` es una implementación concreta de la clase `Postre` y representa
 * el segundo tipo de postre llamado "Mochi" para el gato 3(japonés). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class MochiGato3 extends Postre{
    @Override
    public double precio() {
        return 125.08;
    }
    @Override
    public int sabrosura(){
        return 125;
    }

    @Override
    public String nombre() {
        return "Mochi";
    }

    @Override
    public String descripcion() {
        return "Pastelito de arroz glutinoso relleno de sakura (flor de cerezo)";
    }
}
