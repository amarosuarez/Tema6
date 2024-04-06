package boletin01.ej02;

/**
 * Clase que contiene los atributos y métodos de un oficial
 * y extiende de la clase Operario
 * 
 * @author Amaro
 */
public class Oficial extends Operario {
	
	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del oficial
	 */
	public Oficial(String nombre) {
		super(nombre);
	}
	
	/**
	 * Método que devuelve la información del oficial
	 * 
	 * @return Devuelve la información del oficial
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del empleado
		String info = super.toString();
		
		// Almacenamos la información
		info += " -> Oficial";
		
		// Devolvemos la información
		return info;
	}
	
}
