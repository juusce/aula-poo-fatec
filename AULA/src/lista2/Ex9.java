package lista2;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 System.out.print("Digite o usuário: ");
		 String usuario = sc.nextLine();
		 System.out.print("Digite a senha: ");
		 String senha = sc.nextLine();
		 if (usuario.equals("novo") && senha.equals("3709")) {
		 System.out.println("Acesso permitido");
		 } else {
		 System.out.println("Acesso negado");
		 }
		 sc.close();
	}
}
	
