package operadores;

public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Impl�citas --> No necesita codigo adicional , son siempre seguras
		byte x = 10;
		short y = x;
		float z = 3.4f;
		double d = z;
		
		//Expl�citas --> Necesitamos a�adir c�digo , no son seguras.
		
		int n = 200;
		byte b = (byte) n;
		
		
		
	}

}
