package br.com.sis.models;

public class Professor extends Pessoa {
	private double salario;

	public Professor(int codigo, int cpf, String nome, double salario) {
		super(codigo, cpf, nome);
		this.salario = salario;
	}

	public Professor(int codigo, int cpf, String nome) {
		super(codigo, cpf, nome);
	}

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", toString()=" + super.toString() + "]";
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
