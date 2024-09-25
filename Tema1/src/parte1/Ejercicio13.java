package parte1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos una variable boolean para saber si NO está lloviendo
		boolean noLloviendo;
		
		// Creamos una variable boolean para saber si hemos acabado las tareas
		boolean tareasAcabadas;
		
		// Creamos una variable boolean para saber si tenemos que ir a la biblioteca
		boolean biblioteca;
		
		// Creamos una variable boolean para saber si podemos salir  a la calle
		boolean salir;
		
		// Le pregutnamos al usuario si el cielo está despejado
		System.out.println("¿Está el cielo despejado?");
		
		// Insertamos el valor recibido en la variable
		noLloviendo = lectura.nextBoolean();
		
		// Le pregutnamos al usuario si ha acabado las tareas
		System.out.println("¿Has acabado las tareas?");
		
		// Insertamos el valor recibido en la variable
		tareasAcabadas = lectura.nextBoolean();
		
		// Le preguntamos al usuario si tiene que ir a la biblioteca
		System.out.println("¿Tienes que ir a la biblioteca?");
		
		// Insertamos el valor recibido en la variable
		biblioteca = lectura.nextBoolean();
		
		// Comparamos a true la siguiente comparación: Si no esta lloviendo Y hemos acabado las tareas O tenemos que ir a la biblioteca
		salir = (biblioteca ||(noLloviendo && tareasAcabadas)) == true;
		
		// Le mostramos el resutlado al usuario
		System.out.println(salir);
		
		// Cerramos el proceso de lectura
		lectura.close();
		
	}

}
