package parte2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		
		int num;
		
		int suma;
		
		System.out.println("Introduzca un número para indicarle cuanto tiene que sumarle para que sea múltiplo de 7");
		
		num = lectura.nextInt();
		
		suma = (num % 7) == 0 ? 0 : (7 - (num % 7));
		
		System.out.println("Para que el número sea múltiplo de 7 debe sumar " + suma);
		
		lectura.close();

	}

}
