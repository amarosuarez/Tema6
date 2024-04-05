package boletin01.ej04;

public class Ejecutable {

	public static void main(String[] args) {
		// Array de electrodomésticos de 10 posiciones
		Electrodomestico[] arrayElec = new Electrodomestico[10];
		
		double suma = 0;
		double lavadoras = 0;
		double television = 0;
		
		// Electrodomestico 1
		Electrodomestico el1 = new Electrodomestico(50, "rojo", 'A', 20);
		arrayElec[0] = el1;
		Electrodomestico el2 = new Electrodomestico(80, "blanco", 'B', 10);
		arrayElec[1] = el2;
		Electrodomestico el3 = new Electrodomestico(120, "azul", 'A', 25);
		arrayElec[2] = el3;
		
		
		Lavadora lav1 = new Lavadora(200, "negro", 'A', 40, 20);
		arrayElec[3] = lav1;
		Lavadora lav2 = new Lavadora(100, "blanco", 'C', 30, 50);
		arrayElec[4] = lav2;
		Lavadora lav3 = new Lavadora(140, "rojo", 'D', 60, 10);
		arrayElec[5] = lav3;
		
		
		Television tv1 = new Television(200, "negro", 'B', 20, 40, true);
		arrayElec[6] = tv1;
		Television tv2 = new Television(600, "blanco", 'A', 30, 24, false);
		arrayElec[7] = tv2;
		Television tv3 = new Television(700, "azul", 'C', 20, 30, true);
		arrayElec[8] = tv3;
		Television tv4 = new Television(500, "rojo", 'D', 30, 50, false);
		arrayElec[9] = tv4;
		
		for (Electrodomestico ed : arrayElec) {
			ed.precioFinal();
			
			System.out.println("Precio: " + ed.getPrecioBase() + " €");
			
			if (ed instanceof Lavadora) {
				lavadoras += ed.getPrecioBase();
			}
			
			if (ed instanceof Television) {
				television += ed.getPrecioBase();
			}
			
			if (ed instanceof Electrodomestico) {
				suma += ed.getPrecioBase();
			}
		}
		
		
		System.out.println("Total lavadoras: " + lavadoras + " €");
		System.out.println("Total televisiones: " + television + " €");
		
		System.out.println("Total: " + suma + " €");
		
	}
	
}
