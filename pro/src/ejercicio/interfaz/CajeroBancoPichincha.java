package ejercicio.interfaz;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("inserte tarjeta :");
		
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("inserte su clave:");
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("seleccione la transaccion");
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Seleccione el monto");
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Su saldo es :");
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("reciba su dinero");
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("transaccion realizada");
	}

	@Override
	public void entrgarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("tome su recibo");
	}

}
