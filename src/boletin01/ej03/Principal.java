package boletin01.ej03;

public class Principal {
	
	public static void main(String[] args) {
		Producto noPerecedero = new NoPerecedero("Fanta", 0.5, "refresco");
		Producto perecedero = new Perecedero("Pan", 0.25, 2);
		
		double precioFinal1 = noPerecedero.calcular(5);
		double precioFinal2 = perecedero.calcular(3);
		
		System.out.println(noPerecedero);
		System.out.println("Precio total: " + precioFinal1);
		
		System.out.println();
		System.out.println(perecedero);
		System.out.println("Precio total: " + precioFinal2);
		
	}
	
}
