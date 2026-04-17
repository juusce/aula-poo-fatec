import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite a idade: ");int idade = sc.nextInt();
		 if (idade >= 18) {
			 System.out.println("Maior de idade");
			 } else {
			 System.out.println("Menor de idade");
			 }
			 sc.close();
	}

}
