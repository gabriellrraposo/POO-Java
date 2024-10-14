package fabrica;

public class Funcionario extends Pessoa {
	private int registroFuncionario;
	
	@Override
	public String toString() {
		return "Funcionario [registroFuncionario=" + registroFuncionario + ", toString()=" + super.toString() + "]";
	}

	public Funcionario(String nome, int cpf, int rg, int registroFuncionario) {
		super(nome, cpf, rg);
		this.registroFuncionario = registroFuncionario;
	}

	public Funcionario(String nome, int cpf, int rg) {
		super(nome, cpf, rg);
	}
	
	public Funcionario() {
		
	}

	public int getRegistroFuncionario() {
		return registroFuncionario;
	}

	public void setRegistroFuncionario(int registroFuncionario) {
		this.registroFuncionario = registroFuncionario;
	}
	
	
}
