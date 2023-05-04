
public class Prueba {

	public static void main(String[] args) {
		
		Suma s = new Suma();
		s.cargarValor1();
		s.cargarValor2();
		s.operar();
		System.out.print("La suma es: ");
		s.mostrarResultado();
		System.out.println();
		
		Resta r = new Resta();
		r.cargarValor1();
		r.cargarValor2();
		r.operar();
		System.out.print("La resta es: ");
		r.mostrarResultado();
		
		
	}

}
