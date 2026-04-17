package lista2;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um número inteiro: ");
		 int numero = sc.nextInt();
		 if (numero > 0) {
		 System.out.println("Positivo");
		 } else if (numero < 0) {
			 System.out.println("Negativo");
		 } else {
		 System.out.println("Zero");
		 }
		 sc.close();
	}
 }

