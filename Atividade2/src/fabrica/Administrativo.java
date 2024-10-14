package fabrica;

public class Administrativo extends Funcionario {
	private String setor;
	
	@Override
	public String toString() {
		return "Administrativo [setor=" + setor + ", toString()=" + super.toString() + "]";
	}

	public Administrativo(String nome, int cpf, int rg, int registroFuncionario, String setor) {
		super(nome, cpf, rg, registroFuncionario);
		this.setor = setor;
	}

	public Administrativo(String nome, int cpf, int rg, int registroFuncionario) {
		super(nome, cpf, rg, registroFuncionario);
	}
	
	public Administrativo() {
		
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
