package Fabrica;

public class Professor extends Funcionario{
	private String disciplina;
	private String curriculo;
	

	@Override
	public String toString() {
		return "Professor [disciplina=" + disciplina + ", curriculo=" + curriculo + ", toString()=" + super.toString()
				+ "]";
	}
	
	public Professor(double salario, String nome, int idade, String cpf, String rg, String disciplina, String curriculo) {
		super(salario, nome, idade, cpf, rg);
		this.disciplina = disciplina;
		this.curriculo = curriculo;
	}

	public Professor(double salario, String nome, int idade, String cpf, String rg) {
		super(salario, nome, idade, cpf, rg);
	}

	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	
	
}
