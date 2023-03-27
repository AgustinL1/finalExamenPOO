package finalExamen;

public class FiltroOr implements Filtro {
	private Filtro f1,f2;
	
	public FiltroOr(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
	
	public boolean eval(Pregunta p) {
		return f1.eval(p) || f2.eval(p);
	}

}
