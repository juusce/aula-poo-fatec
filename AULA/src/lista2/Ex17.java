package lista2;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 String usuarioCorreto = "novo";
		 String senhaCorreta = "0407";
		 boolean acessoPermitido = false;
		 for (int tentativa = 1; tentativa <= 3; tentativa++) {
		 System.out.print("Usuário: ");
		 String usuario = sc.nextLine();
		 System.out.print("Senha: ");
		 String senha = sc.nextLine();
				 if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
					 acessoPermitido = true;
					 System.out.println("Acesso permitido");
					 break;
					 } else {
					 System.out.println("Dados incorretos");
					 }
					 }
					 if (!acessoPermitido) {
					 System.out.println("Conta bloqueada");
					 }
					 sc.close();
	}

}
