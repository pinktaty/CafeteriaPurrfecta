/**
 * La clase `ArmarCombo` se encarga de ensamblar diferentes tipos de naves predeterminadas 
 * utilizando componentes específicos. También permite obtener la nave construida una vez
 * que se han agregado todos los componentes necesarios.
 */
public class ArmarCombo {

    ComboConstruido combo;

    /**
     * Constructor de la clase `ArmarCombo`. Inicializa una nueva instancia de `NaveConstruida`.
     */
    public ArmarCombo() {
        this.combo = new ComboConstruido();
    }

    /**
     * Agrega un componente a la nave en construcción.
     *
     * @param componente El componente que se agregará a la nave.
     */
    public void armaCombo(Componente componente) {
        combo.agregaComponente(componente);
    }

    /**
     * Obtiene la nave construida hasta el momento.
     *
     * @return La nave construida.
     */
    public ComboConstruido regresaCombo() {
        return this.combo;
    }
}
