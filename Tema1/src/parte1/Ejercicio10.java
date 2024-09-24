package parte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable num donde guardaremos el número
		int num;
		
		// Creamos la variable resto
		int resto;
		
		// Creamos la variable boolean par
		boolean par;
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número para comprobar si es par");
		
		// Introducimos el número recibido en la variable
		num = lectura.nextInt();
		
		// Dividimos el número entre 2 y guardamos el resto en la variable
		resto = num % 2;
		
		// Verificamos si es par o no, para ser par el resto debe ser 0, si no, es impar
		par = resto == 0;
		
		// Le mostramos al usuario el resultado
		System.out.println(par);
		
		// Cerramos el proceso de lectura
		lectura.close();
		
	}

}
