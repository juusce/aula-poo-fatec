package lista2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o valor da compra: ");
		 double valor = sc.nextDouble();
		 double valorFinal;
		 if (valor >= 550) {
		 valorFinal = valor * 0.75;
		 } else {
		 valorFinal = valor;
		 }
		 System.out.println("Valor final: R$ " + valorFinal);
		 sc.close();

	}

}
