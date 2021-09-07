package paquete.estudiante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("******************************************");
		System.out.println("1.       Ingresar Estudiante");
		System.out.println("2.       Buscar Estudiante");
		System.out.println("3.       SALIR");
		System.out.println("******************************************");
		
		Scanner lector = new Scanner(System.in);
		int Estudiante [ ] = new int [5];
		int cedula = 0 ;
		int seleccion ;
		int cosa = 0 ;
		
		
		
		do {
			seleccion = lector.nextInt();
			if (seleccion >1&& seleccion<4 ) {
				cosa = 1;
		}else {
			System.out.println("Ingrese una opcion");
			}
		} while(cosa == 0);
		
		if (seleccion == 1 ) {
			System.out.println(" Ingresar No de cedula");
			cedula = lector.nextInt();
			Estudiante[0]= cedula;
			System.out.println("******************************************");
			System.out.println("1.       Ingresar Estudiante");
			System.out.println("2.       Buscar Estudiante");
			System.out.println("3.       SALIR");
			System.out.println("******************************************");
			
	}else if(seleccion == 2){
		cedula = lector.nextInt();
		System.out.println("******************************************");
		System.out.println("1.       Ingresar Estudiante");
		System.out.println("2.       Buscar Estudiante");
		System.out.println("3.       SALIR");
		System.out.println("******************************************");

	}else if(seleccion == 3){
		System.out.println("Salir");
		

	}
		

	}

}
