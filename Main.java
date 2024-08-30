import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LojaDeConveniencia loja = new LojaDeConveniencia();
        Clientes cliente = new Clientes();
        Funcionarios func = new Funcionarios();
        Gerencia ger = new Gerencia();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n============================");
            System.out.println("\tLOJA DE CONVENIÊNCIA");
            System.out.println("============================");
            System.out.println("1: Comprar Produto");
            System.out.println("2: Pedir Devolução");
            System.out.println("3: Verificar Saldo");
            System.out.println("4: Verificar Estoque");
            System.out.println("5: Fazer Depósito");
            System.out.println("6: Pagar Funcionário");
            System.out.println("7: Dar Folga");
            System.out.println("8: Listar Funcionários");
            System.out.println("9: Sair");
            System.out.print("Escolha uma opção: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    cliente.comprarProduto();
                    break;
                case 2:
                    cliente.pedirDevolucao();
                    break;
                case 3:
                    loja.consultarSaldo();
                    break;
                case 4:
                    loja.consultarEstoque();
                    break;
                case 5:
                    loja.fazerDeposito();
                    break;
                case 6:
                    ger.pagarFuncionario();
                    break;
                case 7:
                    ger.darFolga();
                    break;
                case 8:
                    func.listarFuncionarios();
                    break;
                case 9:
                    System.out.println("Saindo do sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
