package parte1;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable edad
		int edad;
		
		// Creamos la variable mayor como boolean, que nos indicará si es mayor o menor de edad
		boolean mayor;
		
		// Le pedimos al usuario que introduzca su edad
		System.out.println("Introduzca su edad para verificar si es mayor de edad o no");
		
		// Introducimos el valor recibido en la variable edad
		edad = lectura.nextInt();
		
		// Le damos al boolean el resultado obtenido de la comparacion entre edad y 18
		mayor = edad >= 18;
		
		// Le mostramos al usuario el resultado
		System.out.println(mayor);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
