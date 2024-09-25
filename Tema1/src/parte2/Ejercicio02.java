package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		//Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable num donde guardaremos el número introducido por el usuario
		int num;
		
		// Creamos la variable suma donde guardaremos el número que falta sumarle a num para ser múltiplo de 7
		int suma;
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número para indicarle cuanto tiene que sumarle para que sea múltiplo de 7");
		
		// Introducimos el valor en la variable correspondiente
		num = lectura.nextInt();
		
		// Mediante un operador ternario vemos si el resto es 0, en ese caso se le debe sumar 0, si no, calculamos que número hay que sumar
		suma = (num % 7) == 0 ? 0 : (7 - (num % 7));
		
		// Le mostramos al usuario el número que debe sumar para que sea múltiplo de 7
		System.out.println("Para que el número sea múltiplo de 7 debe sumar " + suma);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
