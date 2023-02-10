
public class Conexion {
	public Conexion() {
		System.out.println("Abriendo Conexion");
	}
	
	public void leerDatos() {
		System.out.println("Recibiendo datos");
		throw new IllegalStateException();//cuando la conexion no se pudo realizar por algun motivo
	}
	
	public void cerrar() {
		System.out.println("Cerrando conexion");
	}
}
