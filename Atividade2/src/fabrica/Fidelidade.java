package fabrica;

public class Fidelidade extends Cliente {
	private int pontos;
	
	public void formasPagamento() {
		System.out.println("Dinheiro, débito, crédito, milhas");
	}
	
	@Override
	public String toString() {
		return "Fidelidade [pontos=" + pontos + ", toString()=" + super.toString() + "]";
	}

	public Fidelidade(String nome, int cpf, int rg, int registroCliente, String dataCadastro, int pontos) {
		super(nome, cpf, rg, registroCliente, dataCadastro);
		this.pontos = pontos;
	}

	public Fidelidade(String nome, int cpf, int rg, int registroCliente, String dataCadastro) {
		super(nome, cpf, rg, registroCliente, dataCadastro);
	}
	
	public Fidelidade() {
		
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
}
