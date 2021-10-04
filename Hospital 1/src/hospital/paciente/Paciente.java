package hospital.paciente;

public abstract class Paciente {

	protected String nombre = "";
	protected String apellido = "";
	protected int edad = 0;
	protected String codigoDeSeguro = "";

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

	public String getCodigoDeSeguro() {
		return codigoDeSeguro;
	}

	public void setCodigoDeSeguro(String codigoDeSeguro) {
		this.codigoDeSeguro = codigoDeSeguro;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", codigoDeSeguro="
				+ codigoDeSeguro + "]";
	}

}
