package br.com.sis.models;

public class Aluno extends Pessoa {

	private double nota;
	
	public Aluno(int codigo, int cpf, String nome, double nota) {
		super(codigo, cpf, nome);
		this.nota = nota;
	}
	
	
	public Aluno(int codigo, int cpf, String nome) {
		super(codigo, cpf, nome);
	}

	@Override
	public String toString() {
		return "Aluno [nota=" + nota + ", toString()=" + super.toString() + "]";
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
}
