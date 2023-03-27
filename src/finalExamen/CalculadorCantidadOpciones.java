package finalExamen;

public class CalculadorCantidadOpciones implements CalculadorPuntaje {

	public double calcular(Pregunta p) {
		return p.getPuntajeFijo() * p.getOpcionesDisponibles();
	}

}
