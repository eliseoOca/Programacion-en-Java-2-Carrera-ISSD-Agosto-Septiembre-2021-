package ejercicio1;
import java.util.Scanner;

public class ejercicios1 {
	private Scanner teclado;
	private String nombre;
	private int edad;
	
	public void inicializar()
	{
		teclado = new Scanner(System.in);
		System.out.print("Ingrese un Nombre: ");
		nombre=teclado.next();
		
		System.out.print("Ingrese Edad; ");
		edad=teclado.nextInt();
	}
	
	public void esMayorEdad()
	{
		if (edad>=18)
			System.out.print("Es mayor de edad");
		else
			System.out.print("No es mayor de edad");
	}
	

	public static void main(String[] args) {
		ejercicios1 p= new ejercicios1();
		p.inicializar();
		System.out.println("");
		p.esMayorEdad();
	

	}

}
