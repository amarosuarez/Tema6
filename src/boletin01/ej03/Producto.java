package boletin01.ej03;

/**
 * Clase que contiene los atributos y métodos de un producto
 * 
 * @author Amaro
 */
public class Producto {

	/**
	 * Atributo que almacena el nombre del producto
	 */
	private String nombre = "";

	/**
	 * Atributo que almacea el precio del producto
	 */
	private double precio;

	/**
	 * Constructo vacio
	 */
	public Producto() {
	}

	/**
	 * Constructor con los parámetros nombre y precio
	 * 
	 * @param nombre Nombre del producto
	 * @param precio Precio del producto
	 */
	public Producto(String nombre, double precio) {
		// Comprobamos que el nombre no sea null ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		// Comprobamos que el precio no sea menor que 0
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método que obtiene el nombre del producto
	 * 
	 * @return Devuelve el nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que almacena el nombre del producto
	 * 
	 * @param nombre Nombre del producto
	 */
	public void setNombre(String nombre) {
		// Comprobamos que el nombre no sea null ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método que obtiene el precio del producto
	 * 
	 * @return Devuelve el precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método que almacena el precio del producto
	 * 
	 * @param precio Precio del producto
	 */
	public void setPrecio(double precio) {
		// Comprobamos que el precio no sea menor que 0
		if (precio >= 0) {
			this.precio = precio;
		}
	}
	
	/**
	 * Método que calcula el total, multiplicando el precio por la cantidad
	 * 
	 * @param cantidad Cantidad del producto
	 * @return Devuelve el precio multiplicado por la cantidad
	 */
	public double calcular(int cantidad) {
		// Varibale donde se almacenará el total
		double total;
		
		// Calculamos el total
		total = this.precio * cantidad;
		
		// Devolvemos el total
		return total;
	}
	
	/**
	 * Método que devuelve la información del producto
	 * 
	 * @return Devuelve la información del producto
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del producto
		String info = "";
		
		// Almacenamos la información
		info += "Nombre: " + this.nombre;
		info += "\nPrecio: " + this.precio + " €";
		
		// Devolvemos la información
		return info;
	}

}
