package finalExamen;

import java.util.List;

public class PreguntaMultipleChoice extends Pregunta {
	private List<Opcion> opciones;


	public PreguntaMultipleChoice(List<String> temas, String pregunta, double puntaje, CalculadorPuntaje calculador,
			double cteTiempo, List<Opcion> opciones) {
		super(temas, pregunta, puntaje, calculador, cteTiempo);
		this.opciones = opciones;
	}


	@Override
	public int getOpcionesDisponibles() {
		return opciones.size();
	}


	@Override
	public int getOpcionesValidas() {
		int i = 0;
			for (Opcion o : opciones) {
				if (o.isCorrecto())
					i++;
			}
		return i;
	}
	
}
