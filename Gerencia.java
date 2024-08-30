import java.util.Scanner;

public class Gerencia extends LojaDeConveniencia {

	Scanner sc = new Scanner(System.in);

	public void pagarFuncionario() {
		boolean telagerencia = true;
		while (telagerencia) {

			System.out.println("-----------------------");
			System.out.println("\tFUNCIONÁRIOS");
			System.out.println("1: Eduardo \n2: Carlos \n3: Fabio \n4: Renata \n5: Voltar");
			System.out.print("QUAL FUNCIONÁRIO VOCÊ QUER PAGAR: ");
			int option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println("Quanto Você Quer Pagar Para o Eduardo?");
					setPagar(sc.nextDouble());
					System.out.println("VOCÊ PAGOU R$" + getPagar() + " PARA EDUARDO.");
					break;
				case 2:
					System.out.println("Quanto Você Quer Pagar Para o Carlos?");
					setPagar(sc.nextDouble());
					System.out.println("VOCÊ PAGOU R$" + getPagar() + " PARA CARLOS.");
					break;
				case 3:
					System.out.println("Quanto Você Quer Pagar Para o Fabio?");
					setPagar(sc.nextDouble());
					System.out.println("VOCÊ PAGOU R$" + getPagar() + " PARA FABIO.");
					break;
				case 4:
					System.out.println("Quanto Você Quer Pagar Para a Renata?");
					setPagar(sc.nextDouble());
					System.out.println("VOCÊ PAGOU R$" + getPagar() + " PARA RENATA.");
					break;
				case 5:
					telagerencia = false;
					break;
				default:
					System.out.println("FUNCIONÁRIO NÃO ENCONTRADO");
					break;
			}
		}
	}

	public void darFolga() {
		boolean telafolga = true;

		while (telafolga) {
			System.out.println("\tFUNCIONÁRIOS");
			System.out.println("1: Eduardo \n2: Carlos \n3: Fabio \n4: Renata \n5: Voltar");
			System.out.print("QUAL FUNCIONÁRIO VOCÊ QUER DAR FOLGA: ");
			int option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println("Quantos Dias De Folga Deseja Dar Para Eduardo?");
					setFolga(sc.nextInt());

					if (getFolga() > 3) {
						System.out.println("FAVOR DAR FOLGAS NO MÁXIMO DE 3 DIAS!");
					} else {
						System.out.println("VOCÊ DEU " + getFolga() + " DIAS DE FOLGA PARA EDUARDO.");
					}
					break;

				case 2:
					System.out.println("Quantos Dias De Folga Deseja Dar Para Carlos?");
					setFolga(sc.nextInt());
					System.out.println("VOCÊ DEU " + getFolga() + " DIAS DE FOLGA PARA CARLOS.");
					break;

				case 3:
					System.out.println("Quantos Dias De Folga Deseja Dar Para Fabio?");
					setFolga(sc.nextInt());
					System.out.println("VOCÊ DEU " + getFolga() + " DIAS DE FOLGA PARA FABIO.");
					break;

				case 4:
					System.out.println("Quantos Dias De Folga Deseja Dar Para Renata?");
					setFolga(sc.nextInt());
					System.out.println("VOCÊ DEU " + getFolga() + " DIAS DE FOLGA PARA RENATA.");
					break;

				case 5:
					telafolga = false;
					break;
				default:
					System.out.println("FUNCIONÁRIO NÃO ENCONTRADO");
					break;
			}
		}
	}
}
