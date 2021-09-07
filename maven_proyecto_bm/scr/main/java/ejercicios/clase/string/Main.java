package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "El que madruga Diosle ayuda";
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra = teclado.nextLine();
		
		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra"+resultado);
		
		System.out.println("********");
		String cadena1 = "edison";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("las cadenas son iguales"+ resultado2);
		
		System.out.println("*************");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula:" + nombreEnMayuscula);
		
		String nombre2 = "Jose";
		String nombreEnMinuscula = nombre2.toLowerCase();
		System.out.println("Nombre en minusculas:" + nombreEnMinuscula);
		
		
		

	}

}
