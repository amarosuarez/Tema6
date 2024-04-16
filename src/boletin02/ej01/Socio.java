package boletin02.ej01;

/**
 * Clase que contiene los atributos y métodos de un socio
 * 
 * @author Amaro
 */
public class Socio implements Comparable<Socio> {

	/**
	 * Atributo que almacena el identificador del socio
	 */
	private int id;

	/**
	 * Atributo que almacena el nombre del socio
	 */
	private String nombre = "";

	/**
	 * Atributo que almacena la edad del socio
	 */
	private int edad;

	/**
	 * Constructor con los parámetros id y nombre
	 * 
	 * @param id     Identificador del socio
	 * @param nombre Nombre del socio
	 * @param edad   Edad del socio
	 */
	public Socio(int id, String nombre, int edad) {
		// Comprobamos que el id sea mayor que 0
		if (id > 0) {
			this.id = id;
		}

		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		// Comprobamos que la edad sea mayor que 0
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método que devuelve la información del socio
	 * 
	 * @return Devuelve la información del socio
	 */
	@Override
	public String toString() {
		// Variable donde se almacenará la información
		String info = "";

		// Almacenamos la informacion
		info += "\nID: " + this.id;
		info += "\nNombre: " + this.nombre;
		info += "\nEdad: " + this.edad;

		// Devolvemos la información
		return info;
	}
	
	/**
	 * Método que compara el id 
	 * 
	 * @return Devuelve -1 si el id es menor, 0 si es igual y 1 si es mayor
	 */
	@Override
	public int compareTo(Socio socio) {
		// Variable que almacena el resultado
		int res = 0;
		
		// Comprobamos que el id sea menor o mayor
		if (this.id < socio.id) {
			res = -1;
		} else if (this.id > socio.id) {
			res = 1;
		}
		
		// Devolvemos el resultado
		return res;
	}

}
