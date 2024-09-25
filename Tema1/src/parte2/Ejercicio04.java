package parte2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos las variables necesarias
		double a;
		double b;
		double c;
		double x;
		double resultado;
		
		// Preguntamos los valores de todas las variables (excepto resultado) y las insertamos
		System.out.println("Introduzca el valor del coeficiente 'a'");
		
		a = lectura.nextDouble();
		
		System.out.println("Introduzca el valor del coeficiente 'b'");
		
		b = lectura.nextDouble();
		
		System.out.println("Introduzca el valor del coeficiente 'c'");
		
		c = lectura.nextDouble();
		
		System.out.println("Introduzca finalmente el valor de 'x'");
		
		x = lectura.nextDouble();
		
		// Calculamos el resultado y lo guardamos en la variable
		resultado = (a * x * x) + (b * x) + c;
		
		// Le mostramos al usuario el resultado final
		System.out.println("'y' tiene un valor de " + resultado);
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
