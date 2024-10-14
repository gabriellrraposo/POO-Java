package br.com.sis;

import javax.swing.JOptionPane;

import br.com.sis.controllers.*;
import br.com.sis.services.*;

public class Aplicacao {
	private static boolean controleLoop;
	private static ProfessorServiceImpl professorService = new ProfessorServiceImpl();
	private static AlunoServiceImpl alunoService = new AlunoServiceImpl();
	
	public static void menuPrincipal(ControllerAluno a, ControllerProfessor p) {
		controleLoop = true;
		String[] menu = { "Alunos", "Professores", "Situação Aluno", "Salário Professor"};
		
		while (controleLoop) {
			
			int opcao = JOptionPane.showOptionDialog(null, "--------- Menu Principal Sistema ---------\n"
					+ "Dados:\nAlunos: " + alunoService.getTotalItens() + "\nProfessores: "  + professorService.getTotalItens() + "\n"
					+ "--------- Menu Principal Sistema ---------", null, 1, 1, null, menu, menu);
			
			switch(opcao) {
				case 0: {
					a.menu(alunoService);
					break;
				}
				case 1: {
					p.menu(professorService);
					break;
				}
				case 2: {
					a.menuSituacao(alunoService);
					break;
				}
				case 3: {
					p.menuSalario(professorService, alunoService);
					break;
				}
				default : {
					controleLoop = false;
					break;
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		menuPrincipal(new ControllerAluno(), new ControllerProfessor());
	}

}
