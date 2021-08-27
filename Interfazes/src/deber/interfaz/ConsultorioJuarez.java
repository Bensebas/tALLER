package deber.interfaz;

public class ConsultorioJuarez implements ConsultorioInterfaz {

	@Override
	public void darTurno(int turno) {
		// TODO Auto-generated method stub
		System.out.println("tome su"+ turno);
		
	}

	@Override
	public void tomarDatosDelPaciente() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese los datos solicitados");
	}

	@Override
	public void iniciarConsulta() {
		// TODO Auto-generated method stub
		System.out.println("Preparese para la consulta");
		
	}

	@Override
	public void darRecomendaciones() {
		// TODO Auto-generated method stub
		System.out.println("Siga estos pasos");
		
	}

	@Override
	public void darFactura() {
		// TODO Auto-generated method stub
		System.out.println("Retire su factura");
		
	}

}
