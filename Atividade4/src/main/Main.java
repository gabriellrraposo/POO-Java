package main;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fabrica.*;



public class Main {
	public static void menu() {
		
	}
	
	public static void menuLivro() {
		
	}
	
	public static void menuRevista() {
		
	}
	
	public static void main(String[] args) {
		menu();
		
		List<Livro> livros = new ArrayList<Livro>();
		List<Revista> revistas = new ArrayList<Revista>();
	
		
		String[] main_menu = {"Livros", "Revistas", "Sair"};
		String[] items_menu = {"Cadastrar", "Excluir", "Atualizar", "Listar", "Voltar"};
		
		boolean verificador = true;
		
		while (verificador) {
			
			int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção:", null, 0, 1, null, main_menu, main_menu);
			switch(opcao) {
				
				case 0: {
					
					int opcao_livros = JOptionPane.showOptionDialog(null, "Selecione uma opção:", null, 0, 1, null, items_menu, items_menu);
					switch(opcao_livros) {
						
						case 0: {
							String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
							String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
							int numPaginas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas do livro:"));
							
							livros.add(new Livro(livros.size(), titulo, autor, numPaginas));

							break;
						}
						case 1: {
							int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro:"));
							
							Optional<Livro> optLivro = livros.stream().filter(livro -> livro.getId() == id).findFirst();
							
							if (optLivro.isPresent()) {
								int idLivro = optLivro.get().getId();
								livros.remove(idLivro);

							}
							break;
						}
						case 2: {
							int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro:"));
							
							Optional<Livro> optLivro = livros.stream().filter(livro -> livro.getId() == id).findFirst();
							
							if (optLivro.isPresent()) {
								Livro livro = optLivro.get();
								
								JTextField txtTitulo = new JTextField();
								JTextField txtAutor = new JTextField();
								JTextField txtNumPaginas = new JTextField();
								
								txtTitulo.setText(livro.getTitulo());
								txtAutor.setText(livro.getAutor());
								txtNumPaginas.setText(String.valueOf(livro.getNumPaginas()));
								
								Object[] atualizarLivro = {
										"Digite o Titulo: ", txtTitulo,
										"Digite o Autor: ", txtAutor,
										"Informe o número de páginas: ", txtNumPaginas

								};
								
								JOptionPane.showConfirmDialog(null, atualizarLivro, "Atualizar livro", JOptionPane.OK_CANCEL_OPTION);
								
								livro.setTitulo(txtTitulo.getText());
								livro.setAutor(txtAutor.getText());
								livro.setNumPaginas(Integer.parseInt(txtNumPaginas.getText()));

								break;
							}
						}
						case 3: {
							String listaLivros = "";
							for (Livro l : livros) {
								listaLivros += l.toString() + "\n";
							}
							JOptionPane.showMessageDialog(null, listaLivros);
							break;
						}
						case 4: {
							break;
						}
						default: {
							break;
						}
						
					}
					break;
				}
				case 1: {
					
					int opcao_revistas = JOptionPane.showOptionDialog(null, "Selecione uma opção:", null, 0, 1, null, items_menu, items_menu);
					switch(opcao_revistas) {
						
						case 0: {
							String titulo = JOptionPane.showInputDialog("Digite o título da revista:");
							String autor = JOptionPane.showInputDialog("Digite o autor da revista:");
							int edicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a edição da revista:"));
							
							revistas.add(new Revista(revistas.size(), titulo, autor, edicao));
							break;
						}
						case 1: {
							int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da revista:"));
							
							Optional<Revista> optRevista = revistas.stream().filter(revista -> revista.getId() == id).findFirst();
							
							if (optRevista.isPresent()) {
								int idRevista = optRevista.get().getId();
								revistas.remove(idRevista);
							}
							break;
						}
						case 2: {
							int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da revista:"));
							
							Optional<Revista> optRevista = revistas.stream().filter(revista -> revista.getId() == id).findFirst();
							
							if (optRevista.isPresent()) {
								Revista revista = optRevista.get();
								
								JTextField txtTitulo = new JTextField();
								JTextField txtAutor = new JTextField();
								JTextField txtEdicao = new JTextField();
								
								txtTitulo.setText(revista.getTitulo());
								txtAutor.setText(revista.getAutor());
								txtEdicao.setText(String.valueOf(revista.getEdicao()));
								
								Object[] atualizarRevista = {
										"Digite o Titulo: ", txtTitulo,
										"Digite o Autor: ", txtAutor,
										"Informe o número de páginas: ", txtEdicao

								};
								
								JOptionPane.showConfirmDialog(null, atualizarRevista, "Atualizar revista", JOptionPane.OK_CANCEL_OPTION);
								
								revista.setTitulo(txtTitulo.getText());
								revista.setAutor(txtAutor.getText());
								revista.setEdicao(Integer.parseInt(txtEdicao.getText()));
								break;
							}
						}
						case 3: {
							String listaRevistas = "";
							for (Revista r : revistas) {
								listaRevistas += r.toString() + "\n";
							}
							JOptionPane.showMessageDialog(null, listaRevistas);
							break;
						}
						case 4: {
							break;
						}
						default: {
							break;
						}
						
					}
					break;
				}
				case 2: {
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









	//String nome_exclusao = JOptionPane.showInputDialog("Digite o nome da pessoa que deseja excluir:");
	
	//for (int i = 0; i < pessoas.size(); i++) {
	//	if (nome_exclusao.equals(pessoas.get(i).getNome()))
	//	{
	//		System.out.println("Achou");
	//		pessoas.remove(i);
	//	}
	//}
	
	//for (Pessoa pessoa : pessoas) {
	//	System.out.println(pessoa.toString());
	//}
	
	//String cpf = JOptionPane.showInputDialog("Digite o cpf da pessoa que deseja cadastrar:");
	//boolean achou = true;
	//for (int i = 0; i < pessoas.size(); i++) {
	//	if(cpf.equals(pessoas.get(i).getCpf()))
	//	{
	//		System.out.println("Pessoa não cadastrada. CPF já consta no banco");
	//		achou = true;
	//		break;
	//	}
	//	else
	//	{
			//pessoas.add(new Pessoa(10, "Nome " + 10, 18, cpf));
			//System.out.println("Pessoa cadastrada");
	//		achou = false;
	//	}
	//}
	
	
	//if (!achou)
	//{
	//	pessoas.add(new Pessoa(10, "Nome " + 10, 18, cpf));
	//	System.out.println("Pessoa cadastrada");
	//}

