package br.com.biblioteca.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import br.com.biblioteca.modelo.Livro;

public class LivroDAO
{
	private DataSource datasource;
	private List<Livro> listaLivros;
	
	public LivroDAO(DataSource ds)
	{
		this.datasource = ds;
	}
	
	public List<Livro> consultaLivros()
	{
		listaLivros = new ArrayList<Livro>();
		Connection con = null;
		Statement st = null;
		ResultSet result = null;
		try {
			con = datasource.getConnection();
			st = con.createStatement();
			String sql = "select * from livro";
			result = st.executeQuery(sql);
			
			while(result.next())
			{
				int id = result.getInt("id");
				String nome = result.getString("nome");
				String autor = result.getString("autor");
				String editora = result.getString("autor");
				String area = result.getString("area");
				String data_aquisicao = result.getString("data_aquisicao");
				double preco = result.getDouble("preco");
				int quantidade = result.getInt("quantidade");
				int ativo = result.getInt("ativo");
				Livro livro = new Livro(id,nome,autor,editora,area,data_aquisicao,preco,quantidade,ativo);
				listaLivros.add(livro);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaLivros;
	}
}
