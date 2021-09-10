package menu.paciente;

public class Paciente extends Main {
	
	public String nombre ;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return Sintoma;
	}
	public void setSintoma(String sintoma) {
		Sintoma = sintoma;
	}
	public String apellido ;
	public int edad ;
	public String Sintoma ;

}
