/**
 * 
 * @author AULA1PC5
 * Creamos valores y le damos valor para la clase clasificacion
 */
public class Calificacion {
	protected int nota;
	protected String asignatura;
	
	public Calificacion(int nota, String asignatura) {
		this.nota=nota;
		this.asignatura=asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	/*Este metodo imprime por pantalla esta clase*/
	public Calificacion imprimir() {
		return this;
	}
	
	@Override
	public String toString() {
		return "Calificacion [nota=" + nota + ", asignatura=" + asignatura + "]";
	}
	
}

