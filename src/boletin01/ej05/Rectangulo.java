package boletin01.ej05;

public class Rectangulo extends Poligono {

	/**
	 * Atributo que almacena el ancho
	 */
	private double ancho;

	/**
	 * Atributo que almacena el alto
	 */
	private double alto;

	/**
	 * Constructor vacío
	 */
	public Rectangulo() {
		super();
	}

	/**
	 * Constructor con los parámetros ancho y alto
	 * 
	 * @param ancho Ancho del rectangulo
	 * @param alto  Alto del rectangulo
	 */
	public Rectangulo(double ancho, double alto) {
		super();

		// Comprobamos que el ancho sea mayor que 0
		if (ancho > 0) {
			this.ancho = ancho;
		}

		// Comprobamos que el alto sea mayor que 0
		if (alto > 0) {
			this.alto = alto;
		}
	}

	/**
	 * Método que obtiene el ancho
	 * 
	 * @return Devuelve el ancho
	 */
	public double getAncho() {
		return ancho;
	}

	/**
	 * Método que obtiene el alto
	 * 
	 * @return Devuelve el alto
	 */
	public double getAlto() {
		return alto;
	}

	/**
	 * Método que almacena el ancho
	 * 
	 * @param ancho Ancho del rectángulo
	 */
	public void setAncho(double ancho) {
		// Comprobamos que el ancho sea mayor que 0
		if (ancho > 0) {
			this.ancho = ancho;
		}
	}

	/**
	 * Método que almacena el alto
	 * 
	 * @param alto Alto del rectángulo
	 */
	public void setAlto(double alto) {
		// Comprobamos que el alto sea mayor que 0
		if (alto > 0) {
			this.alto = alto;
		}
	}

	/**
	 * Método que calcula y devuelve el area
	 * 
	 * @return Devuelve el area del rectángulo
	 */
	public double area() {
		// Variable donde se almacena el area
		double area;

		// Calculamos el area
		area = this.alto * this.ancho;

		// Devolvemos el area
		return area;
	}
	
	/**
	 * Método que devuelve la información del rectángulo
	 * 
	 * @return Devuelve la información del rectángulo
	 */
	public String toString() {
		// Variable donde se almacena la información
		String info = "";
		
		// Almacenamos la información
		info += "Rectángulo\n";
		info += "Alto: " + this.alto;
		info += "\nAncho: " + this.ancho;
		
		// Devolvemos la información
		return info;
	}

}
