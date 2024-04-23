package boletin03.ej01;

/**
 * Clase que contiene los atributos y métodos de un vehículo
 * 
 * @author Amaro
 */
public class Vehiculo {

	/**
	 * Atributo que almacena la marca del vehículo
	 */
	protected String marca = "";

	/**
	 * Atributo que almacena el modelo del vehículo
	 */
	protected String modelo = "";

	/**
	 * Atributo que almacena el color del vehículo
	 */
	protected String color = "";
	
	/**
	 * Atributo que almacena la matrícula del vehículo
	 */
	protected String matricula = "";

	/**
	 * Atributo que almacena si el motor está encendido o apagado
	 */
	protected boolean motor;

	/**
	 * Atributo que almacena la marcha del vehículo
	 */
	protected int marcha;

	/**
	 * Atributo que almacena la velocidad del vehículo
	 */
	protected int velocidad;

	/**
	 * Constructor vacío
	 */
	public Vehiculo() {}

	public Vehiculo(String marca, String modelo, String color, String matricula, boolean motor, int marcha,
			int velocidad) {
		// Comprobamos que la marca no sea nulo ni vacío
		if (marca != null && !marca.equals("")) {
			this.marca = marca;
		}

		// Comprobamos que el modelo no sea nulo ni vacío
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}

		// Comprobamos que el color no sea nulo ni vacío
		if (color != null && !color.equals("")) {
			this.color = color;
		}

		// Comprobamos que la matricula no sea nulo ni vacío
		if (matricula != null && !matricula.equals("")) {
			this.matricula = matricula;
		}
		
		// Iniciamos el motor
		this.motor = motor;
		
		// Comprobamos que la marcha sea mayor o igual que 6
		if (marcha >= 0 && marcha <= 6) {
			this.marcha = marcha;
		}
		
		// Comprobamos que la velocidad sea mayor o igual que 0 y menor o igual que 120
		if (velocidad >= 0 && velocidad <= 120) {
			this.velocidad = velocidad; 
		}
	}

}
