package ejercicio9;

import java.util.Scanner;


public class ejercicios9 {

		private Scanner teclado;
		String nombre;
		int sueldo;
	public  ejercicios9()
	{ teclado= new Scanner(System.in);
	System.out.print("Ingrese nombre del empleado: ");
	nombre=teclado.next();

	System.out.print("Ingrese sueldo del empleado: ");
	sueldo=teclado.nextInt();
		}

	public void datos()
	{
		System.out.print("Datos del empleado: " + "Nombre:" + nombre + " " + "sueldo:$" + sueldo);
	}

	public void impuestos()
	{
		if(sueldo>3000)
			System.out.print("El sueldo es mayor $3000 debe pagar impuesto");
		else
			System.out.print("El sueldo es menor que $3000, no debe pagar impuestos");
	}
		
		public static void main(String[] args) {
			ejercicios9 e=new ejercicios9();
			
			System.out.println();
			e.datos();
			System.out.println();
			e.impuestos();
			

		}

	}
