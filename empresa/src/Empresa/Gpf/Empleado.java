package Empresa.Gpf;



public class Empleado implements Comparable<Empleado> {
	private String apellido;
    private String nombre;
	private int salario;
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

	public int getSalario() {
		return salario;
	}

	public void setNumeroLista(int salario) {
		this.salario = salario;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

	@Override
	public int compareTo(Empleado o) {
// TODO Auto-generated method stub
// 3 posibles retornos
// 0
// -1
// 1
		if (this.salario > o.getEdad()) {
			return 1;
		} else if (this.salario == o.getSalario()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + " salario=" + salario + ", edad=" + edad + "]";
	}

}