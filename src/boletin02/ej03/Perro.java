package boletin02.ej03;

/**
 * Clase que contiene los atributos y métodos de un perro
 * 
 * @author Amaro
 */
public class Perro extends AnimalDomestico {
	
	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del perro
	 * @param raza Raza del perro
	 * @param peso Peso del perro
	 * @param color Color del perro
	 */
	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}
	
	/**
	 * Método que indica la acción de hacer ruido
	 */
	@Override
	public void hacerRuido() {
		System.out.println("Guau");
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
		
		if (prob > 0.1) {
			haceCaso = true;
		}
		
		return haceCaso;
	}
	
}
