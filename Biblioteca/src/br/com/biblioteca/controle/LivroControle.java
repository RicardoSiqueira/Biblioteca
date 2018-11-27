package br.com.biblioteca.controle;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import br.com.biblioteca.DAO.LivroDAO;
import br.com.biblioteca.modelo.Livro;
@WebServlet("/livroControle")
public class LivroControle extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/bibliotecadev")
	private DataSource datasource;
	private LivroDAO livroDao;
	
	public void init(ServletConfig config) throws ServletException 
	{
		livroDao = new LivroDAO(datasource);
	}

	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		List<Livro> livros = livroDao.consultaLivros();
		request.setAttribute("LISTA-LIVROS", livros);
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}
	
}
