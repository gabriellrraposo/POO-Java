package fabrica;

public class Professor extends Pessoa {
	private int id;
	private String formacao;
	
	public Professor() {}

	public Professor(String nome, String cpf, String rg) {
		super(nome, cpf, rg);
	}

	public Professor(String nome, String cpf, String rg, int id, String formacao) {
		super(nome, cpf, rg);
		this.id = id;
		this.formacao = formacao;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", formacao=" + formacao + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
