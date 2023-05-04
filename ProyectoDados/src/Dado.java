
public class Dado {
	
	int valor;
	
	public void tirar()
	{
		
		valor =(int)(Math.random()*6) + 1;
		
	}
	
	public void imprimirValor(String dado)
	{
		System.out.println("El valor " + dado + "  es: " + valor);
		
	}

	public int retornarValor()
	{
		return valor;
	}
}
