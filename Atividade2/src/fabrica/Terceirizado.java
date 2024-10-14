package fabrica;

public class Terceirizado extends Funcionario {
	private String empresa;
	
	@Override
	public String toString() {
		return "Terceirizado [empresa=" + empresa + ", toString()=" + super.toString() + "]";
	}

	public Terceirizado(String nome, int cpf, int rg, int registroFuncionario, String empresa) {
		super(nome, cpf, rg, registroFuncionario);
		this.empresa = empresa;
	}

	public Terceirizado(String nome, int cpf, int rg, int registroFuncionario) {
		super(nome, cpf, rg, registroFuncionario);
	}
	
	public Terceirizado() {
		
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
