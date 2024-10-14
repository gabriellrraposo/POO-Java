package fabrica;

public class Cliente extends Pessoa {
	private int registroCliente;
	private String dataCadastro;
	private int qtdLotacao;
	
	@Override
	public String toString() {
		return "Cliente [registroCliente=" + registroCliente + ", dataCadastro=" + dataCadastro + ", qtdLotacao="
				+ qtdLotacao + "]";
	}

	public Cliente() {
		
	}
	
	public Cliente(int registroCliente, String dataCadastro, int qtdLotacao) {
		super();
		this.registroCliente = registroCliente;
		this.dataCadastro = dataCadastro;
		this.qtdLotacao = qtdLotacao;
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
	public int getQtdLotacao() {
		return qtdLotacao;
	}
	
	public void incluirLocacao() {
		
	}
}
