package boletin01.ej02;

public class Main {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Amaro");
		System.out.println(e1);

		Directivo d1 = new Directivo("Juan");
		System.out.println(d1);

		Operario o1 = new Operario("Rubén");
		System.out.println(o1);

		Oficial of1 = new Oficial("Jenri");
		System.out.println(of1);

		Tecnico t1 = new Tecnico("Adrián");
		System.out.println(t1);
	}
	
}
