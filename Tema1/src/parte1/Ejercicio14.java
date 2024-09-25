package parte1;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable de la primera nota
		int nota1;
		
		// Creamos la variable de la segunda nota
		int nota2;
		
		// Creamos la variable de la tercera nota
		int nota3;
		
		// Le pedimos al usuario la nota del primer trimeste
		System.out.println("Introduca la nota del primer trimestre");
		
		// Introducimos el valor recibido en la variable
		nota1 = lectura.nextInt();
		
		// Le pedimos al usuario la nota del segundo trimestre
		System.out.println("Introduzca la nota del segundo trimestre");
		
		// Introducimos el valor recibido en la variable
		nota2 = lectura.nextInt();
		
		// Le pedimos al usuario la nota del tercer trimestre
		System.out.println("Introduzca la nota del tercer trimestre");
		
		// Introducimos el valor recibido en la variable
		nota3 = lectura.nextInt();
		
		// Calculamos su nota entera y se la mostramos al usuario
		System.out.println("Nota en el boletín de calificaciones: " + (nota1 + nota2 + nota3) / 3);
		
		// Calculamos su nota con decimales y se la mostramos al usuario
		System.out.println("Nota en el expediente académico: " + (nota1 + nota2 + nota3 ) / 3.0);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
