package boletin03.ej02;

/**
 * Clase que contiene los atributos y métodos de una ficha de información
 * 
 * @author Amaro
 */
public abstract class Ficha {

	/**
	 * Atributo que almacena el identificador del objeto
	 */
	private int id;

	/**
	 * Atributo que almacena el titulo del objeto
	 */
	private String titulo = "";

	/**
	 * Constructor vacío
	 */
	public Ficha() {

	}

	/**
	 * Constructor con parámetros id y titulo
	 * 
	 * @param id     Número identificador
	 * @param titulo Título del objeto
	 */
	public Ficha(int id, String titulo) {
		// Comprobamos que el id sea mayor o igual que 0
		if (id >= 0) {
			this.id = id;
		}

		// Comprobamos que el titulo no sea null ni vacío
		if (titulo != null && !titulo.equals("")) {
			this.titulo = titulo;
		}
	}

	/**
	 * Método que obtiene el identificador
	 * 
	 * @return Devuelve el identificador
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Método que obtiene el título
	 * 
	 * @return Devuelve el título
	 */
	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * Método abstracto que indica la acción de prestar
	 */
	abstract void prestar();
}
