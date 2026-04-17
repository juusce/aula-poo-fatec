package lista2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um número inteiro: ");
		 int numero = sc.nextInt();
		 if (numero % 2 == 0) {
		 System.out.println("Par");
		 } else {
		 System.out.println("Ímpar");
		 }
		 sc.close();

	}

}
