import java.util.Scanner;

public class Clientes extends LojaDeConveniencia {

    Scanner sc = new Scanner(System.in);

    public void comprarProduto() {
        boolean efetuandocompra = true;
        while (efetuandocompra) {

            System.out.print("DIGITE O QUE QUER COMPRAR: ");
            setComprando(sc.next());
            String produtoComprado = getComprando().toLowerCase();

            switch (produtoComprado) {
                case "banana":
                    System.out.println("VOCÊ COMPROU " + produtoComprado);
                    break;
                case "uva":
                    System.out.println("VOCÊ COMPROU " + produtoComprado);
                    break;
                case "pessego":
                    System.out.println("VOCÊ COMPROU " + produtoComprado);
                    break;
                case "morango":
                    System.out.println("VOCÊ COMPROU " + produtoComprado);
                    break;
                default:
                    System.out.println("PRODUTO NÃO ENCONTRADO!");
                    efetuandocompra = false;
                    break;
            }
        }
    }

    public void pedirDevolucao() {
        boolean pedindodevolucao = true;
        while (pedindodevolucao) {

            System.out.print("DIGITE O QUE VOCÊ QUER PEDIR DEVOLUÇÃO: ");
            setComprando(sc.next());
            String produtoDevolvido = getComprando().toLowerCase();

            switch (produtoDevolvido) {
                case "banana":
                    System.out.println("VOCÊ PEDIU DEVOLUÇÃO DE " + produtoDevolvido);
                    break;
                case "uva":
                    System.out.println("VOCÊ PEDIU DEVOLUÇÃO DE " + produtoDevolvido);
                    break;
                case "pessego":
                    System.out.println("VOCÊ PEDIU DEVOLUÇÃO DE " + produtoDevolvido);
                    break;
                case "morango":
                    System.out.println("VOCÊ PEDIU DEVOLUÇÃO DE " + produtoDevolvido);
                    break;
                default:
                    System.out.println("PRODUTO NÃO ENCONTRADO!");
                    pedindodevolucao = false;
                    break;
            }
        }
    }
}
