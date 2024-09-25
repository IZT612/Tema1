package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos una constante con el precio del kilo de manzanas
		final double PRECIO_MANZANAS = 2.35;
		
		// Creamos una constante con el precio del kilo de peras
		final double PRECIO_PERAS = 1.95;
		
		// Creamos una variable de los kilos de manzanas
		double kgManzanas;
		
		// Creamos una variable de los kilos de peras
		double kgPeras;
		
		// Creamos una variable de los ingresos de las manzanas
		double ingresosManzanas;
		
		// Creamos una variable de los ingresos de las peras
		double ingresosPeras;
		
		// Creamos una variable de los ingresos totales
		double total;
		
		// Le pedimos al usuario que introduzca cuantos kilos de manzanas ha vendido
		System.out.println("Introduzca cuantos kilos de manzanas ha vendido");
		
		// Introducimos el valor recibido en la variable
		kgManzanas = lectura.nextDouble();
		
		// Le pedimos al usuario que introduzca cuantos kilos de peras ha vendido
		System.out.println("Introduzca cuantos kilos de peras ha vendido");
		
		// Introducimos el valor recibido en la variable
		kgPeras = lectura.nextDouble();
		
		// Calculamos los ingresos recibidos con la venta de manzanas
		ingresosManzanas = PRECIO_MANZANAS * kgManzanas;
		
		// Calculamos los ingresos recibidos con la venta de peras
		ingresosPeras = PRECIO_PERAS * kgPeras;
		
		// Calculamos los ingresos totales
		total = ingresosManzanas + ingresosPeras;
		
		// Le mostramos al usuario cuanto ha recibido con la venta de manzanas
		System.out.println("Ingreso total de manzanas: " + ingresosManzanas);
		
		// Le mostramos al usuario cuanto ha recibido con la venta de peras
		System.out.println("Ingreso total de peras: " + ingresosPeras);
		
		// Le mostramos al usuario cuanto ha recibido en total
		System.out.println("Ingresos totales: " + total);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
