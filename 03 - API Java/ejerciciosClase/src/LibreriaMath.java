import java.util.Random;

public class LibreriaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Calcular la ra�z cuadrada: Math.sqrt(numero);
		int numero = 9;
		double raiz = Math.sqrt(numero);
		//Calcular potencias: Math.pow(base,exponente)
		int potencia = (int) Math.pow(numero, 2);
		double potencia2 = Math.pow(2.5, 3);
		
		//Redondeo de valores:
		float f1 = 4.5f;
		int f1Menor = (int) Math.floor(f1);
		System.out.println("f1Menor = " + f1Menor);
		int f1Mayor = (int)Math.ceil(f1);
		System.out.println("f1Mayor = " + f1Mayor);
		int f1Cercano = Math.round(f1Mayor);
		System.out.println("f1Cercano = " + f1Cercano);
		
		//M�ximo o m�nimo de dos valores
		int x1 = 9,x2 = 10;
		int menor = Math.min(x1,x2);
		float x3 = 4.5f;
		float menor2 = Math.min(x1, x3);
		
		//Generar n�mero aleatorio
		int aleatorio = (int)(Math.random()*10);
		
		System.out.println(aleatorio);
		
		Random rnd = new Random();
		int aleatorio1 = rnd.nextInt(20);
	}

}
