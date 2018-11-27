package br.com.biblioteca.modelo;

import java.util.List;

public class Emprestimo {
	
	private int id;
	private List<Livro> listaLivros;
	private String nomeFuncionario;
	private String dataemprestimo;
	private String devolucaolivros;
	
	public Emprestimo(int id, List<Livro> listaLivros, String nomeFuncionario, String dataemprestimo,
			String devolucaolivros) {
		super();
		this.id = id;
		this.listaLivros = listaLivros;
		this.nomeFuncionario = nomeFuncionario;
		this.dataemprestimo = dataemprestimo;
		this.devolucaolivros = devolucaolivros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getDataemprestimo() {
		return dataemprestimo;
	}

	public void setDataemprestimo(String dataemprestimo) {
		this.dataemprestimo = dataemprestimo;
	}

	public String getDevolucaolivros() {
		return devolucaolivros;
	}

	public void setDevolucaolivros(String devolucaolivros) {
		this.devolucaolivros = devolucaolivros;
	}

	
}
