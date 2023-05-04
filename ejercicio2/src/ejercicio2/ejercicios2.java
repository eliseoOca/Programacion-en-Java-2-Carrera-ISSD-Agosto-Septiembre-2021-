package ejercicio2;

import java.util.Scanner;

public class ejercicios2 {
	private Scanner teclado;
	private int lado1;
	private int lado2;
	private int lado3;
	
	
	
	public void inicializar()
	{
		teclado = new Scanner(System.in);
		
	    System.out.print("Ingresar lado1: ");
		lado1 =teclado.nextInt();
		
		System.out.print("Ingresar lado2: ");
		lado2 = teclado.nextInt();
		
		System.out.print("Ingresar lado3: ");
		lado3 = teclado.nextInt(); 
		
	}
	
	public void ladoMayor()
	{
		if (lado1==lado2 && lado1==lado3)
		System.out.print("Los tres lado son iguales");
		else
			
		
		if(lado1>lado2 && lado1>lado3)
			System.out.print("Lado1 es mayor");
		else
			if(lado2>lado3)
				System.out.print("Lado2 es mayor");
			else
				System.out.print("Lado3 es mayor");
	}
	public void tipo()
	{
		if (lado1==lado2 && lado1==lado3)
			System.out.print("Es un triangulo Equilatero");
		else
			if(lado1==lado2 || lado2==lado3 || lado1==lado3)
				System.out.print("Es un triangulo Isosceles");
			else
				System.out.print("El un triangulo Escaleno");
	}

	public static void main(String[] args) {
		ejercicios2 t = new ejercicios2();
		t.inicializar();
		System.out.println();
		t.ladoMayor();
		System.out.println();
		t.tipo();
		

	}

}
