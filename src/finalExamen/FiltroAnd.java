package finalExamen;

public class FiltroAnd implements Filtro {
	private Filtro f1,f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	public boolean eval(Pregunta p) {
		return f1.eval(p) && f2.eval(p);
	}


}