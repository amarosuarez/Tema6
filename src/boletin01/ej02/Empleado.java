package boletin01.ej02;

/**
 * Clase que contiene los atributos y métodos de un empleado
 * 
 * @author Amaro
 */
public class Empleado {

	/**
	 * Atributo que almacena el nombre del empleado
	 */
	private String nombre = "";

	/**
	 * Constructor vacío
	 */
	public Empleado() {
	}

	/**
	 * Constructor con el parámetro nombre
	 * 
	 * @param nombre Nombre del empleado
	 */
	public Empleado(String nombre) {
		// Comprobamos que el nombre no sea null ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método que obtiene el nombre del empleado
	 * 
	 * @return Devuelve el nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que almacena el nombre del empleado
	 * 
	 * @param nombre Nombre del empleado
	 */
	public void setNombre(String nombre) {
		// Comprobamos que el nombre no sea null ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Método que devuelve la información del empleado
	 * 
	 * @return Devuelve la información del empleado
	 */
	@Override
	public String toString() {		
		// Devolvemos la información
		return "Empleado " + this.nombre;
	}

}
