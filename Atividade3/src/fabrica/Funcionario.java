package fabrica;

public class Funcionario extends Pessoa {
	private int registroFuncionario;
	private double salario;
	private int qtdLocacoes;
	
	@Override
	public String toString() {
		return "Funcionario [registroFuncionario=" + registroFuncionario + ", salario=" + salario + ", qtdLocacoes="
				+ qtdLocacoes + "]";
	}

	public Funcionario() {
		
	}

	public Funcionario(int registroFuncionario, double salario, int qtdLocacoes) {
		super();
		this.registroFuncionario = registroFuncionario;
		this.salario = salario;
		this.qtdLocacoes = qtdLocacoes;
	}

	public int getRegistroFuncionario() {
		return registroFuncionario;
	}

	public void setRegistroFuncionario(int registroFuncionario) {
		this.registroFuncionario = registroFuncionario;
	}
	
	public int getQtdLocacoes() {
		return qtdLocacoes;
	}
	
	public double calculaSalarioFuncionario() {
		this.salario = 1500 + (this.qtdLocacoes * 20);
		return this.salario;
	}
	
	public void incluirQtdLocacao() {
		
	}

	
}
