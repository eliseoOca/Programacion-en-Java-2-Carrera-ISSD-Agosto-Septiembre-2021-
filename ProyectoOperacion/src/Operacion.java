import java.util.Scanner;

public class Operacion {

	protected Scanner teclado;
	protected int valor1;
	protected int valor2;
	protected int resultado;
	
	
	public Operacion()
	{
		teclado=new Scanner(System.in);
	}
	
	public void cargarValor1()
	{
		System.out.print("Ingrese el primer valor: ");
		valor1=teclado.nextInt();
		
		
	}
	public void cargarValor2()
	{
		System.out.print("Ingrese el segundo valor valor: ");
		valor2=teclado.nextInt();
	}
	
	
	public void mostrarResultado()
	{
		System.out.println(resultado);
	}
}
