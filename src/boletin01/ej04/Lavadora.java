package boletin01.ej04;

public class Lavadora extends Electrodomestico {

	/**
	 * Atributo que almacena la carga
	 */
	double carga = 5;

	/**
	 * Constructor vacío
	 */
	public Lavadora() {
	}

	/**
	 * Constructor con los parámetros precioBase y peso
	 * 
	 * @param precioBase Precio base de la lavadora
	 * @param peso       Peso de la lavadora
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	/**
	 * Constructor con todos los parámetros
	 * @param precioBase Precio base de la lavadora
	 * @param color Color de la lavadora
	 * @param consumoEnergetico Consumo de la lavadora
	 * @param peso Peso de la lavadora
	 * @param carga Carga de la lavadora
	 */
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);

		// Comprobamos que la carga sea mayor o igual que 0
		if (carga >= 0) {
			this.carga = carga;
		}
	}
}
