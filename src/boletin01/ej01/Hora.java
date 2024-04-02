package boletin01.ej01;

/**
 * Clase Hora que contiene los atributos y funciones de una hora
 * 
 * @author Amaro
 */
public class Hora {

	/**
	 * Atributo que almacena la hora
	 */
	protected int hora;

	/**
	 * Atributo que almacena los minutos
	 */
	protected int minutos;

	/**
	 * Constructor con parámetros
	 * 
	 * @param hora    Hora introducida
	 * @param minutos Minuto introducida
	 */
	public Hora(int hora, int minutos) {
		// Comprobamos que la hora sea mayor o igual que 0 y menor o igual que 23
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

		// Comprobamos que los minutos sean mayor o igual que 0 y menor o igual que 59
		if (minutos >= 0 && minutos <= 59) {
			this.minutos = minutos;
		}
	}

	/**
	 * Función que incrementa la hora en un minuto
	 */
	void inc() {
		// Aumentamos en uno los minutos
		this.minutos++;

		// Comprobamos que los minutos no sean mayor que 59
		if (this.minutos == 60) {
			// En este caso le ponemos 0 como valor a los minutos e incrementamos una hora
			this.minutos = 0;
			
			// Sumamos uno a la hora
			this.hora++;

			// Comprobamos que la hora no sea mayor que 23
			if (this.hora == 24) {
				// En este caso le ponemos 0 como valor a la hora
				this.hora = 0;
			}
		}
	}

	/**
	 * Función que almacena la hora
	 * 
	 * @param hora Hora introducida
	 * @return Devuelve si ha sido posible almacenar la hora
	 */
	public boolean setHora(int hora) {
		// Variable donde se almacena si ha sido posible almacenar la hora
		boolean modificado = false;

		// Comprobamos que la hora sea mayor o igual que 0 y menor o igual que 23
		if (hora >= 0 && hora <= 23) {
			// Cambiamos el valor de la hora
			this.hora = hora;

			// Cambiamos el valor del boolean
			modificado = true;
		}

		// Devolvemos el booleanç
		return modificado;
	}

	/**
	 * Función que almacena los minutos
	 * 
	 * @param minutos Minutos introducidos
	 * @return Devuelve si ha sido posible almacenar los minutos
	 */
	public boolean setMinutos(int minutos) {
		// Variable donde se almacena si ha sido posible almacenar los minutos
		boolean modificado = false;

		// Comprobamos que los minutos sean mayor o igual que 0 y menor o igual que 59
		if (minutos >= 0 && minutos <= 23) {
			// Cambiamos el valor de los minutos
			this.minutos = minutos;

			// Cambiamos el valor del boolean
			modificado = true;
		}

		// Devolvemos el booleanç
		return modificado;
	}

	@Override
	public String toString() {
		// Variable donde se almacena la cadena
		String cadena = "";

		// Variable donde se almacena la hora
		String sHora = "";

		// Variable donde se almancenan los minutos
		String sMinutos = "";

		// Comprobamos si la hora es menor que 10
		if (hora < 10) {
			sHora += "0";
		}

		// Almacenamos la hora
		sHora += String.valueOf(this.hora);

		// Comprobamos si los minutos son menores que 10
		if (minutos < 10) {
			sMinutos += "0";
		}

		// Almacenamos los minutos
		sMinutos += String.valueOf(this.minutos);

		// Almacenamos la información
		cadena = sHora + ":" + sMinutos;

		// Devolvemos la cadena
		return cadena;
	}

}
