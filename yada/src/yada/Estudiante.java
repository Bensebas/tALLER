//paquete defecto
package yada;
//clase publica
public class Estudiante {
	public static Estudiante estudiante1;
	String nombre;
	String apellido;
	public int añoescolar;
	public char paralero;
	private int ID;
	protected int numerodelista;
	private int numerodeseguro;
	//clase publica
	public void asistencia() {
		//protected numerodelista
		// default String
		System.out.println("presente"+ numerodelista+nombre);
	}
	//clase protected
	protected void realizartarea(){
		System.out.println("realizada");
	}
	//clase privada
	private void resusltadosleccion() {
		System.out.println("aprobado");
	}
	
	protected void matriculación(){
		//Id privado
		System.out.println("realizado"+ ID);
	}
	

}
