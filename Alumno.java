/**
 * 
 * @author AULA1PC5
 *
 * Usaremos los valores de las clases Persona y 
 *  Clasificaciones para definir esta
 */
public class Alumno extends Persona{
	
	private Calificacion modProgramacion;
	private Calificacion modLenguaje;
	private Calificacion modBaseDatos;
	
	public Calificacion getModProgramacion() {
		return modProgramacion;
	}
	public void setModProgramacion(Calificacion modProgramacion) {
		this.modProgramacion = modProgramacion;
	}
	public Calificacion getModLenguaje() {
		return modLenguaje;
	}
	public void setModLenguaje(Calificacion modLenguaje) {
		this.modLenguaje = modLenguaje;
	}
	public Calificacion getModBaseDatos() {
		return modBaseDatos;
	}
	public void setModBaseDatos(Calificacion modBaseDatos) {
		this.modBaseDatos = modBaseDatos;
	}
	
	public Alumno(String nombre, String dni, String tlf, String email) {
		super(nombre, dni, tlf, email);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Alumno [modProgramacion=" + modProgramacion + ", modLenguaje=" + modLenguaje + ", modBaseDatos="
				+ modBaseDatos + "]"
				+"\n"+"Persona [Nombre=" + nombre + ", DNI=" + dni + 
		          ", Telefono="+ tlf +", Correo electrónico=" + email + 
		          "]";
	}
	
	
	
}
