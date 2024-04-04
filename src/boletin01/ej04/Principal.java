package boletin01.ej04;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double precio;
		char consumo;
		String color = "";
		double peso;
		String salir = "";
		Electrodomestico el;
		
		do {
			
			System.out.println("Precio?");
			precio = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.println("Consumo?");
			consumo = sc.nextLine().charAt(0);
			
			System.out.println("Color?");
			color = sc.nextLine();
			
			System.out.println("Peso?");
			peso = sc.nextDouble();
			sc.nextLine();
			
			System.out.println();
			el = new Electrodomestico(precio, color, consumo, peso);
			el.precioFinal();
			System.out.println(el);
			System.out.println();
			
			System.out.println("Salir?");
			salir = sc.nextLine();
			
		} while (!salir.toLowerCase().equals("s"));
		
	}
	
}
