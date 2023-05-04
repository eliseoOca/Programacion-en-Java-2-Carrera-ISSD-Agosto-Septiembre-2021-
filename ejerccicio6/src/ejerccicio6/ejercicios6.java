package ejerccicio6;

import java.util.Scanner;

public class ejercicios6 {
	private Scanner teclado;
	int valor1,valor2;
	
	public void inicializar()
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
		ejercicios6 o= new ejercicios6();
		o.inicializar();
		System.out.println();
		o.calculo();

	}

}
