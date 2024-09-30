package parte2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos las variables necesarias
		double milimetros;
		double centimetros;
		double metros;
		
		// Pedimos los datos y los introducimos en las variables
		System.out.println("Introduzca una longitud en milímetros");
		
		milimetros = lectura.nextDouble();
		
		System.out.println("Introduzca una longitud en centímetros");
		
		centimetros = lectura.nextDouble();
		
		System.out.println("Introduzca una longitud en metros");
		
		metros = lectura.nextDouble();
		
		// Pasamos todas las unidades a centímetros y las sumamos y finalmente se la mostramos al usuario
		System.out.println("La longitud total es de " + ((milimetros / 10) + centimetros + (metros * 100)) + " centímetros");
		
		// Cerramos el proceso de lectura
		lectura.close();
		
		
		

	}

}
