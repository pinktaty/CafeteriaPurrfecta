/**
 * Clase Videojuego, el objeto que cambia de estados.
 */
public class Videojuego {

    private Estado estado;
    private GatoChef gato;
    private ComboGatuno combo;
    private boolean dejoPropina;
    private boolean peleo;
    private boolean gano;
    private boolean peleaFinalizada;

    /**
     * Constructor de la clase Videojuego.
     * @param estadoInicial El estado inicial del videojuego.
     */
    public Videojuego(Estado estadoInicial) {
        this.estado = estadoInicial;
        this.dejoPropina = false;
        this.peleo = false;
        this.gano = false;
        this.peleaFinalizada = false;
    }

    /**
     * Establece que el cliente ganó la partida.
     */
    public void gano() {
        this.gano = true;
    }

    /**
     * Obtiene el estado de si el cliente ganó.
     * @return true si ganó, false si no.
     */
    public boolean getGano() {
        return this.gano;
    }

    /**
     * Establece que el cliente participó en una pelea.
     */
    public void peleo() {
        this.peleo = true;
    }

    /**
     * Obtiene el estado de si el cliente peleó.
     * @return true si peleó, false si no.
     */
    public boolean getPeleo() {
        return this.peleo;
    }

    /**
     * Establece que la pelea ha finalizado.
     */
    public void setFinalPelea() {
        this.peleaFinalizada = true;
    }

    /**
     * Obtiene el estado de si la pelea ha finalizado.
     * @return true si la pelea ha finalizado, false si no.
     */
    public boolean finalPelea() {
        return this.peleaFinalizada;
    }

    /**
     * Establece el GatoChef asociado al cliente.
     * @param gato El GatoChef a asociar.
     */
    public void setGatoChef(GatoChef gato) {
        this.gato = gato;
    }

    /**
     * Obtiene el GatoChef asociado al cliente.
     * @return El GatoChef asociado.
     */
    public GatoChef getGatoChef() {
        return this.gato;
    }

    /**
     * Establece el ComboGatuno elegido por el cliente.
     * @param combo El ComboGatuno a asociar.
     */
    public void setCombo(ComboGatuno combo) {
        this.combo = combo;
    }

    /**
     * Obtiene el ComboGatuno elegido por el cliente.
     * @return El ComboGatuno asociado.
     */
    public ComboGatuno getCombo() {
        return this.combo;
    }

    /**
     * Método auxiliar para cambiar al objeto entre estados.
     * @param estado El estado al que se quiere cambiar.
     */
    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el estado de si el cliente dejó propina.
     * @return true si dejó propina, false si no.
     */
    public boolean dejoPropina() {
        return this.dejoPropina;
    }

    /**
     * Permite al cliente dejar propina.
     */
    public void propina() {
        this.dejoPropina = true;
    }

    /**
     * Método para hablar con el chef.
     */
    public void hablarChef() {
        estado.hablarChef();
    }

    /**
     * Método para checar el platillo elegido.
     */
    public void checarPlatillo() {
        estado.checarPlatillo();
    }

    /**
     * Método para despedirse.
     */
    public void despedirse() {
        estado.despedirse();
    }

    /**
     * Método para pagar.
     */
    public void pagar() {
        estado.pagar();
    }

    /**
     * Método para pelear.
     */
    public void pelear() {
        estado.pelear();
    }
}
