package boletin01.ej05;

public class Lista {

	/**
	 * Atributo donde se almacenan los diferentes poligonos
	 */
	static Poligono[] array = new Poligono[10];
	
	/**
	 * Método que busca una posición libre en el array
	 * 
	 * @return Devuelve el índice libre en el array
	 */
	static int posLibre() {
		// Variable donde se almacena el índice
		int i = 0;
		
		// Variable que almacena si se ha encontrado una posición vacía
		boolean found = false;
		
		// Variable donde se almacena la posición encontrada
		int pos = -1;
		
		// Buscamos mientras el indice sea menor que el tamaño del array
		// y no se haya encontrado una posición vacía
		while (i < array.length && !found) {
			if (array[i] == null) {
				pos = i;
				found = true;
			}
			
			i++;
		}
		
		// Devolvemos la posición
		return pos;
	}
	
	/**
	 * Método que muestra la información de los polígonos en el array
	 */
	static void muestraInfo() {
		// Recorremos el array y mostramos la información de las posiciones no nulas
		for (Poligono pol : array) {
			if (pol != null) {
				System.out.println(pol);
				System.out.println("Area: " + pol.area());
			}
		}
	}
	
}
