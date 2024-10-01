package parte2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable milimetros
		double milimetros;
		
		// Creamos la variable centimetros
		double centimetros;
		
		// Creamos la variable metros
		double metros;
		
		// Pedimos los datos y los introducimos en la variable milimetros
		System.out.println("Introduzca una longitud en milímetros");
		milimetros = lectura.nextDouble();
		
		// Pedimos los datos y los introducimos en la variable centimetros
		System.out.println("Introduzca una longitud en centímetros");
		centimetros = lectura.nextDouble();
		
		// Pedimos los datos y los intrudicmos en la variable metros
		System.out.println("Introduzca una longitud en metros");
		metros = lectura.nextDouble();
		
		// Pasamos todas las unidades a centímetros y las sumamos y finalmente se la mostramos al usuario
		System.out.println("La longitud total es de " + ((milimetros / 10) + centimetros + (metros * 100)) + " centímetros");
		
		// Cerramos el proceso de lectura
		lectura.close();
		
		
		

	}

}
