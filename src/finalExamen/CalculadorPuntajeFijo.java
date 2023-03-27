package finalExamen;

public class CalculadorPuntajeFijo implements CalculadorPuntaje {

	public double calcular(Pregunta p) {
		return p.getPuntajeFijo();
	}

}
