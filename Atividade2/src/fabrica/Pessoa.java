package fabrica;

public class Pessoa {
	private String nome;
	private int cpf;
	private int rg;
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + "]";
	}

	public Pessoa(String nome, int cpf, int rg) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public Pessoa() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	
	
}
