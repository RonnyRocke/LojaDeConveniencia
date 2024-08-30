public class Funcionarios extends LojaDeConveniencia {

	LojaDeConveniencia funcionario1 = new LojaDeConveniencia("EDUARDO", "LIMPADOR", 587442);
	LojaDeConveniencia funcionario2 = new LojaDeConveniencia("CARLOS", "SEGURANÇA", 2547893);
	LojaDeConveniencia funcionario3 = new LojaDeConveniencia("FABIO", "BALCONISTA", 1779330);
	LojaDeConveniencia funcionario4 = new LojaDeConveniencia("RENATA", "GERENTE", 254893323);

	public void listarFuncionarios() {
		System.out.println("----------------------");
		System.out.println("\n\tFUNCIONÁRIOS\n");
		System.out.println("NOME FUNCIONÁRIO: " + funcionario1.getName());
		System.out.println("FUNÇÃO: " + funcionario1.getFuncao());
		System.out.println("CPF: " + funcionario1.getCpf());
		System.out.println("\n");

		System.out.println("NOME FUNCIONÁRIO: " + funcionario2.getName());
		System.out.println("FUNÇÃO: " + funcionario2.getFuncao());
		System.out.println("CPF: " + funcionario2.getCpf());

		System.out.println("\n");

		System.out.println("NOME FUNCIONÁRIO: " + funcionario3.getName());
		System.out.println("FUNÇÃO: " + funcionario3.getFuncao());
		System.out.println("CPF: " + funcionario3.getCpf());

		System.out.println("\n");

		System.out.println("NOME FUNCIONÁRIO: " + funcionario4.getName());
		System.out.println("FUNÇÃO: " + funcionario4.getFuncao());
		System.out.println("CPF: " + funcionario4.getCpf());

		System.out.println("----------------------");
	}
}
