package finalExamen;

import java.util.ArrayList;
import java.util.List;

public class SeccionCompuesta extends Seccion {
	private List<Seccion> subsecciones;

	public SeccionCompuesta(List<Seccion> subsecciones) {
		super();
		this.subsecciones = subsecciones;
	}

	
	public List<Pregunta> getPreguntas() {
		List<Pregunta> retorno = new ArrayList<Pregunta>();
		for (Seccion s : subsecciones) {
			retorno.addAll(s.getPreguntas());
		}
		return retorno;
	}

	public List<String> getTemas() {
		List<String> retorno = new ArrayList<String>();
		for (Seccion s : subsecciones) {
			retorno.addAll(s.getTemas());
		}
		return retorno;
	}

	public double getPuntaje() {
		double i = 0;
		for (Seccion s : subsecciones)
			i += s.getPuntaje();
		return i;
	}

	@Override
	public Seccion getCopiaRestringida(Filtro f) {
		List<Seccion> aux = new ArrayList<Seccion>();
		for (Seccion s : subsecciones)
			aux.add(s.getCopiaRestringida(f));
		return new SeccionCompuesta(aux);
		
	}

	@Override
	public double getTiempoEstimado() {
		double i = 0;
		for (Seccion s : subsecciones)
			i += s.getTiempoEstimado();
		return i;
	}

	@Override
	public int getCantidadPreguntas() {
		int i = 0;
		for (Seccion s : subsecciones)
			i += s.getCantidadPreguntas();
		return i;
		
	}

}
