package finalExamen;

import java.util.List;

public class PreguntaRespuestaAbierta extends Pregunta {
	private String respuesta;

	public PreguntaRespuestaAbierta(List<String> temas, String pregunta, double puntaje, CalculadorPuntaje calculador,
			double cteTiempo, String respuesta) {
		super(temas, pregunta, puntaje, calculador, cteTiempo);
		this.respuesta = respuesta;
	}


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}


	@Override
	public int getOpcionesDisponibles() {
		return (int) (Math.random() * 10);
	}


	@Override
	public int getOpcionesValidas() {
		return (int) (Math.random() * 10);
	}

}
