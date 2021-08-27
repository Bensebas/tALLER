package deber.interfaz;

public class MatriculaIrwin  implements MatriculaInterfaz {

	@Override
	public void obtenerNombreEstudiante(String Nombre) {
		
		// TODO Auto-generated method stub
		System.out.println("Ingrese su"+ Nombre);
		
	}

	@Override
	public void obtenerIdEstudiante(String ID) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su"+ ID);
		
		
	}

	@Override
	public void registrarDatosEstudiante() {
		// TODO Auto-generated method stub
		System.out.println("SUS DATOS SE ESTAN PROCESANDO");
		
	}

	@Override
	public void crearPerfilEstudiante() {
		// TODO Auto-generated method stub
		System.out.println("Observe su perfil");
		
	}

	@Override
	public void darCertificado() {
		// TODO Auto-generated method stub
		System.out.println("Retire su certificado");
		
	}

}
