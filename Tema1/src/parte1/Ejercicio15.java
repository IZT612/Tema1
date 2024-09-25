package parte1;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la constante del IVA
		final int IVA = 21;
		
		// Creamos la variable del precio
		double precio;
		
		// Le pedimos al usuario el precio
		System.out.println("Introduzca un precio para calcular el IVA");
		
		// Introducimos el valor recibido en la variable
		precio = lectura.nextDouble();
		
		// Calculamos el precio final y se lo mostramos al usuario
		System.out.println("El precio final con el IVA aplicado será de " + (precio + ((IVA * precio) / 100)));
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
