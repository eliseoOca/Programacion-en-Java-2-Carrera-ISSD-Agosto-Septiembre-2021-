import java.util.Scanner;
public class Socio {
	String nombre;
	int antiguedad;
	Scanner teclado;
	
	public Socio ()
	{
		teclado = new Scanner(System.in);
		
	}
	
	public void cargarSocio1()
	{
		System.out.print("Ingrese un Nombre de socio 1: ");
		nombre=teclado.next();
		
		System.out.print("Ingrese Edad; ");
		antiguedad=teclado.nextInt();
	}
	
	public void cargarSocio2()
	{
		System.out.print("Ingrese un Nombre de socio 2: ");
		nombre=teclado.next();
		
		System.out.print("Ingrese Edad; ");
		antiguedad=teclado.nextInt();
	}
	
	public void cargarSocio3()
	{
		System.out.print("Ingrese un Nombre de socio 3: ");
		nombre=teclado.next();
		
		System.out.print("Ingrese Edad; ");
		antiguedad=teclado.nextInt();
	}
	
	public void imprimirEdadAntiguedad()
	{
		System.out.print("DATOS DEL SOCIO" );
		System.out.println(nombre + "-" + antiguedad );
		
	}
	
	public int mostrarAntiguedad()
	{
		return antiguedad ;
	}

}
