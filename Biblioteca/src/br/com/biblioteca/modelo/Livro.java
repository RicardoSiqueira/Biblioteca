package br.com.biblioteca.modelo;

public class Livro {
	
	private int id;
	private String nome;
	private String autor;
	private String editora;
	private String area;
	private String data_aquisicao;
	private double preco;
	private int quantidade;
	private int ativo;
	
	public Livro(int id, String nome, String autor, String editora, String area, String data_aquisicao, double preco,
			int quantidade, int ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.area = area;
		this.data_aquisicao = data_aquisicao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.ativo = ativo;
	}
	
	public Livro(String nome, String autor, String editora, String area, String data_aquisicao, double preco,
			int quantidade, int ativo) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.area = area;
		this.data_aquisicao = data_aquisicao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.ativo = ativo;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData_aquisicao() {
		return data_aquisicao;
	}
	public void setData_aquisicao(String data_aquisicao) {
		this.data_aquisicao = data_aquisicao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAtivo() {
		return ativo;
	}

	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}

}
