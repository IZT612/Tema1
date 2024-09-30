package parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos las constantes y las variables necesarias
		final double PRECIO_INFANTIL = 15.5;
		final double PRECIO_ADULTO = 20;
		int cantidadInfantil;
		int cantidadAdulto;
		double precioFinal;
		
		// Pedimos la cantidad de entradas vendidas de cada tipo y lo asignamos a cada variable
		System.out.println("Cuántas entradas infantiles ha vendido?");
		cantidadInfantil = lectura.nextInt();
		
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
