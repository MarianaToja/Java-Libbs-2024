package desafio;

import java.util.Scanner;

public class Pessoa {

	// Criando variáveis privadas
	private String nome;
	private double salarioBruto;
	private int numeroDependentes;
	private boolean vr;
	private boolean va;
	private boolean vt;
	private String planoDeSaude;

	// Método getter para o atributo 'nome'
	public String getNome() {
		return nome; // Retorna o valor do atributo 'nome'
	}

	// Método setter para o atributo 'nome'
	public void setNome(String nome) {
		this.nome = nome; // Define o valor do atributo 'nome' com o valor passado como parâmetro
	}

	// Método getter para o atributo 'salarioBruto'
	public double getSalarioBruto() {
		return salarioBruto; // Retorna o valor do atributo 'salarioBruto'
	}

	// Método setter para o atributo 'salarioBruto'
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto; // Define o valor do atributo 'salarioBruto' com o valor passado como
											// parâmetro
	}

	// Método getter para o atributo 'numeroDependentes'
	public int getNumeroDependentes() {
		return numeroDependentes; // Retorna o valor do atributo 'numeroDependentes'
	}

	// Método setter para o atributo 'numeroDependentes'
	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes; // Define o valor do atributo 'numeroDependentes' com o valor
													// passado como parâmetro
	}

	// Método getter para o atributo 'vr'
	public boolean getVr() {
		return vr; // Retorna o valor do atributo 'vr'
	}

	// Método setter para o atributo 'vr'
	public void setVr(boolean vr) {
		if (vr = true) { // Condição incorreta, deve ser '==' para comparação
			this.vr = vr; // Define o valor do atributo 'vr' com o valor passado como parâmetro
		}
		this.vr = vr; // Define o valor do atributo 'vr' com o valor passado como parâmetro
	}

	// Método getter para o atributo 'va'
	public boolean getVa() {
		return va; // Retorna o valor do atributo 'va'
	}

	// Método setter para o atributo 'va'
	public void setVa(boolean va) {
		this.va = va; // Define o valor do atributo 'va' com o valor passado como parâmetro
	}

	// Método getter para o atributo 'vt'
	public boolean getVt() {
		return vt; // Retorna o valor do atributo 'vt'
	}

	// Método setter para o atributo 'vt'
	public void setVt(boolean vt) {
		this.vt = vt; // Define o valor do atributo 'vt' com o valor passado como parâmetro
	}

	// Método getter para o atributo 'planoDeSaude'
	public String getPlanoDeSaude() {
		return planoDeSaude; // Retorna o valor do atributo 'planoDeSaude'
	}

	// Método setter para o atributo 'planoDeSaude'
	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude; // Define o valor do atributo 'planoDeSaude' com o valor passado como
											// parâmetro
	}

	// Método estático para calcular e exibir os benefícios (vales) de um
	// funcionário
	public static void Vales(Pessoa funcionario) {
		Scanner sc = new Scanner(System.in); // Inicializa um Scanner para entrada de dados
		String nomeComp = sc.next(); // Solicita o nome do funcionário a ser comparado

		double valeRefeicao = 0; // Inicializa a variável para o valor do vale refeição
		double valeAlimentacao = 0; // Inicializa a variável para o valor do vale alimentação
		double valeTransporte = 0; // Inicializa a variável para o valor do vale transporte

		// Verifica se o nome do funcionário informado corresponde ao nome do
		// funcionário passado como parâmetro e se o vale refeição está ativo
		if (funcionario.getNome().equals(nomeComp) && funcionario.getVr() == true) {
			valeRefeicao = funcionario.getSalarioBruto() * 0.03; // Calcula o valor do vale refeição
			System.out.println("O vale refeição do funcionário é: " + valeRefeicao); // Exibe o valor do vale refeição
		}
		// Verifica se o nome do funcionário informado corresponde ao nome do
		// funcionário passado como parâmetro e se o vale refeição não está ativo
		else if (funcionario.getNome().equals(nomeComp) && funcionario.getVr() == false) {
			System.out.println("O vale refeição do funcionário Não está ativo"); // Exibe uma mensagem indicando que o
																					// vale refeição não está ativo
		}

		// Verifica se o nome do funcionário informado corresponde ao nome do
		// funcionário passado como parâmetro e se o vale alimentação está ativo
		if (funcionario.getNome().equals(nomeComp) && funcionario.getVa() == true) {
			valeAlimentacao = funcionario.getSalarioBruto() * 0.05; // Calcula o valor do vale alimentação
			System.out.println("O vale Alimentação do funcionário é: " + valeAlimentacao); // Exibe o valor do vale
																							// alimentação
		}
		// Verifica se o nome do funcionário informado corresponde ao nome do
		// funcionário passado como parâmetro e se o vale alimentação não está ativo
		else if (funcionario.getNome().equals(nomeComp) && funcionario.getVa() == false) {
			System.out.println("O vale Alimentação do funcionário Não está ativo"); // Exibe uma mensagem indicando que
																					// o vale alimentação não está ativo
		}

		// Verifica se o nome do funcionário informado corresponde ao nome do
		// funcionário passado como parâmetro e se o vale transporte está ativo
		if (funcionario.getNome().equals(nomeComp) && funcionario.getVt() == true) {
			valeTransporte = funcionario.getSalarioBruto() * 0.06; // Calcula o valor do vale transporte
			System.out.println("O vale Transporte do funcionário é: " + valeTransporte); // Exibe o valor do vale
																							// transporte
		}
		// Verifica se o nome do funcionário informado corresponde ao nome do
		// funcionário passado como parâmetro e se o vale transporte não está ativo
		else if (funcionario.getNome().equals(nomeComp) && funcionario.getVt() == false) {
			System.out.println("O vale Transporte do funcionário Não está ativo"); // Exibe uma mensagem indicando que o
																					// vale transporte não está ativo
		}
	}

	// Método estático para calcular e exibir os descontos de INSS e IRRF do salário
	// bruto de um funcionário
	public static void empostoDeRenda(Pessoa funcionario) {
		double inss = 0; // Inicializa a variável para o valor do INSS
		inss = funcionario.getSalarioBruto() * 0.11; // Calcula o valor do INSS (11% do salário bruto)
		System.out.println("O valor do inss é " + inss); // Exibe o valor do INSS

		double irrf = 0; // Inicializa a variável para o valor do IRRF
		irrf = funcionario.getSalarioBruto() * 0.15; // Calcula o valor do IRRF (15% do salário bruto)
		System.out.println("O valor do IRRF do funcionário é: " + irrf); // Exibe o valor do IRRF
	}

	// Método estático para calcular o salário líquido de um funcionário
	public static void calculoTotal(Pessoa funcionario) {
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
		String nomeComp = sc.next(); // Lê o nome do funcionário a ser calculado
		double valeRefeicao = 0; // Inicializa a variável para o valor do vale refeição
		double valeAlimentacao = 0; // Inicializa a variável para o valor do vale alimentação
		double valeTransporte = 0; // Inicializa a variável para o valor do vale transporte
		double valorDependente = 0; // Inicializa a variável para o valor dos dependentes
		double irrf = 0; // Inicializa a variável para o valor do IRRF
		double inss = 0; // Inicializa a variável para o valor do INSS
		double planoSaude = 0; // Inicializa a variável para o valor do plano de saúde
		double salarioLiquido = 0; // Inicializa a variável para o salário líquido

		// Verifica se o funcionário tem vale refeição e calcula o valor, se aplicável
		if (funcionario.getNome().equals(nomeComp) && funcionario.getVr() == true) {
			valeRefeicao = funcionario.getSalarioBruto() * 0.03;
		}

		// Verifica se o funcionário tem vale alimentação e calcula o valor, se
		// aplicável
		if (funcionario.getNome().equals(nomeComp) && funcionario.getVa() == true) {
			valeAlimentacao = funcionario.getSalarioBruto() * 0.05;
		}

		// Verifica se o funcionário tem vale transporte e calcula o valor, se aplicável
		if (funcionario.getNome().equals(nomeComp) && funcionario.getVt() == true) {
			valeTransporte = funcionario.getSalarioBruto() * 0.06;
		}

		// Verifica o tipo de plano de saúde do funcionário e define o valor
		// correspondente
		if (funcionario.getNome().equals(nomeComp) && funcionario.getPlanoDeSaude().equals("Plano Básico")) {
			planoSaude = 100;
		}
		if (funcionario.getNome().equals(nomeComp) && funcionario.getPlanoDeSaude().equals("Plano Premium")) {
			planoSaude = 250;
		}
		if (funcionario.getNome().equals(nomeComp)
				&& funcionario.getPlanoDeSaude().equals("Plano Platinum Premium Plus")) {
			planoSaude = 500;
		}

		inss = funcionario.getSalarioBruto() * 0.11; // Calcula o valor do INSS (11% do salário bruto)
		irrf = funcionario.getSalarioBruto() * 0.15; // Calcula o valor do IRRF (15% do salário bruto)

		// Calcula o salário líquido subtraindo os descontos do salário bruto
		salarioLiquido = (funcionario.getSalarioBruto())
				- (valeRefeicao + valeAlimentacao + valeTransporte + (valorDependente * 50) + irrf + inss + planoSaude);

		System.out.println("O salário líquido do funcionário é: " + salarioLiquido); // Exibe o salário líquido
																						// calculado
	}

	// Método estático para exibir o menu de opções do sistema
	public static void menu() {
		System.out.println("_____________________________________"); // Exibe uma linha divisória
		System.out.println("1- Cadastro Do funcionário"); // Exibe a opção para cadastrar um novo funcionário
		System.out.println("2- Listando os funcionários"); // Exibe a opção para listar os funcionários cadastrados
		System.out.println("3- Atualizando funcionário"); // Exibe a opção para atualizar informações de um funcionário
		System.out.println("4- Deletando um funcionário"); // Exibe a opção para excluir um funcionário
		System.out.println("5- Vizualize os benefícios do funcionário"); // Exibe a opção para visualizar os benefícios de
																		// um funcionário
		System.out.println("6- Vizualize o salario liquido do funcionário"); // Exibe a opção para visualizar o salário
																			// líquido de um funcionário
		System.out.println("7- Sai do sistema"); // Exibe a opção para sair do sistema
		System.out.println("_____________________________________"); // Exibe uma linha divisória
	}

	// Método estático para definir se os benefícios (VA, VR, VT) estão ativos ou
	// desativados para um funcionário
	public static void vaVtVr(Pessoa funcionario) {
		Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados
		// Solicita ao usuário que informe se o VA está ativo ou desativado
		System.out.println("Digite 1 se o Va está ativo e 2 se o Va está desativado ");
		int ativo1 = sc.nextInt(); // Lê a entrada do usuário
		// Define o status do VA com base na entrada do usuário
		if (ativo1 == 1) {
			funcionario.setVa(true); // Define o VA como ativo
		} else {
			funcionario.setVa(false); // Define o VA como desativado
		}

		// Solicita ao usuário que informe se o VR está ativo ou desativado
		System.out.println("Digite 1 se o Vr está ativo e 2 se o Vr está desativado ");
		int ativo2 = sc.nextInt(); // Lê a entrada do usuário
		// Define o status do VR com base na entrada do usuário
		if (ativo2 == 1) {
			funcionario.setVr(true); // Define o VR como ativo
		} else {
			funcionario.setVr(false); // Define o VR como desativado
		}

		// Solicita ao usuário que informe se o VT está ativo ou desativado
		System.out.println("Digite 1 se o Vt está ativo e 2 se o Vt está desativado ");
		int ativo3 = sc.nextInt(); // Lê a entrada do usuário
		// Define o status do VT com base na entrada do usuário
		if (ativo3 == 1) {
			funcionario.setVt(true); // Define o VT como ativo
		} else {
			funcionario.setVt(false); // Define o VT como desativado
		}
	}

}