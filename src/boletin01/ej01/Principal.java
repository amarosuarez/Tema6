package boletin01.ej01;

import java.util.Scanner;

public class Principal {

	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable donde se almacenará la hora
		int hora;

		// Variable donde se almacenarán los minutos
		int minutos;
		
		// Objeto Hora
		Hora oHora;
		
		// Objeto Hora Exacta
		HoraExacta oHoraEx;
		
		// Preguntamos la hora
		hora = timeHours();
		
		// Preguntamos los minutos
		minutos = timeMinutes();
		
		// Inicializamos el objeto hora
		oHora = new Hora(hora, minutos);
		
		oHora.inc();
		System.out.println(oHora);
		
		//TODO: Implementar hora exacta
		
		// Cerramos el Scanner
		sc.close();
	}

	static int timeHours() {
		// Variable donde se almacenará la hora
		int hora = 0;
		
		do {
			// Le preguntamos por la hora y la almacenamos
			System.out.println("Introduzca la hora:");
			hora = sc.nextInt();
		} while (hora < 0 || hora > 23);
		
		// Devolvemos la hora
		return hora;
	}
	
	static int timeMinutes() {
		// Variable donde se almacenará los minutos
		int minutos = 0;
		
		// Le preguntamos por los minutos y la almacenamos
		do {
			System.out.println("Introduzca los minutos:");
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 59);
		
		// Devolvemos la hora
		return minutos;
	}

}
