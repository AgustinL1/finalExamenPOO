package finalExamen;

public class FiltroTiempo implements Filtro{
	private double tiempo;

	public FiltroTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public boolean eval(Pregunta p) {
		return p.getTiempo() < this.tiempo;
	}

}
