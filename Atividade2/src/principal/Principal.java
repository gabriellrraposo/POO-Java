package principal;

import fabrica.Pessoa;
import fabrica.Cliente;
import fabrica.Funcionario;
import fabrica.Fidelidade;
import fabrica.Simples;
import fabrica.Vendedor;
import fabrica.Administrativo;
import fabrica.Terceirizado;
import fabrica.VendedorParceiro;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;


public class Principal {
	public static void main(String[] args) {
		boolean verificador = true;
		String[] menu_principal = {"Menu Pessoa", "Menu Cliente", "Menu Funcionario", "Sair"};
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		List<Fidelidade> fidelidadeList = new ArrayList<Fidelidade>();
		List<Simples> simplesList = new ArrayList<Simples>();
		List<Vendedor> vendedores = new ArrayList<Vendedor>();
		List<Administrativo> administrativoList = new ArrayList<Administrativo>();
		List<Terceirizado> terceirizados = new ArrayList<Terceirizado>();
		List<VendedorParceiro> vendedoresParceiros = new ArrayList<VendedorParceiro>();
		
		while (verificador) {
			int opcao = JOptionPane.showOptionDialog(null, "Selecione uma das opções", null, 0, 3, null, menu_principal, menu_principal[0]);
			
			switch (opcao) {
				case 0:
				{
					String nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
					int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf da pessoa: "));
					int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o rg da pessoa: "));
					
					Pessoa pessoa = new Pessoa(nome, cpf, rg);
					pessoas.add(pessoa);
					JOptionPane.showMessageDialog(null, pessoa.toString());
					break;
				}
				case 1:
				{
					String[] opcoesCliente = {"Simples", "Fidelidade"};
					int opcaoCliente = JOptionPane.showOptionDialog(null, "Selecione o tipo de cliente", null, 0, 1, null, opcoesCliente, opcoesCliente[0]);
					
					String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
					int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do cliente: "));
					int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o rg do cliente: "));
					int registro = Integer.parseInt(JOptionPane.showInputDialog("Digite o registro do cliente: "));
					String data = JOptionPane.showInputDialog("Digite a data do cadastro do cliente: ");
					
					Pessoa pessoa = new Pessoa(nome, cpf, rg);
					pessoas.add(pessoa);
					Cliente cliente = new Cliente(nome, cpf, rg, registro, data);
					clientes.add(cliente);
					cliente.formasPagamento();
					
					switch(opcaoCliente) {
						case 0: {
							Simples simples = new Simples(nome, cpf, rg, registro, data);
							simplesList.add(simples);
							JOptionPane.showMessageDialog(null, simples.toString());
							simples.formasPagamento();
							break;
						}
						case 1: {
							Fidelidade fidelidade = new Fidelidade(nome, cpf, rg, registro, data, 0);
							fidelidadeList.add(fidelidade);
							JOptionPane.showMessageDialog(null, fidelidade.toString());
							fidelidade.formasPagamento();
							break;
						}
						default: {
							break;
						}
					}
					break;
				}
				case 2:
				{
					String[] opcoesFuncionario = {"Vendedor", "Administrativo", "Terceirizado"};
					int opcaoFuncionario = JOptionPane.showOptionDialog(null, "Selecione o tipo de funcionário", null, 0, 2, null, opcoesFuncionario, opcoesFuncionario[0]);
					
					String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
					int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do funcionário: "));
					int rg = Integer.parseInt(JOptionPane.showInputDialog("Digite o rg do funcionário: "));
					int registro = Integer.parseInt(JOptionPane.showInputDialog("Digite o registro do funcionário: "));
					
					Pessoa pessoa = new Pessoa(nome, cpf, rg);
					pessoas.add(pessoa);
					Funcionario funcionario = new Funcionario(nome, cpf, rg, registro);
					funcionarios.add(funcionario);
					
					switch(opcaoFuncionario) {
						case 0: {
							int tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo do vendedor: "));
							int totalVendas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de vendas do funcionário: "));
							
							Vendedor vendedor = new Vendedor(nome, cpf, rg, registro, tipo, totalVendas);
							vendedores.add(vendedor);
							
							int opcaoParceiro = JOptionPane.showConfirmDialog(null, "É um vendedor parceiro?");
							if (opcaoParceiro == 0) {
								String parceiro = JOptionPane.showInputDialog("Digite o nome do parceiro: ");
								
								VendedorParceiro vendedorParceiro = new VendedorParceiro(nome, cpf, rg, registro, tipo, totalVendas, parceiro);
								vendedoresParceiros.add(vendedorParceiro);
								vendedorParceiro.calculaComissao();
								
								JOptionPane.showMessageDialog(null, vendedorParceiro.toString());
							} else {
								vendedor.calculaComissao();
								JOptionPane.showMessageDialog(null, vendedor.toString());
							}
							
							break;
						}
						case 1: {
							String setor = JOptionPane.showInputDialog("Digite o setor funcionário: ");
							
							Administrativo administrativo = new Administrativo(nome, cpf, rg, registro, setor);
							administrativoList.add(administrativo);
							JOptionPane.showMessageDialog(null, administrativo.toString());
							break;
						}
						case 2: {
							String empresa = JOptionPane.showInputDialog("Digite a empresa do funcionário: ");
							
							Terceirizado terceirizado = new Terceirizado(nome, cpf, rg, registro, empresa);
							terceirizados.add(terceirizado);
							JOptionPane.showMessageDialog(null, terceirizado.toString());
							break;
						}
						default: {
							JOptionPane.showMessageDialog(null, funcionario.toString());
						}
					}
					
					break;
				}
				case 3:
				{
					System.out.println("Pessoas Cadastradas: ");
					pessoas.forEach(p -> System.out.println(p.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Clientes Cadastradas: ");
					clientes.forEach(c -> System.out.println(c.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Clientes simples Cadastrados: ");
					simplesList.forEach(s -> System.out.println(s.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Clientes fidelidade Cadastrados: ");
					fidelidadeList.forEach(f -> System.out.println(f.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Funcionários Cadastrados: ");
					funcionarios.forEach(f -> System.out.println(f.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Vendedores Cadastrados: ");
					vendedores.forEach(v -> System.out.println(v.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Vendedores parceiros Cadastrados: ");
					vendedoresParceiros.forEach(vp -> System.out.println(vp.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Funcionários administrativos Cadastrados: ");
					administrativoList.forEach(fa -> System.out.println(fa.toString() + "\n"));
					System.out.println("---------------------");
					
					System.out.println("Funcionários terceirizados Cadastrados: ");
					terceirizados.forEach(ft -> System.out.println(ft.toString() + "\n"));
					System.out.println("---------------------");
					
					verificador = false;
					break;
				}
				default:
				{
					break;
				}

			}
	
		}
	}
}
