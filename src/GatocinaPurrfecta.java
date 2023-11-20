
public class GatocinaPurrfecta {
    public static void main(String[] args) {
		ControladorState controlador = new ControladorState();
		VistaState vista = new VistaState(controlador);
		vista.start();
    }
    
}
