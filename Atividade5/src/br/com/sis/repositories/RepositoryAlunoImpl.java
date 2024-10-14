package br.com.sis.repositories;

import br.com.sis.interfaces.IRepository;
import br.com.sis.models.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositoryAlunoImpl implements IRepository {
	private List<Aluno> alunos = new ArrayList<Aluno>();
	
	public RepositoryAlunoImpl() {}

	public Aluno getAluno(int cpf) {
		Optional<Aluno> optAluno = alunos.stream().filter(a -> a.getCpf() == cpf).findFirst();
		
		if (optAluno.isPresent()) {
			return optAluno.get();
		}
		return null;
		
	}
	
	public void addAluno(Aluno a) {
		alunos.add(a);
	}
	
	public void removeAluno(Aluno a) {
		alunos.remove(a);
	}
	
	public List<Aluno> listAll() {
		return alunos;
	}
	
	public int getIdSequencial() { return alunos.size(); }
	public int getTotalItens() { return alunos.size(); }
}
