//pila de ejecucion
public class Flujo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}	

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			
			try {//intenta esto
				//int num = 0;
				//int resultado = i/num;
				//System.out.println(resultado);
				String test = null;
				System.out.println(test.toString());
				
			}catch(ArithmeticException | NullPointerException exception) {//Atrapa error
				System.out.println("Atrapo exception");
				exception.printStackTrace();
			}
			}
		System.out.println("Fim do metodo2");
	}
}
