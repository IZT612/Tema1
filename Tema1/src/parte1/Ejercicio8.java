package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable nombre
		String nombre;
		
		// Creamos la variable edad
		int edad;
		
		// Le pedimos al usuario su nombre
		System.out.println("Introduzca su nombre");
		
		// Guardamos su nombre en la variable nombre
		nombre = lectura.nextLine();
		
		// Le pedimos al usuario su edad
		System.out.println("Introduzca su edad");
		
		// Guardamos su edad en la variable edad
		edad = lectura.nextInt();
		
		// Le damos un mensaje al usuario utilizando su nombre y su edad
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
