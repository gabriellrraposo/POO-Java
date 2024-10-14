package br.com.sis.services;

import java.util.List;

import br.com.sis.interfaces.IService;
import br.com.sis.models.Aluno;
import br.com.sis.repositories.RepositoryAlunoImpl;

public class AlunoServiceImpl implements IService {
	private RepositoryAlunoImpl repositoryAluno = new RepositoryAlunoImpl();
	
	public AlunoServiceImpl() {}

	public Aluno getAluno(int cpf) {
		if (repositoryAluno.getAluno(cpf) != null) {
			return repositoryAluno.getAluno(cpf);
		}
		
		return null;
	}
	
	public List<Aluno> getAllAlunos() {
		return repositoryAluno.listAll();
	}
	
	public void add(Aluno a) {
		a.setCodigo(repositoryAluno.getIdSequencial());
		repositoryAluno.addAluno(a);
	};
	public void remove(Aluno a) {
		repositoryAluno.removeAluno(a);
	};
	public int getTotalItens() { return repositoryAluno.getTotalItens(); };
}
