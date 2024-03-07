package desafio;

import java.util.ArrayList;
import desafio.Pessoa;
import java.util.Scanner;

public class Funcio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Cria uma lista para armazenar os funcionários
		ArrayList<Pessoa> funcionarios = new ArrayList<Pessoa>();

		// Início do loop principal do programa
		do {
			// Exibe o menu de opções para o usuário
			System.out.println("_____________________________________");
			System.out.println("Escolha o menu");
			System.out.println("_____________________________________");
			Pessoa.menu();// Chama o método menu() da classe Pessoa para exibir o menu

			try { // Início do bloco try-catch para tratamento de exceções

				int escolha = sc.nextInt(); // Captura a escolha do usuário
				switch (escolha) { // Verifica a escolha do usuário e executa a opção correspondente

				case 1: { // Opção 1: Adicionar funcionário

					Pessoa funcionario = new Pessoa(); // Cria um novo objeto Pessoa para representar um funcionário

					// Solicita e atribui o nome do funcionário
					System.out.println("-------------------------");
					System.out.println("Nome do funcionário: ");
					funcionario.setNome(sc.next());

					// Solicita e atribui o salário bruto do funcionário
					System.out.println("Salário bruto do funcionário: ");
					funcionario.setSalarioBruto(sc.nextDouble());

					// Solicita e atribui o número de dependentes do funcionário
					System.out.println("Número de dependentes: ");
					funcionario.setNumeroDependentes(sc.nextInt());
					System.out.println("-------------------------");

					// Define os benefícios do funcionário (VA, VR, VT)
					Pessoa.vaVtVr(funcionario);

					// Solicita e atribui o plano de saúde do funcionário
					System.out.println("Qual o seu plano de saúde?");
					System.out.println("Digite 1 para básico");
					System.out.println("Digite 2 para Premium");
					System.out.println("Digite 3 para Platinum Premium Plus");

					int plano = sc.nextInt();
					switch (plano) {

					case 1: { // Plano básico
						// Atribui o plano de saúde como "Plano Básico"
						System.out.println("O plano do funcionário é básico");
						funcionario.setPlanoDeSaude("Plano Básico");

					}
					case 2: { // Plano Premium
						// Atribui o plano de saúde como "Plano Premium"
						System.out.println("O plano do funcionário é Premium");
						funcionario.setPlanoDeSaude("Plano Premium");

					}
					case 3: { // Plano Platinum Premium Plus
						// Atribui o plano de saúde como "Plano Platinum Premium Plus"
						System.out.println("O plano do funcionário é Platinum Premium Plus");
						funcionario.setPlanoDeSaude("Plano Platinum Premium Plus");

					}
						continue;
					}
					// Adiciona o funcionário à lista de funcionários
					funcionarios.add(funcionario);
					continue;// Volta para o início do loop
				}
				case 2: { // lista de todos os funcionários
					// Itera sobre a lista de funcionários e exibe seus nomes
					for (Pessoa funcionario : funcionarios) {

						System.out.println("-------------------------");
						System.out.println(funcionario.getNome());
						System.out.println("-------------------------");
					}
					continue;
				}
				case 3: {
					// Exibe uma mensagem indicando que os usuários estão sendo listados
					System.out.println("Listando Usuários");

					// Itera sobre a lista de funcionários e exibe seus nomes
					// Exibe o nome do funcionário
					for (Pessoa funcionario : funcionarios) {

						System.out.println("-------------------------");
						System.out.println(funcionario.getNome());
						System.out.println("-------------------------");
					}

					// Solicita o nome do funcionário a ser editado
					System.out.println("Digite o nome do funcionário que deseja editar:");
					String novoNome = sc.next();

					// Lê o nome do funcionário a ser editado
					// Itera sobre a lista de funcionários para encontrar o funcionário a ser
					// editado

					for (Pessoa funcionario : funcionarios) {
						if (funcionario.getNome().equals(novoNome)) {// Verifica se o nome do funcionário corresponde ao
																		// nome fornecido

							// Começa uma estrutura na qual está repetindo códios atribuindo novos valores
							// as variáveis
							System.out.println("Digite o nome");
							funcionario.setNome(sc.next());

							System.out.println("Digite o salário");
							funcionario.setSalarioBruto(sc.nextDouble());

							System.out.println("Digite o novo número de dependentes:");
							funcionario.setNumeroDependentes(sc.nextInt());

							System.out.println("Qual o seu plano de saúde?");
							System.out.println("Digite 1 para básico");
							System.out.println("Digite 2 para Premium");
							System.out.println("Digite 3 para Platinum Premium Plus");

							int plano = sc.nextInt();
							switch (plano) {
							case 1: {
								funcionario.setPlanoDeSaude("Plano Básico");
								break;
							}
							case 2: {
								funcionario.setPlanoDeSaude("Plano Premium");
								break;
							}
							case 3: {
								funcionario.setPlanoDeSaude("Plano Platinum Premium Plus");
								break;
							}
							}
							// Mensagem que aponta que o funcionário foi editado
							System.out.println("Informações do funcionário editadas com sucesso.");

							break;

						} else {
							// Mensagem fornecida caso o funcionário não seja encontrado
							System.out.println("Funcionário não encontrado");
						}
					}
					continue;

				}
				case 4: {
					// Itera sobre a lista de funcionários e exibe seus nomes
					// Exibe o nome do funcionário
					for (Pessoa funcionario : funcionarios) {

						System.out.println("-------------------------");
						System.out.println(funcionario.getNome());
						System.out.println("-------------------------");
					}
					System.out.println("Qual usuário você quer deletar?");// Solicita o nome do usuário a ser deletado

					String Del = sc.next();// Lê o nome do usuário a ser deletado
					for (Pessoa funcionario : funcionarios) {
						if (funcionario.getNome().equals(Del)) {// Verifica se o nome do funcionário corresponde ao nome
																// fornecido
							funcionarios.remove(funcionario);// Remove o funcionário da lista
							System.out.println("Funcionário removido com sucesso");// Exibe uma mensagem indicando que o
																					// funcionário foi removido com
																					// sucesso
							break;
						} else {
							System.out.println("Funcionário não encontrado");// Exibe uma mensgaem caso o funcionário
																				// não seja encontrado
						}
					}
				}
					continue;

				case 5: {// case para analisar os benefícios do funcionário
                         //Lista todos os funcionários
					for (Pessoa funcionario : funcionarios) {
						System.out.println("-------------------------");
						System.out.println(funcionario.getNome());
						System.out.println("-------------------------");

						// Pergunta qual funcionário deseja vizualizar os benefícios
						System.out.println("Qual funcionário você quer vizualizar os benefícios?");
						System.out.println("-------------------------");
						// Chama um método que verifica os vales do funcionário
						Pessoa.Vales(funcionario);
						// Chama um método que verifica informações relacionadas ao irrf e inss
						Pessoa.empostoDeRenda(funcionario);
						System.out.println("-------------------------");
					}
					continue;
				}

				case 6: {// case para analisar o salário líquido do funcionário
					for (Pessoa funcionario : funcionarios) {
                        //Lista os funcionários
						System.out.println("-------------------------");
						System.out.println(funcionario.getNome());
						System.out.println("-------------------------");
                        //Pergunta qual usuário deseja vizualizar o seu salário
						System.out.println("Qual Funcionário você quer vizualizar o salário?");
						// chama o método responsável por calcular o salário do funcionário
						Pessoa.calculoTotal(funcionario);

						continue;
					}
				}
				case 7: {// case para sair do sistema
					System.out.println("Você saiu do sistema");
					return;// finaliza o loop
				}
				default:// para mostrar ao usuário para selecionar uma opção válida, caso selecione uma
						// opção que não faça parte dos programas
					System.out.println("Selecione uma opcão válida");
				}

			} catch (Exception e) { // catch para tratar o erro de um elemento digitao errado, como números no lugar
									// de uma string
				System.out.println("Erro: Tente Novamente ");
				sc.nextLine();
			}

		} while (true);

	}
}
