package fabrica;

public class VendedorParceiro extends Vendedor {
	private String parceira;
	
	@Override
	public String toString() {
		return "VendedorParceiro [parceira=" + parceira + ", toString()=" + super.toString() + "]";
	}

	public VendedorParceiro(String nome, int cpf, int rg, int registroFuncionario, int tipoVendedor, int totalVendas,
			String parceira) {
		super(nome, cpf, rg, registroFuncionario, tipoVendedor, totalVendas);
		this.parceira = parceira;
	}

	public VendedorParceiro(String nome, int cpf, int rg, int registroFuncionario, int tipoVendedor, int totalVendas) {
		super(nome, cpf, rg, registroFuncionario, tipoVendedor, totalVendas);
	}
	
	public VendedorParceiro() {
		
	}

	public String getParceira() {
		return parceira;
	}

	public void setParceira(String parceira) {
		this.parceira = parceira;
	}
	
	public void calculaComissao() {
		System.out.println(super.getTotalVendas() * 0.045);
	}
}
