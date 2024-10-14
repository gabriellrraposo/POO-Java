package fabrica;

public class Livro extends ItemBiblioteca {
	private int numPaginas;
	
	public Livro(int id, String titulo, String autor, int numPaginas) {
		super(id, titulo, autor);
		this.numPaginas = numPaginas;
	}

	@Override
	public String toString() {
		return "Livro [numPaginas=" + numPaginas + ", toString()=" + super.toString() + "]";
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	
}
