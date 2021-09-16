package cajero.produ;

import java.util.Scanner;

public class MainProd {

	public static void main(String[] args) {

		String claveIngresada;
		String opcionMenu = null;
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoInt = new Scanner(System.in);
		int saldoInicial = 0;

		claveIngresada = teclado.nextLine();

		if (claveIngresada.equals("85DB")) {
			do {
				System.out.println("#################################");
				System.out.println("1. Realizar transferencia");
				System.out.println("2.Consultar Movimiento");
				System.out.println("3. Salir");
				System.out.println("#################################");
				if (opcionMenu.equals("1")) {
					System.out.println("No tiene ningun pago pendiente");
				} else if (opcionMenu.equals("2")) {
					System.out.println("Ingrese la cuenta de destino");
					String cuentaDestino = teclado.nextLine();
					System.out.println("Ingrese un monto a transferir");
					int montoTransferir = tecladoInt.nextInt();
					saldoInicial = saldoInicial - montoTransferir;
					System.out.println("Su nuevo saldo es:" + saldoInicial);

				}
			} while (!opcionMenu.equals("3"));

		} else {
			System.out.println("La clave no es correcta");

		}
		while (!claveIngresada.equals("-1"))
			;
		System.out.println("Gracias por preferirnos");
	}

}
