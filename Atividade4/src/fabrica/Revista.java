package fabrica;

public class Revista extends ItemBiblioteca {
	private int edicao;

	@Override
	public String toString() {
		return "Revista [edicao=" + edicao + ", toString()=" + super.toString() + "]";
	}

	public Revista(int id, String titulo, String autor, int edicao) {
		super(id, titulo, autor);
		this.edicao = edicao;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	
}
