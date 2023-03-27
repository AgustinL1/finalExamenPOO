package finalExamen;

import java.util.ArrayList;
import java.util.List;

public class SeccionSimple extends Seccion {
	private List<Pregunta> preguntas;
	private CalculadorPuntaje calculador;
	
	public SeccionSimple(List<Pregunta> preguntas, CalculadorPuntaje calculador2) {
		this.preguntas = preguntas;
		calculador = calculador2;
	}


	@Override
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}


	@Override
	public List<String> getTemas() {
		List<String> retorno = new ArrayList<String>();
		for (Pregunta p : preguntas) {
			retorno.addAll(p.getTemas());
		}
		return retorno;
	}

	@Override
	public double getPuntaje() {
		double i = 0;
		for (Pregunta p : preguntas) {
			if (p.getCalculador() == null)
				i += this.calculador.calcular(p);
			else
				i += p.getPuntajeTotal();
		}
		return i;
	}


	@Override
	public Seccion getCopiaRestringida(Filtro f) {
		List <Pregunta> aux = new ArrayList<Pregunta>();
		for (Pregunta p : preguntas) {
			if (f.eval(p))
				aux.add(p);
		}
		return new SeccionSimple(aux, this.calculador);
	}


	@Override
	public double getTiempoEstimado() {
		double i = 0;
		for (Pregunta p : preguntas) {
			i += p.getTiempo();
		}
		return i;
	}


	@Override
	public int getCantidadPreguntas() {
		return preguntas.size();
	}
	


}
