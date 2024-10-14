package Fabrica;

public class Funcionario extends Pessoa {
	private double salario;

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", toString()=" + super.toString() + "]";
	}

	public Funcionario(double salario, String nome, int idade, String cpf, String rg) {
		super(nome, idade, cpf, rg);
		this.salario = salario;
	}

	public Funcionario() {
		super();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
