package boletin01.ej03;

/**
 * Clase que contiene los atributos y métodos de un producto no perecedero y
 * extiende de la clase Producto
 * 
 * @author Amaro
 */
public class NoPerecedero extends Producto {

	/**
	 * Atributo que almacena el tipo del producto no perecedero
	 */
	private String tipo = "";

	/**
	 * Constructor vacío
	 */
	public NoPerecedero() {
		super();
	}

	/**
	 * Constructor con los parámetros nombre, precio y tipo
	 * 
	 * @param nombre Nombre del producto perecedero
	 * @param precio Precio del producto perecedero
	 * @param tipo   Tipo del producto perecedero
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		// Comprobamos que el tipo no sea null ni vacío
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Método que obtiene el tipo
	 * 
	 * @return Devuelve lel tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Método que almacena el tipo
	 * 
	 * @param tipo Tipo del producto perecedero
	 */
	public void setTipo(String tipo) {
		// Comprobamos que el tipo no sea null ni vacío
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * Método que devuelve la información del producto no perecedero
	 * 
	 * @return Devuelve la información del producto no perecedero
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del producto
		String info = super.toString();

		// Almacenamos la información
		info += "\nTipo: " + this.tipo;

		// Devolvemos la información
		return info;
	}

}
