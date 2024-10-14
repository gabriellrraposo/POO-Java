package fabrica;

public class Cliente extends Pessoa {
	private int registroCliente;
	private String dataCadastro;
	
	public int totalDeCompras() {
		return 1;
	}
	
	public void formasPagamento() {
		System.out.println("Dinheiro e débito");
	}

	@Override
	public String toString() {
		return "Cliente [registroCliente=" + registroCliente + ", dataCadastro=" + dataCadastro + ", toString()="
				+ super.toString() + "]";
	}

	public Cliente(String nome, int cpf, int rg, int registroCliente, String dataCadastro) {
		super(nome, cpf, rg);
		this.registroCliente = registroCliente;
		this.dataCadastro = dataCadastro;
	}

	public Cliente(String nome, int cpf, int rg) {
		super(nome, cpf, rg);
	}
	
	public Cliente() {
		
	}
	
	public int getRegistroCliente() {
		return registroCliente;
	}
	public void setRegistroCliente(int registroCliente) {
		this.registroCliente = registroCliente;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
