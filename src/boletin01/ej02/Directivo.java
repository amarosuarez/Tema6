package boletin01.ej02;

/**
 * Clase que contiene los atributos y métodos de un directivo
 * y extiende de la clase Empleado
 */
public class Directivo extends Empleado {
	
	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del directivo
	 */
	public Directivo(String nombre) {
		super(nombre);
	}
	
	/**
	 * Método que devuelve la información del directivo
	 * 
	 * @return Devuelve la información del directivo
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del empleado
		String info = super.toString();
		
		// Almacenamos la información
		info += " -> Directivo";
		
		// Devolvemos la información
		return info;
	}
	
}
