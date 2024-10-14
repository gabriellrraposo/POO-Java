package fabrica;

public class Aluno extends Pessoa {
	private int id;
	private String turma;
	
	public Aluno() {
	}
	
	public Aluno(String nome, String cpf, String rg) {
		super(nome, cpf, rg);
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(String nome, String cpf, String rg, int id, String turma) {
		super(nome, cpf, rg);
		this.id = id;
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", turma=" + turma + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
}
