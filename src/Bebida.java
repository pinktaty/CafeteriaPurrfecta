/**
 * La clase abstracta `Bebida` es una representación genérica de un componente
 * relacionado con la bebida de un combo gatuno. Esta clase implementa la
 * interfaz `Componente` y define métodos abstractos para características como precio, sabrosura, nombre
 * descripción.
 */
public abstract class Bebida implements Componente {
    
    @Override
    public abstract double precio();

    @Override
    public abstract int sabrosura();
    
    @Override
    public abstract String nombre();

    @Override
    public abstract String descripcion();

    @Override
    public void descripcionCompleta() {
        //System.out.print("**" + nombre() + "**");
        System.out.println("\nDescripción: " + descripcion() + "." +
                "\nPrecio: $" + precio()+
                "\nPuntos de sabrosura: " + sabrosura()+".");
    }
}
