package finalExamen;

public class FiltroPuntuacion implements Filtro{
	private double puntaje;
	
	public FiltroPuntuacion(double puntaje) {
		super();
		this.puntaje = puntaje;
	}


	public boolean eval(Pregunta p) {
		// TODO Auto-generated method stub
		return p.getPuntajeTotal() > this.puntaje;
	}

}
