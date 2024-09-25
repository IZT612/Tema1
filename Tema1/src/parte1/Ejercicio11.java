package parte1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable euros
		int euros;
		
		// Creamos la variable pesetas
		int pesetas;
		
		// Le pedimos al usuario una cantidad de euros
		System.out.println("Introduzca una cantidad de euros para convertir en pesetas");
		
		// Introducimos esa cantidad de euros en la variable
		euros = lectura.nextInt();
		
		// Calculamos cuantas pesetas son esa cantidad de euros y lo asignamos a la variable
		pesetas = euros * 166;
		
		// Le mostramos al usuario cuantas pesetas son la cantidad de euros que introdujo
		System.out.println(euros + " euros son " + pesetas + " pesetas.");
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
