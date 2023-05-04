package ejercicio8;

import java.util.Scanner;

public class ejercicios8 {
	private Scanner teclado;
	
	int[] sueldos;
	
	public ejercicios8()
	{
		teclado=new Scanner(System.in);
		sueldos=new int[5];
		for(int f=0; f<5;f++)
		{
			System.out.print("Ingrese valor de la componente: ");
			sueldos[f]=teclado.nextInt();
		}
	}
	
	public void imprimir()
	{
		for(int f=0;f<5;f++)
		{
			System.out.println(sueldos[f]);
		}
	}
	

	public static void main(String[] args) {
		ejercicios8 o=new ejercicios8();
		o.imprimir();
		

	}

}
