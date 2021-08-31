package reserva.vuelos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = 1, fila, columna = 0;

		Scanner lector = new Scanner(System.in);
		int[][] asiento = new int[4][5];

		while (a <= 20) {
			System.out.println();
			fila = scan.nextInt();

			if (asiento[fila - 1][columna - 1] == 0) {

				asiento[fila - 1][columna - 1] = 1;
				a = a + 1;
				System.out.println("Reserva encontrada");

			} else
				System.out.println(" ocupado ");

		}
		Pasajero Juan = new Pasajero();
		Pasajero Jose = new Pasajero();
		Pasajero Pedro = new Pasajero();
		Pasajero Maria = new Pasajero();
		Pasajero Alberto = new Pasajero();

	}

}
