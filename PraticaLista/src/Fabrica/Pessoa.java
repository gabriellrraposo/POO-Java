package Fabrica;

public class Pessoa {
	
	private int id;
	private String nome;
	private int idade;
	private String cpf;
	
	public Pessoa(int id, String nome, int idade, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public Pessoa() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
	}
	
}
