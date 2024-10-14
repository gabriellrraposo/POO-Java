package principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import fabrica.*;

public class Main {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        List<Fita> fitas = new ArrayList<Fita>();
        List<Locacao> locacoes = new ArrayList<Locacao>();
		
        Cliente cliente1 = new Cliente(1, "2024-01-15", 3);
        Cliente cliente2 = new Cliente(2, "2024-02-20", 7);
        Cliente cliente3 = new Cliente(3, "2024-03-10", 2);
        Cliente cliente4 = new Cliente(4, "2024-04-25", 5);
        Cliente cliente5 = new Cliente(5, "2024-05-30", 6);
        
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        
        Funcionario funcionario1 = new Funcionario(101, 2500.00, 15);
        Funcionario funcionario2 = new Funcionario(102, 2700.00, 12);
        Funcionario funcionario3 = new Funcionario(103, 2900.00, 20);
        Funcionario funcionario4 = new Funcionario(104, 3100.00, 25);
        Funcionario funcionario5 = new Funcionario(105, 3300.00, 18);
        
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);
        funcionarios.add(funcionario5);
        
        Fita fita1 = new Fita(1001, "O Senhor dos Anéis", "Fantasia", 180);
        Fita fita2 = new Fita(1002, "Matrix", "Ficção Científica", 136);
        Fita fita3 = new Fita(1003, "O Poderoso Chefão", "Drama", 175);
        Fita fita4 = new Fita(1004, "A Origem", "Ação", 148);
        Fita fita5 = new Fita(1005, "Interstellar", "Ficção Científica", 169);
        
        fitas.add(fita1);
        fitas.add(fita2);
        fitas.add(fita3);
        fitas.add(fita4);
        fitas.add(fita5);
        
        Locacao locacao1 = new Locacao(5001, cliente1, fita1, funcionario1, "2024-06-01", "2024-06-15", 15.50);
        Locacao locacao2 = new Locacao(5002, cliente2, fita2, funcionario2, "2024-06-05", "2024-06-20", 12.00);
        Locacao locacao3 = new Locacao(5003, cliente3, fita3, funcionario3, "2024-06-10", "2024-06-25", 20.75);
        Locacao locacao4 = new Locacao(5004, cliente4, fita4, funcionario4, "2024-06-15", "2024-06-30", 18.25);
        Locacao locacao5 = new Locacao(5005, cliente5, fita5, funcionario5, "2024-06-20", "2024-07-05", 22.00);
        
        locacoes.add(locacao1);
        locacoes.add(locacao2);
        locacoes.add(locacao3);
        locacoes.add(locacao4);
        locacoes.add(locacao5);        
        
        String[] menu_inicial = { "Clientes", "Fitas", "Funcionários", "Locações", "Estatísticas e ferramentas", "Sair"};
        
        boolean verificador = true;
        while (verificador) {
        	int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção", null, 0, 3, null, menu_inicial, menu_inicial);
        	
        	switch(opcao) {
	        	case 0: {
	        		String[] menu_clientes = { "Cadastrar clientes", "Listar clientes", "Voltar"};
	        		int opcao_clientes = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", null, 0, 3, null, menu_clientes, menu_clientes);
	        		
	        		switch(opcao_clientes) {
		        		case 0: {
		        			String registro = JOptionPane.showInputDialog("Digite o registro do cliente: ");
		        			String dataCadastro = JOptionPane.showInputDialog("Digite a data do cadastro do cliente: ");
		        			
		        			clientes.add(new Cliente(Integer.parseInt(registro), dataCadastro, 0));
		        			break;
		        		}
		        		case 1: {
		        			clientes.forEach(cliente -> System.out.println(cliente.toString()));
			        		break;
		        		}
		        		case 2: {
		        			break;
		        		}
		        		default: {
		        			break;
		        		}
	        		}
	        		break;
	        	}
	        	case 1: {
	        		String[] menu_fitas = { "Cadastrar fitas", "Listar fitas", "Voltar"};
	        		int opcao_fitas = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", null, 0, 3, null, menu_fitas, menu_fitas);
	        		
	        		switch(opcao_fitas) {
		        		case 0: {
		        			String id = JOptionPane.showInputDialog("Digite o id da fita: ");
		        			String nome = JOptionPane.showInputDialog("Digite o nome da fita: ");
		        			String genero = JOptionPane.showInputDialog("Digite o gênero da fita: ");
		        			String duracao = JOptionPane.showInputDialog("Digite a duração da fita: ");
		        			
		        			fitas.add(new Fita(Integer.parseInt(id), nome, genero, Integer.parseInt(duracao)));
		        			break;
		        		}
		        		case 1: {
		        			fitas.forEach(fita -> System.out.println(fita.toString()));
			        		break;
		        		}
		        		case 2: {
		        			break;
		        		}
		        		default: {
		        			break;
		        		}
	        		}
	        		break;
	        	}
	        	case 2: {
	        		String[] menu_funcionarios = { "Cadastrar funcionarios", "Listar funcionarios", "Voltar"};
	        		int opcao_funcionarios = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", null, 0, 3, null, menu_funcionarios, menu_funcionarios);
	        		
	        		switch(opcao_funcionarios) {
		        		case 0: {
		        			String registro = JOptionPane.showInputDialog("Digite o registro do funcionário: ");
		        			funcionarios.add(new Funcionario(Integer.parseInt(registro), 0, 0));
		        			break;
		        		}
		        		case 1: {
		        			funcionarios.forEach(funcionario -> System.out.println(funcionario.toString()));
			        		break;
		        		}
		        		case 2: {
		        			break;
		        		}
		        		default: {
		        			break;
		        		}
	        		}
	        		break;
	        	}
	        	case 3: {
	        		String[] menu_locacoes = { "Cadastrar locações", "Listar locações", "Voltar"};
	        		int opcao_locacoes = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", null, 0, 3, null, menu_locacoes, menu_locacoes);
	        		
	        		switch(opcao_locacoes) {
		        		case 0: {
		        			String id = JOptionPane.showInputDialog("Digite o id da locação: ");
		        			String dataLocacao = JOptionPane.showInputDialog("Digite a data da locação: ");
		        			String dataEntrega = JOptionPane.showInputDialog("Digite a data de entrega da locação: ");
		        			String valor = JOptionPane.showInputDialog("Digite o valor da locação: ");
		        			
		        			locacoes.add(new Locacao(Integer.parseInt(id), cliente1, fita1, funcionario1, dataLocacao, dataEntrega, Integer.parseInt(valor)));
		        			break;
		        		}
		        		case 1: {
		        			locacoes.forEach(locacao -> System.out.println(locacao.toString()));
			        		break;
		        		}
		        		case 2: {
		        			break;
		        		}
		        		default: {
		        			break;
		        		}
	        		}
	        		break;
	        	}
	        	case 4: {
	        		String[] menu_estatisticas_ferramentas = {"Total de locações", "Ranking de locações por cliente", "Faturamento", "Quantidades", "Funcionário destaque", "Cálculo de salário", "Pesquisar"};
	        		int opcao_estatisticas_ferramentas = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", null, 0, 3, null, menu_estatisticas_ferramentas, menu_estatisticas_ferramentas);
	        		
	        		switch(opcao_estatisticas_ferramentas) {
		        		case 0: {
		        			JOptionPane.showMessageDialog(null, "Total de locações: " + locacoes.size());
		        			break;
		        		}
		        		case 1: {
		        			break;
		        		}
		        		case 2: {
		        			double faturamento = 0;
		        			for (Locacao locacao : locacoes) {
		        				faturamento += locacao.getValor();
		        			}
		        			JOptionPane.showMessageDialog(null, "Faturamento: " + faturamento);
		        			break;
		        		}
		        		case 3: {
		        			JOptionPane.showMessageDialog(null, "Total de fitas: " + fitas.size() + "\n" +
		        												"Total de clientes: " + clientes.size() + "\n" +
		        												"Total de funcionários: " + funcionarios.size()
		        			
		        			);
		        			break;
		        		}
		        		case 4: {
		        			
		        			break;
		        		}
		        		case 5: {
		        			for (Funcionario funcionario : funcionarios) {
		        				JOptionPane.showMessageDialog(null, funcionario.getRegistroFuncionario() + ": " + funcionario.calculaSalarioFuncionario());
		        			}
		        			break;
		        		}
		        		case 6: {
		        			String[] menu_pesquisa = {"Cliente", "Funcionário", "Fita"};
			        		int opcao_pesquisa = JOptionPane.showOptionDialog(null, "O que deseja pesquisar?", null, 0, 3, null, menu_pesquisa, menu_pesquisa);
			        		
			        		String identificador = JOptionPane.showInputDialog("Digite o identificador: ");
			        		switch(opcao_pesquisa) {
				        		case 0: {
				        			for (Cliente cliente : clientes) {
				        				if (cliente.getRegistroCliente() == Integer.parseInt(identificador)) {
				        					JOptionPane.showMessageDialog(null, cliente.toString());
				        					break;
				        				}
				        			}
				        			break;
				        		}
				        		case 1: {
				        			for (Funcionario funcionario : funcionarios) {
				        				if (funcionario.getRegistroFuncionario() == Integer.parseInt(identificador)) {
				        					JOptionPane.showMessageDialog(null, funcionario.toString());
				        					break;
				        				}
				        			}
				        			break;
				        		}
				        		case 2: {
				        			for (Fita fita : fitas) {
				        				if (fita.getId() == Integer.parseInt(identificador)) {
				        					JOptionPane.showMessageDialog(null, fita.toString());
				        					break;
				        				}
				        			}
				        			break;
				        		}
			        		}
		        		}
	        		}
	        		
	        		break;
	        	}
	        	case 5: {
	        		verificador = false;
	        		break;
	        	}
	        	default: {
	        		verificador = false;
	        		break;
	        	}
        	}

        }
	}
}
