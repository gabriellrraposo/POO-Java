package br.com.sis.services;

import java.util.List;
import br.com.sis.interfaces.IService;
import br.com.sis.models.Professor;
import br.com.sis.repositories.RepositoryAlunoImpl;
import br.com.sis.repositories.RepositoryProfessorImpl;

public class ProfessorServiceImpl implements IService {
	private RepositoryProfessorImpl repositoryProfessor = new RepositoryProfessorImpl();
	
	public ProfessorServiceImpl() {}

	public Professor getProfessor(int cpf) {
		if (repositoryProfessor.getProfessor(cpf) != null) {
			return repositoryProfessor.getProfessor(cpf);
		}
		
		return null;
	}
	
	public List<Professor> getAllProfessores() {
		return repositoryProfessor.listAll();
	}
	
	public void add(Professor p) {
		p.setCodigo(repositoryProfessor.getIdSequencial());
		repositoryProfessor.addProfessor(p);
	};
	public void remove(Professor p) {
		repositoryProfessor.removeProfessor(p);;
	};
	public int getTotalItens() { return repositoryProfessor.getTotalItens(); };
}
