import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
      
        try (Scanner sc = new Scanner(System.in)){

       System.out.print("Digite um número: ");
       int numero = sc.nextInt();

       for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}
}            