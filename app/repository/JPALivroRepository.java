package repository;

import play.db.jpa.JPAApi;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.function.Function;
import models.Livro;

import java.util.List;

public class JPALivroRepository {
	@Inject
	JPAApi jpaApi;

	private <T> T wrap(Function<EntityManager, T> function) {
		return jpaApi.withTransaction(function);
	}

	public void salvar(Livro livro) {
		wrap(em -> inserir(em, livro));
	}
	
	public void atualizarLivro(Livro livro) {
		wrap(em -> atualizar(em, livro));
	}

	public void excluir(Livro livro) {
		wrap(em -> deletar(em, livro));
	}

	public List<Livro> listarLivros() {
		return wrap(em -> listar(em));
	}

	public Livro pesquisarPorId(Long id) {
		return wrap(em -> pesquisarId(em, id));
	}

	private Livro pesquisarId(EntityManager em, Long id) {
		Livro livro = em.createQuery("select p from Livro p where p.id=" + id + " ", 
				Livro.class).getSingleResult();
		return livro;
	}
	
	public  List<Livro> pesquisarPorHql(String hql) {
		return wrap(em -> pesquisar(em, hql));
	}
	
	private List<Livro> pesquisar(EntityManager em, String hql) {
		List<Livro> livros= em.createQuery(hql, 
				Livro.class).getResultList();
		return livros;
	}

	private Livro inserir(EntityManager em, Livro livro) {
		em.persist(livro);
		return livro;
	}
	
	private Livro atualizar(EntityManager em, Livro livro) {
		em.merge(livro);
		return livro;
	}

	private Livro deletar(EntityManager em, Livro livro) {
		Livro ld = em.merge(livro);
		em.remove(ld);
		return ld;
	}

	private List<Livro> listar(EntityManager em) {
		List<Livro> livros = em.createQuery("select p from Livro p order by id desc", Livro.class)
				.getResultList();
		return livros;
	}

}
