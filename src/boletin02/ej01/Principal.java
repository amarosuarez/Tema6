package boletin02.ej01;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		Socio[] array = new Socio []{
				new Socio(1, "Amaro", 19),
				new Socio(3, "Rubén", 18),
				new Socio(5, "Jenri", 18),
				new Socio(2, "Manati", 43),
				new Socio(4, "Beluga", 8)
		};

		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
	}
	
}
