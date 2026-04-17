package lista2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite um ano: ");
		 int ano = sc.nextInt();
		 if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
		 System.out.println("Ano bissexto");
		 } else {
		 System.out.println("Ano não bissexto");
		 }
		 sc.close();
	}

}
