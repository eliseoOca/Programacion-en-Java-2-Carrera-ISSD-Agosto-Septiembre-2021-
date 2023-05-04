
public class Club {
	
	Socio s1,s2,s3;
	public Club()
	{
		s1=new Socio();
		s2=new Socio();
		s3=new Socio();
	}
	
	void antiguedad()
	{
		s1.imprimirEdadAntiguedad();
		s2.imprimirEdadAntiguedad();
		s3.imprimirEdadAntiguedad();
		
		int a1 = s1.mostrarAntiguedad();
		int a2 = s2.mostrarAntiguedad();
		int a3 = s3.mostrarAntiguedad();
		
		if (a1>a2 && a1>a3)
			System.out.print("Socio 1 es con mas antiguedad");
			if(a2>a1 && a2>a3)
				System.out.print("Socio 2 es con mas antiguedad");
			else
				System.out.print("Socio 3 es con mas antiguedad");
			
	}

	public static void main(String[] args) {
		Club c= new Club();
		c.antiguedad();
		c.cargarSocio1();
	

	}

}
