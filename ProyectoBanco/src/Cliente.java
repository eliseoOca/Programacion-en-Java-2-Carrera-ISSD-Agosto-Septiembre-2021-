
public class Cliente {
	
	String nombre;
	float monto;
	
	public Cliente(String n)
	{
		nombre = n;
		monto= 0;
	}
	
	public void depositar(float m)
	{
		monto= monto + m;
		
	}
	public void extraer(float m)
	{
		monto= monto - m;
		
	}
	
	public  float retonarMonto()
	{
		return monto;
	}
	
	public void mostrarDatos()
	{
		System.out.println("El cliente " + nombre + "tiene un deposito de: $ " + monto);
	}

}
