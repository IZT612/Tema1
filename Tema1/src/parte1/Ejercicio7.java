package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable nombre
		String nombre;
		
		// Creamos la variable direccion
		String direccion;
		
		// Creamos la variable telefono
		int telefono;
		
		// Le pedimos al usuario su nombre
		System.out.println("Introduzca su nombre");
		
		// Introducimos el texto recibido en la variable nombre
		nombre = lectura.nextLine();
		
		// Le pedimos al usuario su dirección
		System.out.println("Introduzca su dirección");
		
		// Introducimos el texto recibido en la variable direccion
		direccion = lectura.nextLine();
		
		// Le pedimos al usuario su número de teléfono
		System.out.println("Introduzca su número de teléfono");
		
		// Introducimos el número recibido en la variable telefono
		telefono = lectura.nextInt();
		
		// Le mostramos al usuario su nombre
		System.out.println("Nombre: " + nombre);
		
		// Le mostramos al usuario su dirección
		System.out.println("Dirección: " + direccion);
		
		// Le mostramos al usuario su número de teléfono
		System.out.println("Teléfono: " + telefono);

		// Cerramos el proceso de lectura
		lectura.close();
		
	}

}
