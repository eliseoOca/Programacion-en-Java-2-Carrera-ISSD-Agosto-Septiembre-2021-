package ejercicios7;

import java.util.Scanner;

public class ejercicio7 {
	private Scanner teclado;
	String nombre;
	int edad;
	
	public ejercicio7()
	{
		teclado=new Scanner(System.in);
		System.out.print("Ingrese nombre Alumno: ");
		nombre=teclado.next();
		System.out.print("Ingrese edad de Alumno: ");
		edad=teclado.nextInt();
	}
	public void imprimir()
	{
		System.out.println("Nombre del Alumno: " + nombre);
		System.out.println("Edad del Alumno: " + edad);
	}
	
	public void MayorEdad()
	{
		if(edad>=18)
			System.out.print(nombre + " con "+ " " + edad + " años " + " " + "Es mayor de edad");
		else
			System.out.print(nombre + " con "+ " " + edad  + " años " + " " + "Es menor de edad");
	}
	
	public static void main(String[] args) {
		ejercicio7 m=new ejercicio7();
		m.imprimir();
		System.out.println();
		m.MayorEdad();
		

	}

}
