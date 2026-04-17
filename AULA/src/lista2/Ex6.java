package lista2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um número: ");
		 int numero = sc.nextInt();
		 if (numero >= 10 && numero <= 50) {
		 System.out.println("Está entre 10 e 50");
		 } else {
		 System.out.println("Está fora do intervalo");
		 }
		 sc.close();
	}

}
