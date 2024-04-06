package boletin01.ej02;

/**
 * Clase que contiene los atributos y métodos de un técnico
 * y extiende de la clase Operario
 * 
 * @author Amaro
 */
public class Tecnico extends Operario {
	
	
	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre Nombre del técnico
	 */
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	/**
	 * Método que devuelve la información del técnico
	 * 
	 * @return Devuelve la información del técnico
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del empleado
		String info = super.toString();
		
		// Almacenamos la información
		info += " -> Técnico";
		
		// Devolvemos la información
		return info;
	}
}
