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
	public Vehiculo() {
	}

	/**
	 * Constructor con los parámetros marca, modelo, color y matricula
	 * 
	 * @param marca     Marca del coche
	 * @param modelo    Modelo del coche
	 * @param color     Color del coche
	 * @param matricula Matricula del coche
	 */
	public Vehiculo(String marca, String modelo, String color, String matricula) {
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
	}

	/**
	 * Método que para el vehículo
	 */
	public void parar() {
		// Cambiamos la velocidad a 0
		this.velocidad = 0;
	}

	/**
	 * Método que enciende el motor
	 */
	public void arrancar() {
		// Encendemos el motor
		this.motor = true;
	}

	/**
	 * Método que acelera el vehículo
	 * 
	 * @param velocidad Velocidad que se le añade al vehículo
	 */
	public void acelerar(double velocidad) {
		// Aumentamos la velocidad
		this.velocidad += velocidad;
	}

	/**
	 * Método que frena el vehículo
	 * 
	 * @param velocidad Velocidad que se le resta al vehículo
	 */
	public void frenar(double velocidad) {
		// Bajamos la velocidad
		if (this.velocidad > velocidad) {
			this.velocidad -= velocidad;
		} else {
			this.velocidad = 0;
		}
	}

	/**
	 * Método que sube una marcha del vehículo
	 */
	private void subirMarcha() {
		// Aumentamos la marcha del vehículo
		if (this.marcha + 1 <= 6) {
			this.marcha++;
		}
	}

	/**
	 * Método que baja la marcha del vehículo
	 */
	private void bajarMarcha() {
		// Bajamos la marcha del vehículo
		if (this.marcha - 1 >= 0) {
			this.marcha--;
		}
	}

	/**
	 * Método que almacena la marcha del vehículo
	 * 
	 * @param marcha Marcha del vehículo a almacenar
	 */
	public void setMarcha(int marcha) {
		// Comprobamos que la marcha esté entre 1 y 6
		if (marcha >= 1 && marcha <= 6) {
			this.marcha = marcha;
		}
	}
	
	/**
	 * Método que almacena el estado del motor del vehículo
	 * @param motor Estado del motor a almacenar
	 */
	public void setMotor(boolean motor) {
		// Almacenamos el valor
		this.motor = motor;
	}

}
