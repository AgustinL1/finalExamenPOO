package finalExamen;

import java.util.List;

public abstract class Pregunta {
	private List<String> temas;
	private String pregunta;
	private double puntaje;
	private CalculadorPuntaje calculador;
	private double cteTiempo;

	public Pregunta(List<String> temas, String pregunta, double puntaje, CalculadorPuntaje calculador,
			double cteTiempo) {
		super();
		this.temas = temas;
		this.pregunta = pregunta;
		this.puntaje = puntaje;
		this.calculador = calculador;
		this.cteTiempo = cteTiempo;
	}

	public double getCteTiempo() {
		return cteTiempo;
	}

	public List<String> getTemas() {
		return temas;
	}
	
	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public CalculadorPuntaje getCalculador() {
		return calculador;
	}

	public void setCalculador(CalculadorPuntaje calculador) {
		this.calculador = calculador;
	}

	public void setTemas(List<String> temas) {
		this.temas = temas;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}

	public double getPuntajeFijo() {
		return this.puntaje;
	}
	
	public double getPuntajeTotal() {
		return this.calculador.calcular(this);
	}
	
	public double getTiempo() {
		return this.getPuntajeTotal() * this.cteTiempo;
	}
	
	public abstract int getOpcionesDisponibles();
	public abstract int getOpcionesValidas();
}
