package controllers;

import play.mvc.Result;
import repository.JPALivroRepository;
import java.util.ArrayList;
import java.util.List;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import javax.inject.Inject;
import models.Livro;
import play.mvc.Controller;
import views.html.*;

public class LivroController extends Controller {

	@Inject
	FormFactory formFactory;
	@Inject
	JPALivroRepository jpaLivroRepository;

	public Result index() {
		List<Livro> livros = jpaLivroRepository.listarLivros();
		return ok(views.html.index.render(livros));
	}

	public Result pesquisarLivro() {
		DynamicForm requestData = formFactory.form().bindFromRequest();
		String valor = requestData.get("valor");
		String hql = "select p from Livro p where titulo like '%"+valor+"%' or autor like '%"+valor+"%' ";
		List<Livro> livros = jpaLivroRepository.pesquisarPorHql(hql);
		return ok(views.html.index.render(livros));
	}

	public Result adicionarLivro() {
		Livro livro = formFactory.form(Livro.class).bindFromRequest().get();
		jpaLivroRepository.salvar(livro);
		return redirect(routes.LivroController.index());
	}

	public Result atualizarLivro() {
		Livro livro = formFactory.form(Livro.class).bindFromRequest().get();
		jpaLivroRepository.atualizarLivro(livro);
		return redirect(routes.LivroController.index());
	}

	public Result cadastrar() {
		return ok(views.html.cadastrar.render());
	}

	public Result excluir(Long id) {
		Livro livro = jpaLivroRepository.pesquisarPorId(id);
		jpaLivroRepository.excluir(livro);
		return redirect(routes.LivroController.index());
	}

	public Result editar(Long id) {
		Livro livro = jpaLivroRepository.pesquisarPorId(id);
		return ok(views.html.editar.render(livro));
	}

}
