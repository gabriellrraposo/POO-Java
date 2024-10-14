package br.com.sis.repositories;

import br.com.sis.interfaces.IRepository;
import br.com.sis.models.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositoryProfessorImpl implements IRepository {
	private List<Professor> professores = new ArrayList<Professor>();
	
	public RepositoryProfessorImpl() {}
	
	public Professor getProfessor(int cpf) {
		Optional<Professor> optProfessor = professores.stream().filter(p -> p.getCpf() == cpf).findFirst();
		
		if (optProfessor.isPresent()) {
			return optProfessor.get();
		}
		
		return null;
	}
	
	public void addProfessor(Professor p) {
		professores.add(p);
	}
	
	public void removeProfessor(Professor p) {
		professores.remove(p);
	}
	
	public List<Professor> listAll() {
		return professores;
	}
	
	public int getIdSequencial() { return professores.size(); }
	public int getTotalItens() { return professores.size(); }
}
