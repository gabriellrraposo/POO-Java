package fabrica;

public class Vendedor extends Funcionario {
	private int tipoVendedor;
	private int totalVendas;
	
	@Override
	public String toString() {
		return "Vendedor [tipoVendedor=" + tipoVendedor + ", totalVendas=" + totalVendas + ", toString()="
				+ super.toString() + "]";
	}

	public Vendedor(String nome, int cpf, int rg, int registroFuncionario, int tipoVendedor, int totalVendas) {
		super(nome, cpf, rg, registroFuncionario);
		this.tipoVendedor = tipoVendedor;
		this.totalVendas = totalVendas;
	}

	public Vendedor(String nome, int cpf, int rg, int registroFuncionario) {
		super(nome, cpf, rg, registroFuncionario);
	}
	
	public Vendedor() {
		
	}
	
	public int getTipoVendedor() {
		return tipoVendedor;
	}
	public void setTipoVendedor(int tipoVendedor) {
		this.tipoVendedor = tipoVendedor;
	}
	public int getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	public void calculaComissao() {
		System.out.println(this.totalVendas * 0.07);
	}
}
