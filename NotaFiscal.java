public class NotaFiscal extends LojaDeConveniencia {

    public void exibirNotaFiscal() {

        boolean notinha = true;
        while (notinha) {
            System.out.println("-----------------------");
            System.out.println("\nCOMPRA RECENTE");
            System.out.println("ITEM: " + this.getComprando());

        }
    }
}
