/**
 * Interfaz Estado que define a los estados en los cuáles el videojuego estará
 */
public interface Estado{

	/**
	 * Método para pagar
	 */
	public void pagar();

	/**
	 * Método para hablar con el chef
	 * */
	public void hablarChef();

	/**
	 * Método para checar el platillo elegido
	 */
	public void checarPlatillo();

	/**
	 * Método para despedirse
	 */
	public void despedirse();

	/**
	 * Método para pelear
	 */
	public void pelear();

}
