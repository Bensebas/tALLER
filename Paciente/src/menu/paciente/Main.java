package menu.paciente;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		String nm = "";
		String ap = "";
		int ed = 0;
		String st = "";
		int selec = 0 ;
		

		Paciente p1 = new Paciente();
		p1.setNombre(nm);
		p1.setApellido(ap);
		p1.setEdad(ed);
		p1.setSintoma(st);

		Paciente p2 = new Paciente();
		p2.setNombre(nm);
		p2.setApellido(ap);
		p2.setEdad(ed);
		p2.setSintoma(st);
		Paciente p3 = new Paciente();
		p3.setNombre(nm);
		p3.setApellido(ap);
		p3.setEdad(ed);
		p3.setSintoma(st);
		Paciente p4 = new Paciente();
		p4.setNombre(nm);
		p4.setApellido(ap);
		p4.setEdad(ed);
		p4.setSintoma(st);
		Paciente p5 = new Paciente();
		p5.setNombre(nm);
		p5.setApellido(ap);
		p5.setEdad(ed);
		p5.setSintoma(st);

		Paciente lista[] = new Paciente[5];
		lista[0] = p1;
		lista[1] = p2;
		lista[2] = p3;
		lista[3] = p4;
		lista[4] = p5;

		do {
			System.out.println("******************************************");
			System.out.println("1. Registrar paciente");
			System.out.println("2. Imprimir reporte");
			System.out.println("3. SALIR");
			System.out.println("******************************************");
			selec = lector.nextInt();
			nm = lector.nextLine();
			if (selec == 1) {
				for (int i = 0; i < 5; i++) {
					Paciente e = lista[i];
				System.out.println("Registar paciente");
				nm = lector.nextLine();
				ap = lector.nextLine();
				ed = lector.nextInt();
				st = lector.nextLine();
				}

			} else if (selec == 2) {
				System.out.println("Aqui esta su reporte");
				System.out.println(lista);
			
				

			} else if (selec == 3) {
				System.out.println("Salio");
				selec = lector.nextInt();
			}

		} while (selec > 0 && selec < 4);
	}
}

