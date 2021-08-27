package deber.interfaz;

public class BibliotecaLibriMundi implements BibliotecaInterfaz {

	@Override
	public void solicitarCredencial(int credencial) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese" + credencial);
		
	}

	@Override
	public void pedirLibro() {
		// TODO Auto-generated method stub
		System.out.println("Solicite libro" );
		
	}

	@Override
	public void leerLibro() {
		// TODO Auto-generated method stub
		System.out.println("Vista previa" );
	}

	@Override
	public void comprarLibro() {
		// TODO Auto-generated method stub
		System.out.println("realizar compra" );
		
	}

	@Override
	public void devolverLibro() {
		// TODO Auto-generated method stub
		System.out.println("entregue libro");
		
	}

	

}
