package br.com.sis.controllers;

import javax.swing.JOptionPane;

import br.com.sis.models.Aluno;
import br.com.sis.services.AlunoServiceImpl;

public class ControllerAluno {
	private boolean controleLoop = true;
	
	String[] menu = { "Cadastrar", "Remover", "Listar", "Pesquisar", "Voltar" };
	public void menu(AlunoServiceImpl as) {
		
		
		while (controleLoop) {
			int opcao = JOptionPane.showOptionDialog(null, ":: Menu Aluno ::\n"
					+ "Alunos: " + as.getTotalItens() + "\n"
					+ "Escolha uma opção:", null, 1, 1, null, menu, menu);
		switch (opcao) {
			case 0: {
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do aluno:"));
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
				
				if (as.getAluno(cpf) != null) {
					JOptionPane.showMessageDialog(null, "O CPF digitado já foi cadastrado!");
				} else if (nota <= 0) {
					JOptionPane.showMessageDialog(null, "A nota deve ser maior que 0!");
				} else {
					as.add(new Aluno(0, cpf, nome, nota));
				}
				break;
			}
			case 1: {
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do aluno:"));
				if (as.getAluno(cpf) == null) {
					JOptionPane.showMessageDialog(null, "O CPF digitado não está cadastrado!");
				} else {
					as.remove(as.getAluno(cpf));
					JOptionPane.showMessageDialog(null, "Aluno removido!");
				}
				break;
			}
			case 2: {
				String alunos = "";
				for (Aluno aluno : as.getAllAlunos()) {
					alunos += as.getAluno(aluno.getCpf()) + "\n";
				}
				JOptionPane.showMessageDialog(null, alunos);
				break;
			}
			case 3: {
				int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do aluno:"));
				if (as.getAluno(cpf) == null) {
					JOptionPane.showMessageDialog(null, "O CPF digitado não está cadastrado!");
				} else {
					JOptionPane.showMessageDialog(null, as.getAluno(cpf));
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
		}
	};
	public void menuSituacao(AlunoServiceImpl as) {
		int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o cpf do aluno:"));
		if (as.getAluno(cpf) == null) {
			JOptionPane.showMessageDialog(null, "O CPF digitado não está cadastrado!");
		} else {
			String situacao = "";
			if (as.getAluno(cpf).getNota() < 40) {
				situacao = "Reprovado";
			} else if (as.getAluno(cpf).getNota() < 60) {
				situacao = "Exame especial";
			} else {
				situacao = "Aprovado";
			}
			
			JOptionPane.showMessageDialog(null, situacao);
		}
	};
}
