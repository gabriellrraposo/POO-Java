package Fabrica;

public class Bolsista extends Aluno {
	private double valorBolsa;

	@Override
	public String toString() {
		return "Bolsista [valorBolsa=" + valorBolsa + ", toString()=" + super.toString() + "]";
	}

	public Bolsista(String nota, String nome, int idade, String cpf, String rg, double valorBolsa) {
		super(nota, nome, idade, cpf, rg);
		this.valorBolsa = valorBolsa;
	}

	public Bolsista(String nota, String nome, int idade, String cpf, String rg) {
		super(nota, nome, idade, cpf, rg);
	}

	public double getValorBolsa() {
		return valorBolsa;
	}

	public void setValorBolsa(double valorBolsa) {
		this.valorBolsa = valorBolsa;
	}
	
	public void pagarMensalidade(double desconto) {
		
	}
}
