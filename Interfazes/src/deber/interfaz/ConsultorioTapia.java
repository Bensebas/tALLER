package deber.interfaz;

public class ConsultorioTapia implements ConsultorioInterfaz {

	@Override
	public void darTurno(int turno) {
		// TODO Auto-generated method stub
		System.out.println("dar"+ turno);
		
		
	}

	@Override
	public void tomarDatosDelPaciente() {
		// TODO Auto-generated method stub
		System.out.println("ingrese kis datos");
		
		
	}

	@Override
	public void iniciarConsulta() {
		// TODO Auto-generated method stub
		System.out.println("tome asiento");
		
		
	}

	@Override
	public void darRecomendaciones() {
		// TODO Auto-generated method stub
		System.out.println("otorge consejos");
		
		
	}

	@Override
	public void darFactura() {
		// TODO Auto-generated method stub
		System.out.println("otorgar factura");
		
		
	}

}
