package ejercicios.nonacces.finall;

public final class EstudianteCiencias extends Estudiante {
	
	private String VelocidadInternet ;
	public final String horarioEntrada = "8:00" ;
	public String Ciudadnacimiento = "Quito" ;
	
	public EstudianteCiencias() {
		// no se puede reasignar el final
		horarioEntrada = "8:00"
		Ciudadnacimiento = "Guayaquil" ;
		
	};

}
