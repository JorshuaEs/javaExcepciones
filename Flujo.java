//pila de ejecucion
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (MiException e) {
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}	

	private static void metodo1() throws MiException{
		System.out.println("Ini do metodo1");
	
			metodo2();
		
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MiException {//Estar seguro que se puede lanzar la excepcion
		System.out.println("Ini do metodo2");
		throw new MiException("Mi excepcion fue lanzada");

	}
}
