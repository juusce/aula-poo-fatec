import java.util.Scanner;

public class SistemaBancario {

    // Scanner único compartilhado entre os métodos
    private static final Scanner scanner = new Scanner(System.in);
    
    // Dados de autenticação fixados para simulação de login
    private static final String USUARIO_CORRETO = "admin";
    private static final String SENHA_CORRETA = "1234";
    
    // Variável de controle do saldo da conta
    private static double saldo = 0.0;

    public static void main(String[] args) {
        try (scanner) {
            System.out.println("=========================================");
            System.out.println("🏦 BEM-VINDO AO SISTEMA BANCÁRIO DIGITAL 🏦");
            System.out.println("=========================================");
            
            // Executa o módulo de Login. Se falhar, encerra o programa imediatamente.
            if (!realizarLogin()) {
                try (scanner) {
                    System.out.println("\n❌ Sistema bloqueado devido a múltiplas tentativas falhas.");
                }
                return;
            }
            
            boolean executarSistema = true;
            
            // Loop principal do Menu do Sistema
            while (executarSistema) {
                exibirMenu();
                int opcao = lerInteiroValido();
                
                switch (opcao) {
                    case 1 -> verSaldo();
                    case 2 -> realizarDeposito();
                    case 3 -> realizarSaque();
                    case 4 -> {
                        System.out.println("\n✨ Encerrando a sessão. Obrigado por utilizar nossos serviços!");
                        executarSistema = false;
                    }
                    default -> System.out.println("❌ Opção inválida! Escolha um número de 1 a 4.");
                }
            }
        }
    }

    /**
     * Realiza a validação de login com limite máximo de 3 tentativas.
     */
    private static boolean realizarLogin() {
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.println("\n--- ÁREA DE ACESSO ---");
            System.out.print("Usuário: ");
            String usuarioInput = scanner.next();
            System.out.print("Senha: ");
            String senhaInput = scanner.next();

            if (usuarioInput.equals(USUARIO_CORRETO) && senhaInput.equals(SENHA_CORRETA)) {
                System.out.println("\n🔓 Login efetuado com sucesso!");
                return true;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("❌ Usuário ou senha incorretos! Você tem mais " + tentativasRestantes + " tentativa(s).");
                }
            }
        }
        return false;
    }

    /**
     * Exibe a interface textual do menu.
     */
    private static void exibirMenu() {
        System.out.println("\n=========================================");
        System.out.println("               MENU PRINCIPAL            ");
        System.out.println("=========================================");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sacar");
        System.out.println("4 - Sair do Sistema");
        System.out.print("Escolha a operação desejada: ");
    }

    /**
     * Exibe o saldo atual de forma formatada.
     */
    private static void verSaldo() {
        System.out.println("\n--- SALDO EM CONTA ---");
        System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
    }

    /**
     * Adiciona valores positivos ao saldo atual.
     */
    private static void realizarDeposito() {
        System.out.println("\n--- OPERAÇÃO DE DEPÓSITO ---");
        System.out.print("Digite o valor que deseja depositar: R$ ");
        double valorDeposito = lerDoubleValido();

        if (valorDeposito > 0) {
            saldo += valorDeposito;
            System.out.printf("✅ Depósito de R$ %.2f realizado com sucesso!\n", valorDeposito);
        } else {
            System.out.println("❌ Erro: O valor do depósito precisa ser maior que zero.");
        }
    }

    /**
     * Retira valores do saldo caso haja fundos suficientes.
     */
    private static void realizarSaque() {
        System.out.println("\n--- OPERAÇÃO DE SAQUE ---");
        System.out.print("Digite o valor que deseja sacar: R$ ");
        double valorSaque = lerDoubleValido();

        if (valorSaque <= 0) {
            System.out.println("❌ Erro: O valor do saque precisa ser maior que zero.");
        } else if (valorSaque > saldo) {
            System.out.println("❌ Erro: Saldo insuficiente! Operação cancelada.");
            System.out.printf("Seu saldo disponível é de apenas: R$ %.2f\n", saldo);
        } else {
            saldo -= valorSaque;
            System.out.printf("💸 Saque de R$ %.2f realizado com sucesso!\n", valorSaque);
        }
    }

    /**
     * Helper: Lê números inteiros protegendo contra erros de digitação de letras.
     */
    private static int lerInteiroValido() {
        while (!scanner.hasNextInt()) {
            System.out.println("❌ Entrada inválida! Digite apenas números inteiros.");
            System.out.print("Escolha a opção novamente: ");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    /**
     * Helper: Lê números decimais (double) protegendo contra erros de digitação.
     */
    private static double lerDoubleValido() {
        while (!scanner.hasNextDouble()) {
            System.out.println("❌ Entrada inválida! Use números válidos (ex: 150,50 ou 200).");
            System.out.print("Digite o valor novamente: R$ ");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }
}