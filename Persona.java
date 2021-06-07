/**
 * 
 * @author AULA1PC5
 *
 *En esta clase crearemos los valores añadidos y sus getters y setters
 */
public class Persona {
	protected String nombre;
	protected String dni;
	protected String tlf;
	protected String email;
	
	
	public Persona(String nombre, String dni, String tlf, String email) {
		this.nombre=nombre;
		this.dni=dni;
		this.tlf=tlf;
		this.email=email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Persona [Nombre=" + nombre + ", DNI=" + dni + 
				          ", Telefono="+ tlf +", Correo electrónico=" + email + 
				          "]";
	}
}
