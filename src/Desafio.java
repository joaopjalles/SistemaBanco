import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "João Pedro";
        String tipoDeConta = "Corrente";
        double saldo = 5000.00;
        int opcao = 0;

        System.out.println("********************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n********************");

        String menu = """
                **Digite sua opção**
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo da conta é " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo para realizar a transferência");
                } else {
                    saldo = saldo - valor;
                    System.out.println("O novo saldo é: " + saldo);
                }
            } else if (opcao == 3){
                System.out.println("O valor recebido é: ");
                double valor = leitura.nextDouble();
                saldo = saldo + valor;
                System.out.println("O novo saldo é: " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção inválida");
            }
        }
    }
}
