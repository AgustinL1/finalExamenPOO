package finalExamen;

public class FiltroTema implements Filtro{
	private String tema;
	
	public FiltroTema(String tema) {
		super();
		this.tema = tema;
	}

	public boolean eval(Pregunta p) {
		return p.getTemas().contains(this.tema);
	}

}
