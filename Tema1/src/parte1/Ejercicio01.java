package parte1;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creación de la variable número
		int numero;
		
		// Creación del proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Indicamos al usuario que introduzca un número
		System.out.println("Introduce un número cualquiera");
		
		// Introducimos el valor dado por el usuario a la variable anteriormente creada
		numero = lectura.nextInt();
		
		// Le mostramos al usuario el número que él ha introducido
		System.out.println("El número que has introducido es "+ numero);
		
		// Cerramos el proceso de lectura
		lectura.close();
	}

}
