/**
 * La clase `ComboConstruido` es una subclase de la clase abstracta `ComboGatuno` que representa un
 * combo gatuno construido sin componentes específicos. En esta implementación, los métodos
 * abstractos para agregar componentes, como plato fuerte, bebida y postre,
 * se han dejado vacíos. Esta clase podría servir como una base para futuras extensiones que
 * definan combos con componentes concretos.
 */
public class ComboConstruido extends ComboGatuno {

    @Override
    public void agregaPlatoFuerte() {}

    @Override
    public void agregaBebida() {}


    @Override
    public void agregaPostre() {}
}
