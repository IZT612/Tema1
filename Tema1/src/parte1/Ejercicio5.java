package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable del radio de la circunferencia que aun no conocemos
		double radio;
		
		// Creamos la variable de longitud de la circunferencia que calcularemos con el radio
		double longitud;
		
		// Creamos la variable de area de la circunferencia que calcularemos con el radio
		double area;
		
		// Le preguntamos al usuario cual es el radio de la circunferencia
		System.out.println("¿Cuál es el radio de la circunferencia?");
		
		// Guardamos el valor introducido en la variable radio
		radio = lectura.nextDouble();
		
		// Calculamos la longitud con la siguiente formula: 2πr
		longitud = radio * 2 * Math.PI;
		
		// Calculamos el area con la siguiente formula: π(r^2)
		area = Math.PI * Math.pow(radio, 2);
		
		// Le mostramos al usuario la longitud y area obtenidas
		System.out.println("La longitud de la circunferencia es de " + longitud + " unidades y el area es de " + area +  " unidades cuadradas");
		
		// Cerramos el proceso de lectura
		lectura.close();
		
	}

}
