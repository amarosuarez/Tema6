package boletin01.ej02;

/**
 * Clase que contiene los atributos y métodos de un operario
 * y extiende de la clase Empleado
 * 
 * @author Amaro
 */
public class Operario extends Empleado {
	
	/**
	 * Constructor vacío
	 */
	public Operario() {}
	
	/**
	 * Constructor con parámetros
	 * @param nombre Nombre del operario
	 */
	public Operario(String nombre) {
		super(nombre);
	}
	
	/**
	 * Método que devuelve la información del operario
	 * 
	 * @return Devuelve la información del operario
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del empleado
		String info = super.toString();
		
		// Almacenamos la información
		info += " -> Operario";
		
		// Devolvemos la información
		return info;
	}
	
}
