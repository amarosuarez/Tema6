package boletin01.ej05;

/**
 * Clase abstracta que contiene los atributos y métodos de un Poligono
 * 
 * @author Amaro
 */
public abstract class Poligono {

	/**
	 * Atributo que almacena el número de lados
	 */
	protected int numeroLados;

	/**
	 * Constructor vacío
	 */
	public Poligono() {}

	/**
	 * Constructor con el parámetro número de lados
	 * 
	 * @param numeroLados Número de lados del polígono
	 */
	public Poligono(int numeroLados) {
		// Comprobamos que los números de lados sean mayor que 2
		if (numeroLados > 2) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * Método que obtiene el número de lados
	 * 
	 * @return Devuelve el número de lados
	 */
	public int getNumeroLados() {
		return this.numeroLados;
	}

	/**
	 * Método que almacena el número de lados
	 * 
	 * @param numeroLados Número de lados del polígono
	 */
	public void setNumeroLados(int numeroLados) {
		// Comprobamos que los números de lados sean mayor que 2
		if (numeroLados >= 1) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * Método abstracto que devuelve el area del polígono
	 * 
	 * @return Devuelve el area del polígono
	 */
	abstract double area();

	/**
	 * Método que devuelve la información del polígono
	 * 
	 * @return Devuelve los lados del polígono
	 */
	@Override
	public String toString() {
		// Devolvemos la información
		return "Número de lados: " + this.numeroLados;
	}

}
