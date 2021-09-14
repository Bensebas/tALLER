package sistema.produbanco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String clave = null;
		int num = 0;
		

		do {
			System.out.println("Ingrese clave");
			

			int transferencia;
			int transferir;
			int cuentatransferir;
			int saldo = 1000;
			
			

			clave = lector.nextLine();

			if (clave.compareTo("85AB")== 0) {
				System.out.println("Banco Produbanco, elija una opcion");

				do {
					System.out.println("#################################");
					System.out.println("1. Realizar transferencia");
					System.out.println("2.Consultar Movimiento");
					System.out.println("3. Salir");
					System.out.println("#################################");
					num = lector.nextInt();
					if (num == 1) {
						System.out.println("Ingrese la cuenta de destino de la transferencia y el monto a transferir");
						cuentatransferir = lector.nextInt();
						transferir = lector.nextInt();
						transferencia = saldo - transferir;
						System.out.println("“Su nuevo saldo es:” +transferencia");

					} else if (num == 2) {
						System.out.println("En este momento se están procesando las transacciones, intente más tarde");

					}

				} while (num != 3);
			} else {
				System.out.println("La clave no es correcta");
			}
		} while (num !=0);
		{
			System.out.println("Gracias por preferirnos");

		}
	}

}
