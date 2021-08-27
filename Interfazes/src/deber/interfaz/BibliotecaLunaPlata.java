package deber.interfaz;

public class BibliotecaLunaPlata implements BibliotecaInterfaz  {

	@Override
	public void solicitarCredencial(int credencial) {
		
		// TODO Auto-generated method stub
		System.out.println("Ingrese su " + credencial);
		
	}

	@Override
	public void pedirLibro() {
		// TODO Auto-generated method stub
		System.out.println("Solicite el  libro deseado");
		
	}

	@Override
	public void leerLibro() {
		// TODO Auto-generated method stub
		System.out.println("preview");
	}

	@Override
	public void comprarLibro() {
		// TODO Auto-generated method stub
		System.out.println("De el pago");
		
	}

	@Override
	public void devolverLibro() {
		// TODO Auto-generated method stub
		System.out.println("devuelva libro");
		
	}
	

}
