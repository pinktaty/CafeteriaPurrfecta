/**
 * La clase `MitarashiDangoGato3` es una implementación concreta de la clase `Postre` y representa
 * el primer tipo de postre llamado "Mitarashi dango" para el gato 3(japonés). Este plato tiene valores específicos
 * para precio, sabrosura, nombre y descripción.
 */
public class MitarashiDangoGato3 extends Postre{
    @Override
    public double precio() {
        return 122.23;
    }
    @Override
    public int sabrosura(){
        return 130;
    }

    @Override
    public String nombre() {
        return "Mitarashi dango";
    }

    @Override
    public String descripcion() {
        return "Brocheta con tres bolitas de harina de arroz glutinoso que se embadurnan en una salsa de soja, azúcar, agua y fécula de patatas";
    }
}
