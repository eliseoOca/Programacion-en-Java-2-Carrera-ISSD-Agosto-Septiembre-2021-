package ejercicio4;

import java.util.Scanner;

public class ejercicios4 {
	private Scanner teclado;
	int lado;
	
	public void inicializar()
	{
		teclado= new Scanner(System.in);
		System.out.print("Ingrese valor del lado: ");
		lado=teclado.nextInt();
	}
	
	public void imprimirPerimetro()
	{
		int perimetro;
		perimetro=lado*4;
		System.out.println("El perimetro es:"+ perimetro);
	}
	
	public void imprimirSuperficie()
	{
		int superficie;
		superficie=lado*lado;
		System.out.print("La superficie es:"+superficie);
		
	}

	public static void main(String[] args) {
		ejercicios4 c=new ejercicios4();
		c.inicializar();
		c.imprimirPerimetro();
		c.imprimirSuperficie();
	

	}

}
