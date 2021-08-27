package deber.interfaz;

public class MatriculaJuan implements MatriculaInterfaz {

	@Override
	public void obtenerNombreEstudiante(String Nombre) {
		// TODO Auto-generated method stub
		System.out.println("Diga su"+ Nombre);
		
	}

	@Override
	public void obtenerIdEstudiante(String ID) {
		// TODO Auto-generated method stub
		System.out.println("Diga su"+ ID);
		
	}

	@Override
	public void registrarDatosEstudiante() {
		// TODO Auto-generated method stub
		System.out.println("Entrege sus datos");
		
	}

	@Override
	public void crearPerfilEstudiante() {
		// TODO Auto-generated method stub
		System.out.println("Mire su perfil");
		
	}

	@Override
	public void darCertificado() {
		// TODO Auto-generated method stub
		System.out.println("Revise su certificado");
		
	}

}
