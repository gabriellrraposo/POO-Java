package br.com.sis.controllers;

import javax.swing.JOptionPane;

import br.com.sis.models.Professor;
import br.com.sis.services.AlunoServiceImpl;
import br.com.sis.services.ProfessorServiceImpl;

public class ControllerProfessor {
	private boolean controleLoop = true;

	public ControllerProfessor() {}
	String[] menu = { "Cadastrar", "Remover", "Listar", "Pesquisar", "Voltar" };
	public void menu(ProfessorServiceImpl ps) {
		while (controleLoop) {
			int opcao = JOptionPane.showOptionDialog(null, ":: Menu Professor ::\n"
					+ "Professores: " + ps.getTotalItens() + "\n"
					+ "Escolha uma opção:", null, 1, 1, null, menu, menu);
			
			switch (opcao) {
			case 0: {
				String nome = JOptionPane.showInputDialog("Digite o nome do professor:");
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do professor:"));
				double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do professor:"));
				
				if (ps.getProfessor(cpf) != null) {
					JOptionPane.showMessageDialog(null, "O CPF digitado já foi cadastrado!");
				} else if (salario <= 0) {
					JOptionPane.showMessageDialog(null, "O salário deve ser maior que 0!");
				}
				else {
					ps.add(new Professor(0, cpf, nome, salario));
				}
				break;
			}
			case 1: {
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do professor:"));
				if (ps.getProfessor(cpf) == null) {
					JOptionPane.showMessageDialog(null, "O CPF digitado não está cadastrado!");
				} else {
					String nome = ps.getProfessor(cpf).getNome();
					ps.remove(ps.getProfessor(cpf));
					JOptionPane.showMessageDialog(null, "Professor(a) " + nome + " removido(a)!");
				}
				break;
			}
			case 2: {
				String professores = "";
				for (Professor professor : ps.getAllProfessores()) {
					professores += ps.getProfessor(professor.getCpf()) + "\n";
				}
				JOptionPane.showMessageDialog(null, professores);
				break;
			}
			case 3: {
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do professor:"));
				if (ps.getProfessor(cpf) == null) {
					JOptionPane.showMessageDialog(null, "O CPF digitado não está cadastrado!");
				} else {
					JOptionPane.showMessageDialog(null, ps.getProfessor(cpf));
				}
				break;
			}
			case 4: {
				controleLoop = false;
				break;
			}
			default: {
				controleLoop = false;
				break;
			}
		}
		} controleLoop = true;
	};
	public void menuSalario(ProfessorServiceImpl ps, AlunoServiceImpl as) {
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do professor:"));
		if (ps.getProfessor(cpf) == null) {
			JOptionPane.showMessageDialog(null, "O CPF digitado não está cadastrado!");
		} else {
			JOptionPane.showMessageDialog(null, ps.getProfessor(cpf).getSalario() + (ps.getProfessor(cpf).getSalario() * 0.03) * as.getTotalItens());
		}
		
	};
}
