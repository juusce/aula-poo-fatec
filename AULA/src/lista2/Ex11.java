package lista2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o primeiro número: ");
		 double a = sc.nextDouble();
		 System.out.print("Digite o segundo número: ");
		 double b = sc.nextDouble();
		 System.out.print("Digite a operação (+, -, *, /): ");
		 char op = sc.next().charAt(0);
		 switch (op) {
		 case '+':
		 System.out.println("Resultado: " + (a + b));
		 break;
		 case '-':
		 System.out.println("Resultado: " + (a - b));
		 break;
		 case '*':
		 System.out.println("Resultado: " + (a * b));
		 break;
		 case '/':
		 if (b != 0) {
		 System.out.println("Resultado: " + (a / b));
		 } else {
		 System.out.println("Divisão por zero não é permitida");
		 }
		 break;
		 default:
		 System.out.println("Operação inválida");
		 }
		 sc.close();
	}

}
