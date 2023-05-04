
public class Banco {
	
	Cliente cliente1,cliente2,cliente3;
	
	public Banco()
	{
		cliente1=new Cliente("Marcelo");
		cliente2=new Cliente("Javier");
		cliente3=new Cliente("Alejandro");
		
	}
	
	public void operar()
	{
		cliente1.depositar(5000);
		cliente2.depositar(9000);
		cliente3.depositar(2000);
		cliente2.depositar(3000);
		cliente1.depositar(4000);
		cliente3.extraer(500);
	}
	
	public void mostrarDepositos()
	{
		System.out.println("Deposito de los clientes");
		System.out.println("------------------------");
		cliente1.mostrarDatos();
		cliente2.mostrarDatos();
		cliente3.mostrarDatos();
		
		float m1= cliente1.retonarMonto();
		float m2= cliente2.retonarMonto();
		float m3= cliente3.retonarMonto();
		float total= m1+ m2 + m3;
		System.out.print("El total dinero en el banco es: $" + total);
		
	}

	public static void main(String[] args) {
		Banco b= new Banco();
		b.operar();
		b.mostrarDepositos();
		

	}

}
