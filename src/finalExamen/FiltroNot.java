package finalExamen;

public class FiltroNot implements Filtro {
	private Filtro f1;
	
	public FiltroNot(Filtro f1) {
		super();
		this.f1 = f1;
	}

	public boolean eval(Pregunta p) {
		return !f1.eval(p);
	}

}
