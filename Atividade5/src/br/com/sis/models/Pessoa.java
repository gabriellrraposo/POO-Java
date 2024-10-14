package br.com.sis.models;

public abstract class Pessoa {
	private int codigo;
	private int cpf;
	private String nome;
	
	public Pessoa(int codigo, int cpf, String nome) {
		this.codigo = codigo;
		this.cpf = cpf;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", cpf=" + cpf + ", nome=" + nome + "]";
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
