package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable num donde guardaremos el número
		int num;
		
		int resto;
		
		boolean par;
		
		System.out.println("Introduzca un número para comprobar si es par");
		
		num = lectura.nextInt();
		
		resto = num % 2;
		
		par = resto == 0;
		
		System.out.println(par);
		
		lectura.close();
		
	}

}
