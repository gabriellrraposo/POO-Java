package Fabrica;

public class Administrativo extends Funcionario {
	private String setor;
	
	@Override
	public String toString() {
		return "Administrativo [setor=" + setor + ", toString()=" + super.toString() + "]";
	}

	public Administrativo(double salario, String nome, int idade, String cpf, String rg) {
		super(salario, nome, idade, cpf, rg);
	}

	public Administrativo(double salario, String nome, int idade, String cpf, String rg, String setor) {
		super(salario, nome, idade, cpf, rg);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
