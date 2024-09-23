package parte1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable de la primera nota
		double nota1;
		
		// Creamos la variable de la segunda nota
		double  nota2;
		
		// Creamos la variable de la nota media
		double notaMedia;
		
		// Le preguntamos al usuario cuál es la primera nota
		System.out.println("¿Cuál es la primera nota?");
		
		// Insertamos el valor introducido por el usuario en la variable
		nota1 = lectura.nextDouble();
		
		// Le pregutnamos al usuario cuál es la segunda nota
		System.out.println("¿Y la segunda?");
		
		// Insertamos el valor introducido por el usuario en la variable
		nota2 = lectura.nextDouble();
		
		// Calculamos la nota media
		notaMedia = (nota1 + nota2) / 2;
		
		// Le mostramos al usuario su nota media
		System.out.println("Tu nota media es " + notaMedia);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
