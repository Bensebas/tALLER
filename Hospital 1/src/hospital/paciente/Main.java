package hospital.paciente;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner Lector = new Scanner(System.in);
		Scanner LectorB = new Scanner(System.in);
		Scanner LectorN = new Scanner(System.in);
		int opcion = 0;
		int indice = 0;
		int ind = 0;
		String nombreP = "";
		String apellidoP = "";
		String car = "";
		String carB = "";
		int edadP = 0;
		String codigoDeSeguroP = "";
		String nombreA = "";
		String apellidoA = "";

		int edadA = 0;
		String codigoDeSeguroA = "";
		String codigoDescuentoA = "";
		String codigoBeneficionP = "";
		String var = "no";

		Paciente3eraEdad paciente3 = new Paciente3eraEdad();
		PacienteAdolecente pacienteA = new PacienteAdolecente();
		Paciente listPad[] = new Paciente[10];

		do {
			System.out.println("*********************************");
			System.out.println("1) Ingrese un Paciente");
			System.out.println("2) Busqueda por codigo de seguro");
			System.out.println("3) Salir");
			System.out.println("*********************************");
			opcion = LectorN.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("¿ Que tipo de paciente desea ingresar\n?");
				System.out.println("a. Paciente 3era edad\n");
				System.out.println("b. Paciente Adolecente\n");
				car = Lector.nextLine();

				if (car.equals("a")) {

					System.out.println("Ingrese los datos del paciente\n");

					do {
						System.out.println("Ingrese el nombre");
						nombreP = Lector.next();
						System.out.println("Ingrese el apellido");
						apellidoP = Lector.next();
						System.out.println("Ingrese la edad");
						edadP = LectorN.nextInt();
						System.out.println("Ingrese el codigo de seguro");
						codigoDeSeguroP = Lector.next();
						System.out.println("Ingrese codigo de beneficio");
						codigoBeneficionP = Lector.next();

						paciente3.setNombre(nombreP);
						paciente3.setApellido(apellidoP);
						paciente3.setEdad(edadP);
						paciente3.setCodigoDeSeguro(codigoDeSeguroP);
						paciente3.setCodigoBeneficion(codigoBeneficionP);

						listPad[indice] = paciente3;
						indice++;
						System.out.println("¿Deseas ingresar otro Paciente 3era edad? (yes/no): ");
						var = LectorN.next();
					} while (var.compareTo("yes") == 0);

				} else if (car.equals("b")) {

					System.out.println("Ingrese los datos del paciente\n");

					do {

						System.out.println("Ingrese el nombre");
						nombreA = Lector.next();
						System.out.println("Ingrese el apellido");
						apellidoA = Lector.next();
						System.out.println("Ingrese la edad");
						edadA = LectorN.nextInt();
						System.out.println("Ingrese el codigo de seguro");
						codigoDeSeguroA = Lector.next();
						System.out.println("Ingrese codigo de descuento");
						codigoDescuentoA = Lector.next();

						pacienteA.setNombre(nombreA);
						pacienteA.setApellido(apellidoA);
						pacienteA.setEdad(edadA);
						pacienteA.setCodigoDeSeguro(codigoDeSeguroA);
						pacienteA.setCodigoDescuento(codigoDescuentoA);

						listPad[indice] = pacienteA;
						indice++;
						System.out.println("¿Deseas ingresar otro Paciente 3era edad? (yes/no): ");
						var = LectorN.next();
					} while (var.compareTo("yes") == 0);

				}

				;
				break;

			case 2:

				System.out.println("¿ Que tipo de paciente desea buscar\n?");
				System.out.println("a. Paciente 3era edad\n");
				System.out.println("b. Paciente Adolecente\n");
				carB = LectorB.next();
				if (carB.equals("a")) {
					System.out.println("Ingrese el codigo de seguro\n");

					String codigoDeSeguro = Lector.next();
					for (int i = 0; i < indice; i++) {
						if (listPad[i].getCodigoDeSeguro().compareTo(codigoDeSeguro) == 0) {
							System.out.println("El Paciente fue encontrado:");
							System.out.println(listPad[i].toString());
							ind = 1;
						}

						else if (ind == 0) {
							System.out.println("El Paciente no fue encontrado:");
						}

					}

				} else if (carB.equals("b")) {
					System.out.println("Ingrese el codigo de seguro\n");
					String codigoDeSeguro = Lector.next();
					for (int i = 0; i < indice; i++) {
						if (listPad[i].getCodigoDeSeguro().compareTo(codigoDeSeguro) == 0) {
							System.out.println("El Paciente fue encontrado:");
							System.out.println(listPad[i].toString());
							ind = 1;
						}

						else if (ind == 0) {
							System.out.println("El Paciente no fue encontrado:");
						}

					}

				}
				;
				break;
			}

			System.out.println("¿Desea salir del programa? (yes/no)");

		} while (Lector.next().compareTo("no".toLowerCase()) == 0);

	}
}
