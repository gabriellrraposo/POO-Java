package Main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Fabrica.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		for (int i = 0; i < 10; i++) {
			pessoas.add(new Pessoa(i, "Nome " + i, 18 + i, "123" + i));
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}
		
		String nome_exclusao = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja excluir:");
		
		for (int i = 0; i < pessoas.size(); i++) {
			if (nome_exclusao.equals(pessoas.get(i).getNome()))
			{
				System.out.println("Achou");
				pessoas.remove(i);
			}
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}
		
		String cpf = JOptionPane.showInputDialog("Digite o cpf da pessoa que deseja cadastrar:");
		boolean achou = true;
		for (int i = 0; i < pessoas.size(); i++) {
			if(cpf.equals(pessoas.get(i).getCpf()))
			{
				System.out.println("Pessoa não cadastrada. CPF já consta no banco");
				achou = true;
				break;
			}
			else
			{
				//pessoas.add(new Pessoa(10, "Nome " + 10, 18, cpf));
				//System.out.println("Pessoa cadastrada");
				achou = false;
			}
		}
		
		
		if (!achou)
		{
			pessoas.add(new Pessoa(10, "Nome " + 10, 18, cpf));
			System.out.println("Pessoa cadastrada");
		}
		
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
		}
		
		
		System.out.println("Fim do programa");
	}
}
