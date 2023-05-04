package ejercicio10;

import java.util.Scanner;


public class ejercicios10 {
	private Scanner teclado;
	int valor1,valor2;
	
	public ejercicios10()
	{
		teclado=new Scanner(System.in);
		System.out.print("Ingrese valor1: ");
		valor1=teclado.nextInt();
		
		System.out.print("Ingrese valor2: ");
		valor2=teclado.nextInt();
	}
	
	public void calculo()
	{   
		int suma,resta,multiplicacion;
		float division;
		suma=valor1 + valor2;
		resta=valor1 - valor2;
		multiplicacion = valor1 * valor2;
		division= valor1 / valor2;
		System.out.println("La suma de los valores es: " + suma);
		System.out.println("La resta de los valores es:  " + resta);
		System.out.println("La multiplicacion de los valores es: "+ multiplicacion);
		System.out.println("La division de los valores es: "+ division);
		
	}

	public static void main(String[] args) {
		ejercicios10 o= new ejercicios10();
		System.out.println();
		o.calculo();

	}

}
