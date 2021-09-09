package paquete.estudiante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String cedula = null;

		Metodos estudiante1 = new Metodos();
		estudiante1.setCedulaVerdad(cedula);
		Metodos estudiante2 = new Metodos();
		estudiante2.setCedulaVerdad(cedula);
		Metodos estudiante3 = new Metodos();
		estudiante3.setCedulaVerdad(cedula);
		Metodos estudiante4 = new Metodos();
		estudiante4.setCedulaVerdad(cedula);
		Metodos estudiante5 = new Metodos();
		estudiante5.setCedulaVerdad(cedula);

		Scanner lector = new Scanner(System.in);
		Metodos Estudiante[] = new Metodos[5];
		Estudiante[0] = estudiante1;
		Estudiante[1] = estudiante2;
		Estudiante[2] = estudiante3;
		Estudiante[3] = estudiante4;
		Estudiante[4] = estudiante5;

		int seleccion;

		do {
			System.out.println("******************************************");
			System.out.println("1.       Ingresar Estudiante");
			System.out.println("2.       Buscar Estudiante");
			System.out.println("3.       SALIR");
			System.out.println("******************************************");

			seleccion = lector.nextInt();
			cedula = lector.nextLine();
			if (seleccion == 1) {
				for (int i = 0; i < 5; i++) {
					Metodos e = Estudiante[i];
				System.out.println("Ingrese la cedula");
				cedula = lector.nextLine();
				}

			} else if (seleccion == 2) {
				System.out.println("Ingrese la cedula");
				for (int i = 0; i < 5; i++) {
					Metodos e = Estudiante[i];
					String no1 = cedula;
					String no2 = lector.nextLine();
					boolean igual = no1.equals(no2);
					if(igual == true) {
						System.out.println("SI");
						
					}else {
						System.out.println("NO");
					}
				}

			} else if (seleccion == 3) {
				System.out.println("Salio");
				seleccion = lector.nextInt();
			}

		} while (seleccion > 0 && seleccion < 4);
	}
}
