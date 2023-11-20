/**
 * Clase que es el controlador del patrón state y a través
 * de la cual el programa corre.
 */
public class ControladorState {

    private Videojuego videojuego;
    // Vistas
    private Estado modoElegirChef;
    private Estado modoCrearPlatillo;
    private Estado modoDespedir;
    private Estado modoPagar;
    private Estado modoPelear;
    private VistaBuilder builder;

    /**
     * Constructor de la clase ControladorState.
     * Inicializa los diferentes estados y la vista asociada.
     */
    public ControladorState() {
        this.modoElegirChef = new ModoElegirChef(this);
        this.modoCrearPlatillo = new ModoCrearPlatillo(this);
        this.modoDespedir = new ModoDespedir(this);
        this.modoPagar = new ModoPagar(this);
        this.modoPelear = new ModoPelear(this);
        this.builder = new VistaBuilder();
        this.videojuego = new Videojuego(modoElegirChef);
    }

    /**
     * Método para realizar la elección 1 (hablar con el chef).
     */
    public void eleccion1() {
        videojuego.hablarChef();
    }

    /**
     * Método para realizar la elección 2 (checar platillo).
     */
    public void eleccion2() {
        videojuego.checarPlatillo();
    }

    /**
     * Método para realizar la elección 3 (pagar).
     */
    public void eleccion3() {
        videojuego.pagar();
    }

    /**
     * Método para realizar la elección 4 (pelear).
     */
    public void eleccion4() {
        videojuego.pelear();
    }

    /**
     * Método para realizar la elección 5 (despedirse).
     */
    public void eleccion5() {
        videojuego.despedirse();
    }

    /**
     * Método para agregar propina al videojuego.
     */
    public void agregarPropina() {
        videojuego.propina();
    }

    /**
     * Método para agregar un chef al videojuego.
     */
    public void agregarChef() {
        videojuego.setGatoChef(builder.elegirGato());
    }

    /**
     * Método para obtener el nombre del chef actual en el videojuego.
     * @return El nombre del chef.
     */
    public String getNombreChef() {
        return videojuego.getGatoChef().getNombre();
    }

    /**
     * Método para indicar que el chef ha sido elegido.
     */
    public void chefElegido() {
        videojuego.cambiarEstado(modoCrearPlatillo);
    }

    /**
     * Método para obtener el chef actual en el videojuego.
     * @return El GatoChef actual.
     */
    public GatoChef obtenerChef() {
        return videojuego.getGatoChef();
    }

    /**
     * Método para obtener la representación ASCII del chef actual en el videojuego.
     * @return La representación ASCII del chef.
     */
    public String getChefAscii() {
        return videojuego.getGatoChef().getRepresentacion();
    }

    /**
     * Método para agregar un platillo al videojuego.
     */
    public void agregarPlatillo() {
        videojuego.setCombo(builder.armarPlatillo(videojuego.getGatoChef()));
    }

    /**
     * Método para indicar que el platillo ha sido creado.
     */
    public void platilloCreado() {
        videojuego.cambiarEstado(modoPagar);
    }

    /**
     * Método para verificar si el pago del platillo fue aceptado.
     * @return true si el pago fue aceptado, false si no.
     */
    public boolean fuePagoAceptado() {
        return builder.pagar(videojuego.getCombo());
    }

    /**
     * Método para iniciar una pelea en el videojuego.
     */
    public void pelea() {
        videojuego.cambiarEstado(modoPelear);
    }

    /**
     * Método para indicar que la pelea ha finalizado.
     */
    public void peleaFinalizada() {
        videojuego.setFinalPelea();
    }

		/**
		 * Método para verificar si la pelea ha finalizado.
		 * @return true si ha finalizado, false si no.
		 */
		public boolean finalizoPelea(){
			return videojuego.finalPelea();
		}

    /**
     * Método para indicar que el usuario está peleando.
     */
    public void elUsuarioPelea() {
        videojuego.peleo();
    }

    /**
     * Método para verificar si el usuario dejó propina.
     * @return true si dejó propina, false si no.
     */
    public boolean usuarioDejoPropina() {
        return videojuego.dejoPropina();
    }

    /**
     * Método para indicar que el usuario ganó la partida.
     */
    public void ganoUsuario() {
        videojuego.gano();
    }

    /**
     * Método para indicar que es hora de irse en el videojuego.
     */
    public void horaDeIrse() {
        videojuego.cambiarEstado(modoDespedir);
    }

    /**
     * Método para verificar si ocurrió una pelea en el videojuego.
     * @return true si ocurrió una pelea, false si no.
     */
    public boolean ocurrioPelea() {
        return videojuego.getPeleo();
    }

    /**
     * Método para verificar si el usuario ganó la partida.
     * @return true si el usuario ganó, false si no.
     */
    public boolean usuarioGano() {
        return videojuego.getGano();
    }
}
