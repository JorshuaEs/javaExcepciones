
public class TestConexion {
	public static void main(String[] args) {
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Recibiendo exception");
			ex.printStackTrace();
		}finally {
			System.out.println("Ejecutando finally");
			if( con != null) {
				con.cerrar();
			}
			
		}
		
	}
	
}
