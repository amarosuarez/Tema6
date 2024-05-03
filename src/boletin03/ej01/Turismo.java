package boletin03.ej01;

public class Turismo extends Vehiculo {

	enum Tipo {
		PARTICULAR, PROFESIONAL
	}
	
	private int numPlazas;
	
	private Tipo tipoUso;
	
	public Turismo() {
		
	}
	
	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String tipoUso) {
		super(marca, modelo, color, matricula);
		
		if (numPlazas > 0) {
			this.numPlazas = 0;
		}
		
		if (tipoUso != null && !tipoUso.equals("")) {
			switch(tipoUso.toLowerCase()) {
			case "particular" -> this.tipoUso = Tipo.PARTICULAR;
			case "profesional" -> this.tipoUso = Tipo.PROFESIONAL;
			}
		}
	}
	
	public int getNumPlazas() {
		return this.getNumPlazas();
	}
	
	public String getTipo() {
		return String.valueOf(this.tipoUso);
	}
	
	public void setNumPlazas(int numPlazas) {
		if (numPlazas > 0) {
			this.numPlazas = 0;
		}
	}
	
	public void setTipo(String tipoUso) {
		if (tipoUso != null && !tipoUso.equals("")) {
			switch(tipoUso.toLowerCase()) {
			case "particular" -> this.tipoUso = Tipo.PARTICULAR;
			case "profesional" -> this.tipoUso = Tipo.PROFESIONAL;
			}
		}
	}
}
