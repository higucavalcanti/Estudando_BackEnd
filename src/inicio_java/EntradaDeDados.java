package inicio_java;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
	
	//Locale serve para por ponto no lugar da virgula em numeros decimais
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
		String x;
		int y;
		double z;
		char h;
		
		
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		h = sc.next().charAt(0);
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	
		sc.close();
}
}