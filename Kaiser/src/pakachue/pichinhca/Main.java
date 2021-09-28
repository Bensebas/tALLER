package pakachue.pichinhca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		System.out.println("*Banco del Pichincha seleccione una opción");
		System.out.println("1. Retirar dinero");
		System.out.println("2. Cambiar de clave");
		System.out.println("3. Bloquear cuenta");
		System.out.println("4. SALIR");

		int cosa = 0;
		int seleccion = 0;
		int retiro = 0;
		
			do {
				seleccion = lector.nextInt();
				if (seleccion >= 1 && seleccion <= 4) {
					cosa = 1;
				} else {
					System.out.println("ingrese una de las opciones");
				}

			} while (cosa == 0);

			if (seleccion == 1) {
				System.out.println("Ingrese valor a retirar:");
				retiro = lector.nextInt();
				
				System.out.println("El valor a retirar es:"+ retiro);
				

			} else if (seleccion == 2) {
				System.out.println("Ingrese nueva clave:");
				System.out.println("Su clave ha sido cambiada");

			} else if (seleccion == 3) {
				System.out.println("Su cuenta ha sido bloqueada");

			} else if (seleccion == 4) {
				System.out.println("Gracias");
			
		} while (cosa != 2);
	
}}
