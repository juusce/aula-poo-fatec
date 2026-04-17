package lista2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o primeiro lado: ");
		 int a = sc.nextInt();
		 System.out.print("Digite o segundo lado: ");
		 int b = sc.nextInt();
		 System.out.print("Digite o terceiro lado: ");
		 int c = sc.nextInt();
		 if (a == b && b == c) {
		 System.out.println("Triângulo Equilátero");
		 } else if (a == b || a == c || b == c) {
		 System.out.println("Triângulo Isósceles");
		 } else {
		 System.out.println("Triângulo Escaleno");
		 }
		 sc.close();

	}

}
