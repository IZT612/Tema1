package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable que contendrá el primer número
		double numero1;
		
		// Creamos la variable que contendrá el segundo número
		double numero2;
		
		// Creamos la variable que contendrá la suma de ambos números
		double suma;
		
		// Creamos la variable que contendrá la resta del primer número menos el segundo
		double resta;
		
		// Creamos la variable que contendrá el resultado de la multiplicación de ambos números
		double multiplicacion;
		
		// Creamos la variable que contendrá el resultado de la división del primer número entre el segundo
		double division;
		
		// Pedimos al usuario que inserte el primer número
		System.out.println("Introduzca el primer número");
		
		// Insertamos el valor obtenido en la variable correspondiente
		numero1 = lectura.nextDouble();
		
		// Pedimos al usuario que inserte el segundo número
		System.out.println("Introduzca el segundo número");
		
		// Insertamos el valor obtenido en la variable correspondiente
		numero2 = lectura.nextDouble();
		
		// Calculamos la suma entre ambos numeros y la guardamos en la variable correspondiente
		suma = numero1 + numero2;
		
		// Calculamos la resta del primer número menos el segundo y la guardamos en la variable correspondiente
		resta = numero1 - numero2;
		
		// Calculamos el resultado de la multiplicación de ambos números y lo guardamos en la variable correspondiente
		multiplicacion = numero1 * numero2;
		
		// Calculamos el resultado de la división del primer número entre el segundo y lo guardamos en la variable correspondiente
		division = numero1 / numero2;
		
		// Le mostramos al usuario el resultado de la suma
		System.out.println(numero1 + " + " + numero2 + " = " + suma);
		
		// Le mostramos al usuario el resultado de la resta
		System.out.println(numero1 + " - " + numero2 + " = " + resta);
		
		// Le mostramos al usuario el resultado de la multiplicación
		System.out.println(numero1 + " * " + numero2 + " = " + multiplicacion);
		
		// Le mostramos al usuario el resultado de la división
		System.out.println(numero1 + " / " + numero2 + " = " + division);
		
		// Cerramos el proceso de lectura
		lectura.close();
		

	}

}
