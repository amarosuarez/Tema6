package boletin01.ej05;

public class Triangulo extends Poligono {

	/**
	 * Atributo que almacena el lado 1
	 */
	private double lado1;
	
	/**
	 * Atributo que almacena el lado 2
	 */
	private double lado2;

	/**
	 * Atributo que almacena el lado 3
	 */
	private double lado3;
	
	
	/**
	 * Constructor vacío
	 */
	public Triangulo() {
		super(3);
	}
	
	/**
	 * Constructor con los parámetros lado 1, 2 y 3
	 * 
	 * @param lado1 Lado 1 del triángulo
	 * @param lado2 Lado 2 del triángulo
	 * @param lado3 Lado 3 del triángulo
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Método que obtiene el lado 1
	 * 
	 * @return Devuelve el lado 1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método que almacena el lado 1
	 * 
	 * @param lado1 Lado 1 del triángulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Método que obtiene el lado 2
	 * 
	 * @return Devuelve el lado 2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método que almacena el lado 2
	 * 
	 * @param lado1 Lado 2 del triángulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Método que obtiene el lado 3
	 * 
	 * @return Devuelve el lado 3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Método que almacena el lado 3
	 * 
	 * @param lado1 Lado 3 del triángulo
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	
	/**
	 * Método que calcula y devuelve el area
	 * 
	 * @return Devuelve el area del triángulo
	 */
	public double area() {
		// Variable donde se almacena el area
		double area;
		
		// Variable donde se almacena el semiperimetro
		double semiperimetro;
		
		double aux;
		
		// Calculamos el semiperimetro
		semiperimetro = (this.lado1 + this.lado2 + this.lado3) / 2;
		
		// Calculamos el area
		aux = (semiperimetro * (semiperimetro - this.lado1) * (semiperimetro - this.lado2) * (semiperimetro - this.lado3));
		area = Math.sqrt(aux);
		
		// Devolvemos el area
		return area;
	}
	
	@Override
	public String toString() {
		// Variable donde se almacenará la información
		String info = "";
		
		// Almacenamos la información
		info += "Triángulo";
		info += "\nLado 1: " + this.lado1;
		info += "\nLado 2: " + this.lado2;
		info += "\nLado 3: " + this.lado3;
		
		// Devolvemos la información
		return info;
	}
	
}
