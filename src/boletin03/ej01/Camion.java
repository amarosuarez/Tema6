package boletin03.ej01;

public class Camion extends Vehiculo {

	private double pesoMaximo;
	
	private boolean mercanciaPeligrosa;
	
	public Camion() {
		
	}
	
	public Camion(String marca, String modelo, String color, 
			String matricula, double pesoMaximo, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		
		if (pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		}
		
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	public double getPesoMaximo() {
		return this.pesoMaximo;
	}
	
	public boolean getMercanciaPeligrosa() {
		return this.mercanciaPeligrosa;
	}
	
	public void setPesoMaximo(double pesoMaximo) {
		if (pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		}
	}
	
	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
}
