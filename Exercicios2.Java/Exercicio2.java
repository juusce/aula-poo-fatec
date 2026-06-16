import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {

try (Scanner sc = new Scanner(System.in)){
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
}
