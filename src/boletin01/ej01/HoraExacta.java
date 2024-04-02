package boletin01.ej01;

public class HoraExacta extends Hora {

	/**
	 * Atributo que almacena los segundos
	 */
	int segundos;

	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos);

		// Comprobamos que los minutos sean mayor o igual que 0 y menor o igual que 59
		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}

	}

	public boolean setSegundo(int segundos) {
		// Variable donde se almacena si ha sido posible almacenar los segundos
		boolean modificado = false;

		// Comprobamos que los segundos sean mayor o igual que 0 y menor o igual que 59
		if (segundos >= 0 && segundos <= 59) {
			// Cambiamos el valor de los segundos
			this.segundos = segundos;

			// Cambiamos el valor del boolean
			modificado = true;
		}

		// Devolvemos el boolean
		return modificado;
	}

	public void inc() {
		this.segundos++;

		if (this.segundos == 60) {
			super.inc();
		}
	}

	@Override
	public String toString() {
		// Variable donde se almacena la cadena
		String cadena = "";

		// Variable donde se almacena la hora
		String sHora = "";

		// Variable donde se almancenan los minutos
		String sMinutos = "";
		
		// Variable donde se almacenan los segundos
		String sSegundos = "";

		// Comprobamos si la hora es menor que 10
		if (super.hora < 10) {
			sHora += "0";
		}

		// Almacenamos la hora
		sHora += String.valueOf(super.hora);

		// Comprobamos si los minutos son menores que 10
		if (minutos < 10) {
			sMinutos += "0";
		}

		// Almacenamos los minutos
		sMinutos += String.valueOf(super.minutos);

		// Almacenamos la información
		cadena = sHora + ":" + sMinutos;

		// Devolvemos la cadena
		return cadena;
	}

}
