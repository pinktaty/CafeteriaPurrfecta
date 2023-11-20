import java.util.LinkedList;

/**
 * La clase abstracta `ComboGatuno` representa una nave espacial y define métodos para administrar
 * sus componentes y calcular sus características como costo, ataque, defensa, velocidad y peso.
 */
public abstract class ComboGatuno {
    protected LinkedList<Componente> componentes = new LinkedList<Componente>();

    /**
     * Agrega un componente a el combo gatuno.
     *
     * @param componente El componente que se agrega a el combo gatuno.
     */
    public void agregaComponente(Componente componente) {
        componentes.add(componente);
    }

    /**
     * Calcula el costo total de el combo gatuno sumando los precios de todos sus componentes.
     *
     * @return El costo total de el combo gatuno.
     */
    public double obtenCosto() {
        double costo = 0;
        for (Componente com : componentes) {
            costo += com.precio();
        }
        return costo;
    }
    /**
     * Calcula la sabrosura total de el combo gatuno sumando los puntos de sabrosura
     * de todos sus componentes.
     *
     * @return Los puntos totales de sabrosura del combo gatuno.
     */
    public double obtenSabrosura() {
        double sabrosura = 0;
        for (Componente com : componentes) {
            sabrosura += com.sabrosura();
        }
        return sabrosura;
    }

    /**
     * Muestra los componentes del combo gatuno en la consola.
     */
    public void muestraComponentes() {
        for (Componente com : componentes) {
            System.out.println("* " + com.nombre()+", con costo de $"+com.precio());
        }
    }

    /**
     * Muestra las características y componentes del combo gatuno en la consola.
     */
    public void muestraCombo() {
        System.out.println("Costo total: $" + (float)obtenCosto()+"");
        System.out.println("Puntos de sabrosura acumulados: " + (int)obtenSabrosura()+" puntos.");
        System.out.println("Componentes: ");
        muestraComponentes();
    }

    /**
     * Método para agregar el plato fuerte al combo gatuno.
     */
    public abstract void agregaPlatoFuerte();
    /**
     * Método para agregar una bebida al combo gatuno.
     */
    public abstract void agregaBebida();
    /**
     * Método para agregar un postre al combo gatuno.
     */
    public abstract void agregaPostre();
}
