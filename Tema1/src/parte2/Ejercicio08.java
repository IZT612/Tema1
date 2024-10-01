package parte2;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable longitud
		double longitud;
		
		// Creamos la variable longitudCm
		double longitudCm;
		
		// Pedimos al usuario la longitud y la introducimos
		System.out.println("Introduzca la longitud del lanzamiento en metros");
		longitud = lectura.nextDouble();
		
		// Calculamos la longitud en centímetros
		longitudCm = longitud * 100;
		
		// Le mostramos al usuario la parte entera de la longitud en centímetros
		System.out.println("La longiud final es de " + (int) longitudCm + " centímetros");
		
		// Cerramos el proceso de lectura
		lectura.close();
	

	}

}
