package parte2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Creamos el proceso de lectura
		Scanner lectura = new Scanner(System.in);
		
		// Creamos la variable num donde guardaremos el número que introduzca el usuario
		double num;
		
		// Le pedimos al usuario un número para redondearlo
		System.out.println("Introduzca un número con decimales para redondearlo");
		
		// Introducimos el valor recibido en la variable
		num = lectura.nextDouble();
		
		/* Sumamos 0,5 al número recibido y lo truncamos, de esta forma si el número se debería redondear al siguiente significa que 
		tiene 5 décimas o más, por lo que al sumar 0,5 y truncarlo nos daría el numero redondeado, en caso de no llegar a las 5
		décimas este no llegaría por lo que al truncarlo también nos da el número correcto. Y finalmente se lo mostramos al usuario*/
		System.out.println("El número redondeado es " + (int) (num + 0.5));
		
		// Cerramos el proceso de lectura
		lectura.close();

	}

}
