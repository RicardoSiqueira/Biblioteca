package br.com.biblioteca.modelo;

public class Funcionario {
	
	private int matricula;
	private String nome;
	private int numeroOAB;
	private String tipo;
	
	public Funcionario(int matricula, String nome, int numeroOAB, String tipo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.numeroOAB = numeroOAB;
		this.tipo = tipo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroOAB() {
		return numeroOAB;
	}

	public void setNumeroOAB(int numeroOAB) {
		this.numeroOAB = numeroOAB;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
