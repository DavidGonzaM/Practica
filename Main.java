/**
 * 
 * @author AULA1PC5
 * Esta es la main
 */
public class Main {

	public static void main(String[] args) {
		Alumno alumno = new Alumno("David","54202074K","5438594380","dsaklda@dsada.com");
		Calificacion calificacion = new Calificacion(5, "Entornos");
		alumno.setModProgramacion(calificacion);
		System.out.println(alumno);

	}

}
