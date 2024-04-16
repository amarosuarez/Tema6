package boletin02.ej03;

/**
 * Clase que contiene los métodos de un Gato
 * 
 * @author Amaro
 */
public class Gato extends AnimalDomestico {
	
	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del gato
	 * @param raza Raza del gato
	 * @param peso Peso del gato
	 * @param color Color del gato
	 */
	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	/**
	 * Método que indica la acción de hacer ruido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Miau");
	}

	/**
	 * Método que indica la acción de hacer caso
	 * 
	 * @return Devuelve si hace caso o no
	 */
	@Override
	public boolean hacerCaso() {
		boolean haceCaso = false;
		double prob = Math.random();
		
		if (prob >= 0.95) {
			haceCaso = true;
		}
		
		return haceCaso;
	}
	
}
