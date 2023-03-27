package finalExamen;

public class Opcion {
	private String pregunta;
	private boolean correcto;
	public Opcion(String pregunta, boolean correcto) {
		super();
		this.pregunta = pregunta;
		this.correcto = correcto;
	}
	public String getPregunta() {
		return pregunta;
	}
	public boolean isCorrecto() {
		return correcto;
	}
	
	

}
