package parte1;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creación del proceso de lectura
		
		Scanner lectura = new Scanner(System.in);
		
		// Creación de la variable que indica el año actual
		
		int añoActual;
		
		// Creación de la variable que indica la fecha de nacimiento del usuario
		
		int fechaNacimiento;
		
		// Creación de la variable que indica la edad del usuario
		
		int edad;
		
		// Pedimos al usuario que nos indique en que año estamos
		System.out.println("¿En qué año estamos?");
		
		// Y guardamos el año en la variable
		añoActual = lectura.nextInt();
		
		// Y esta vez pedimos en que año nació el usuario
		System.out.println("¿En qué año naciste?");
		
		// Y una vez más guardamos el valor introducido en la variable correspondiente
		fechaNacimiento = lectura.nextInt();
		
		// Y ahora calculamos su edad
		edad = añoActual - fechaNacimiento;
		
		// Y le mostramos su edad al usuario
		System.out.println("Tienes " + edad + " años");
		
		// Cerramos el proceso de lectura
		lectura.close();
	}

}
