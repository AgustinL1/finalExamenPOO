package finalExamen;

import java.util.List;

public abstract class Seccion {
	
	
	public abstract double getPuntaje();
	public abstract List<Pregunta> getPreguntas();
	public abstract List<String> getTemas();
	public abstract Seccion getCopiaRestringida(Filtro f);	
	public abstract double getTiempoEstimado();
	public abstract int getCantidadPreguntas();
}
