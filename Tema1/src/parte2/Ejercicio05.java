package parte2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable segundos
		int segundos;
		
		// Creamos la variable minutos
		int minutos;
		
		// Creamos la variable horas
		int horas;
		
		// Le pedimos al usuario que introduzca la cantidad de segundos
		System.out.println("Introduzca cuantos segundos hay que convertir");
		
		// Introducimos el valor recibido en la variable
		segundos = lectura.nextInt();
		
		// Calculamos cuantos minutos hay en los segundos introducidos y lo guardamos
		minutos = segundos / 60;
		
		// Calculamos los segundos que quedan tras convertirlos a minutos y reescribimos la variable
		segundos = segundos % 60;
		
		// Calculamos las horas que hay en los minutos calculados
		horas = minutos / 60;
		
		// Calculamos los minutos que quedan tras convertirlos a horas y reescribimos la variable
		minutos = minutos % 60;
		
		// Le mostramos al usuario el resultado final
		System.out.println("Son " + horas + " horas, " + minutos + " minutos, y " + segundos + " segundos");
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
