package Fabrica;

public class Aluno extends Pessoa {
	private String nota;

	@Override
	public String toString() {
		return "Aluno [nota=" + nota + ", toString()=" + super.toString() + "]";
	}

	public Aluno(String nota, String nome, int idade, String cpf, String rg) {
		super(nome, idade, cpf, rg);
		this.nota = nota;
	}

	public Aluno() {
		super();
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public void pagarMensalidade() {
		
	}
}
