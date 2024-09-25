package parte2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable num1 donde guardaremos el primer número introducido por el usuario
		int num1;
		
		// Creamos la variable num2 donde guardaremos el segundo número introducido por el usuario
		int num2;
		
		// Creamos la variable suma donde guardaremos el número que falta sumarle a num para ser múltiplo del segundo número
		int suma;
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca el primer número");
		
		// Introducimos el valor en la variable
		num1 = lectura.nextInt();
		
		// Le volvemos a pedir al usuario que introduzca un número
		System.out.println("Introduzca el segundo número");
		
		// Introducimos el valor en la segunda variable
		num2 = lectura.nextInt();
		
		// Mediante un operador ternario vemos si el resto es 0, en ese caso se le debe sumar 0, si no, calculamos que número hay que sumar
		suma = (num1 % num2) == 0 ? 0 : (num2 - (num1 % num2));
		
		// Le mostramos al usuario el número que debe sumar para que sea múltiplo del segundo número
		System.out.println("Para que " + num1 + " sea múltiplo de " + num2 + " debe sumar " + suma);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
