package ejercicios.ordenamiento;

public class Estudiante implements Comparable<Estudiante> {
	private String apellido;
    private String nombre;
	private int numeroLista;
	private int edad;
	
	public String getApellido() {
		return apellido;
	
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	@Override
	public int compareTo(Estudiante o) {
// TODO Auto-generated method stub
// 3 posibles retornos
// 0
// -1
// 1
		if (this.numeroLista > o.getEdad()) {
			return 1;
		} else if (this.numeroLista == o.getNumeroLista()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + " numeroLista=" + numeroLista + ", edad=" + edad + "]";
	}

}