package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creación de la variable edad
		int edad;
		
		// Creación del proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Indicamos al usuario que introduzca su edad
		System.out.println("Introduzca su edad");
		
		// Introducimos el valor dado por el usuario a la variable anteriormente creada y le sumamos 1, que será su edad el próximo año
		edad = lectura.nextInt() + 1;
		
		// Le mostramos al usuario cuanta edad tendrá el próximo año
		System.out.println("El próximo año tendrás " + edad + " años");
		
		// Cerramos el proceso de lectura
		lectura.close();
	}

}
