package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el radio del circulo: ");
		double radio = entrada.nextDouble();
		
		double area = Math.PI * Math.pow(radio, 2);
		System.out.print("El area del circulo es: " + area);
		
		entrada.close();
		

	}

}
