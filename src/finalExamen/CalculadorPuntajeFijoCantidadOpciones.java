package finalExamen;

public class CalculadorPuntajeFijoCantidadOpciones implements CalculadorPuntaje{
	private double puntaje;

	public CalculadorPuntajeFijoCantidadOpciones(double puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public double calcular(Pregunta p) {
		return p.getPuntajeFijo() * this.puntaje * (p.getOpcionesDisponibles() / p.getOpcionesValidas());
	}

}
