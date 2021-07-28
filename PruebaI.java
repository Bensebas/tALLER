/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebaI;

import java.util.Scanner;

/**
 *
 
 */
public class PruebaI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
int cont=0;
		double suma=0;
		Scanner sc=new Scanner(System.in);
		float sig = 0;
                System.out.println("Introduzca un número:");
		sig=sc.nextFloat();
		suma+=sig;
		cont++;
		
		
		
		if(sig==0) {
			System.out.println("Promedio=0 y suma=0");
		}else {
			while (sig>0) {
                            System.out.println("Introduzca un número:");
				sig=sc.nextFloat();
				suma+=sig;
                                if(sig>0){
                                   cont++; 
                                }
				
			}
		}
		
		float prom=(float) (suma/cont);
		System.out.println("Promedio="+prom+" y suma="+suma);



    }

}
