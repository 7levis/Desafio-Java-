import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Levi De Assis";
        String tipoDeConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*****************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("\n*****************");

        String escolha = """
                Escolha uma opção:
                1 - Consultar saldo.
                2 - Transferir valor.
                3 - Receber valor.
                4 - Sair.""";

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(escolha);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Meu Saldo é " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual valor deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                }

            } else if (opcao == 3){
                System.out.println("Digite seu valor: ");
                double valor = leitura.nextDouble();
                saldo += valor;

            } else if (opcao != 4){
                System.out.println("Opção invalida");
        }
        }
    }
}
