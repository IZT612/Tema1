package parte2;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la constante del precio de entradas infantiles
		final double PRECIO_INFANTIL = 15.5;
		
		// Creamos la constante del precio de entradas adultas
		final double PRECIO_ADULTO = 20;
		
		// Creamos la variable de cantidad de entradas infantiles
		int cantidadInfantil;
		
		// Creamos la variable de cantidad de entradas adultas
		int cantidadAdulto;
		
		// Creamos la variable del precio final
		double precioFinal;
		
		// Pedimos la cantidad de entradas infantiles vendidas y las introducimos
		System.out.println("Cuántas entradas infantiles ha vendido?");
		cantidadInfantil = lectura.nextInt();
		
		// Pedimos la cantidad de entradas adultas vendidas y las introducimos
		System.out.println("Cuántas entradas de adultos ha vendido?");
		cantidadAdulto = lectura.nextInt();
		
		// Calculamos el precio final
		precioFinal = PRECIO_ADULTO * cantidadAdulto + PRECIO_INFANTIL * cantidadInfantil;
		
		// Y ahora usamos un operador ternario para ver si hay que aplicar el 5% de descuento o no
		precioFinal = precioFinal > 100 ? precioFinal - (precioFinal * 0.05) : precioFinal;
		
		// Le mostramos al usuario el importe total de la venta de entradas
		System.out.println("El importe es de " + precioFinal + " euros");
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
