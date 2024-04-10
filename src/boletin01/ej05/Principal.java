package boletin01.ej05;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Variable que almacena la elección del jugador
		int eleccion;
		
		// Variable que almacena si el usuario desea salir
		char salir;
		
		// Bucle que se ejecuta hasta que el usuario desee salir
		do {
			// Mostramos el menú y le preguntamos la eleccion al usuario
			menu();
			eleccion = sc.nextInt();
			
			// Ejecutamos según la elección del jugador
			switch (eleccion) {
			case 1 -> introducirTriangulo();
			case 2 -> introducirRectangulo();
			case 3 -> Lista.muestraInfo();
			}
			
			// Limpiamos el scanner
			sc.nextLine();
			
			// Le preguntamos al usuario si desea salir
			System.out.println("¿Desea salir? (S para salir)");
			salir = sc.nextLine().toLowerCase().charAt(0);
			
		} while (salir != 's');
		
		// Cerramos el scanner
		sc.close();
	}
	
	static void menu() {
		// Mostramos el menú
		System.out.println("Menú");
		System.out.println("1. Introducir triángulo.");
		System.out.println("2. Introducir rectángulo.");
		System.out.println("3. Mostrar contenido del array.");
	}
	
	static void introducirTriangulo() {
		// Variable donde se almacena el lado 1
		int lado1;
		
		// Variable donde se almacena el lado 2
		int lado2;
		
		// Variable donde se almacena el lado 3
		int lado3;
		
		// Variable donde se almacena la posición
		int pos;
		
		// Creamos el objeto triángulo
		Triangulo tri;
		
		// Le pedimos los lados al usuario
		System.out.println("Valor del lado 1");
		lado1 = sc.nextInt();
		System.out.println("Valor del lado 2");
		lado2 = sc.nextInt();
		System.out.println("Valor del lado 3");
		lado3 = sc.nextInt();
		
		// Inicializamos el triangulo
		tri = new Triangulo(lado1, lado2, lado3);
		
		// Buscamos una posición libre
		pos = Lista.posLibre();
		
		// Si hay una libre, guardamos ahí el triángulo en caso contrario mostramos error
		if (pos != -1) {
			Lista.array[pos] = tri;
			System.out.println("Introducido");
		} else {
			System.out.println("Error");
		}
	}

	static void introducirRectangulo() {
		// Variable donde se almacena el alto
		int alto;
		
		// Variable donde se almacena el ancho
		int ancho;
		
		// Variable donde se almacena la posición
		int pos;
		
		// Creamos el objeto rectángulo
		Rectangulo rec;
		
		// Le pedimos el alto y ancho al usuario
		System.out.println("Valor del alto");
		alto = sc.nextInt();
		System.out.println("Valor del ancho");
		ancho = sc.nextInt();
		
		// Inicializamos el rectangulo
		rec = new Rectangulo(alto, ancho);
		
		// Buscamos una posición libre
		pos = Lista.posLibre();
		
		// Si hay una libre, guardamos ahí el rectángulo en caso contrario mostramos error
		if (pos != -1) {
			Lista.array[pos] = rec;
			System.out.println("Introducido");
		} else {
			System.out.println("Error");
		}
	}
	
}
