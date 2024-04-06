package boletin01.ej03;

/**
 * Clase que contiene los atributos y métodos de un producto perecedero y
 * extiende de la clase Producto
 * 
 * @author Amaro
 */
public class Perecedero extends Producto {

	/**
	 * Atributo que almacena los días a caducar
	 */
	private int diasCaducar;

	/**
	 * Constructor vacío
	 */
	public Perecedero() {
		super();
	}

	/**
	 * Constructor con los parámetros nombre, precio y diasCaducar
	 * 
	 * @param nombre      Nombre del producto perecedero
	 * @param precio      Precio del producto perecedero
	 * @param diasCaducar Dias a caducar del producto perecedero
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);

		// Comprobamos que los días a caducar sean mayor o igual que 0
		if (diasCaducar >= 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	/**
	 * Método que obtiene los días a caducar
	 * 
	 * @return Devuelve los días a caducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * Método que almacena los días sin caducar
	 * 
	 * @param diasCaducar Días sin caducar del producto perecedero
	 */
	public void setDiasCaducar(int diasCaducar) {
		// Comprobamos que los días a caducar sean mayor o igual que 0
		if (diasCaducar >= 0) {
			this.diasCaducar = diasCaducar;
		}
	}
	
	/**
	 * Método que devuelve el total según la cantidad y los días a caducar
	 * 
	 * @return Devuelve el total según la cantidad y los días a caducar
	 */
	@Override
	public double calcular(int cantidad) {
		// Variable donde se almacenará el total
		double total = super.calcular(cantidad);
		
		// Según el número de días reducimos el precio
		switch (this.diasCaducar) {
		case 1 -> total /= 4;
		case 2 -> total /= 3;
		case 3 -> total /= 2;
		}
		
		// Devolvemos el total
		return total;
	}
	
	/**
	 * Método que devuelve la información del producto perecedero
	 * 
	 * @return Devuelve la información del producto perecedero
	 */
	@Override
	public String toString() {
		// Variable donde se almacena la información del producto
		String info = super.toString();
		
		// Almacenamos la información
		info += "\nDías a caducar: " + this.diasCaducar;
		
		// Devolvemos la información
		return info;
	}

}
