package fabrica;

public class Simples extends Cliente {
	
	public void formasPagamento() {
		System.out.println("Dinheiro, débito, crédito");
	}

	public Simples(String nome, int cpf, int rg, int registroCliente, String dataCadastro) {
		super(nome, cpf, rg, registroCliente, dataCadastro);
		// TODO Auto-generated constructor stub
	}

	public Simples(String nome, int cpf, int rg) {
		super(nome, cpf, rg);
		// TODO Auto-generated constructor stub
	}
	
	public Simples() {
		
	}
}
