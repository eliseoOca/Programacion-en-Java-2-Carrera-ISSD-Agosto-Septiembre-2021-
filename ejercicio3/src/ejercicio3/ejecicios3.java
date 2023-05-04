package ejercicio3;

import java.util.Scanner;

public class ejecicios3 {
	
	private Scanner teclado;
	int x,y;
	
	public void inicializar()
	{
		teclado = new Scanner(System.in);
		System.out.print("Ingresar la cordenada x: ");
		x=teclado.nextInt();
		
		System.out.print("Ingresar la coordenada y: ");
		y=teclado.nextInt();
		
	}
	public void mostrarCuadrante()
	{
		if(x==0 && y==0)
			System.out.print("El punto esta en el origenl de coordenadas");
		else
			if(x==0)
				System.out.print("El punto esta en el eje y ");
			else
				if(y==0)
					System.out.print("El punto esta en el eje x ");
				else
		  if(x>0 && y>0)
			System.out.print("El punto esta en el cuadrante 1");
		else
			if(x<0 && y>0)
				System.out.print("El punto esta en el cuadrante 2");
			else
				if(x<0 && y<0)
					System.out.print("El punto esta en el cuadrante 3");
				else
					System.out.print("El punto esta en el cuadrante 4");
		
		
	}
	

	public static void main(String[] args) {
		ejecicios3 c= new ejecicios3();
		c.inicializar();
		System.out.println();
		c.mostrarCuadrante();
		
	}

}
