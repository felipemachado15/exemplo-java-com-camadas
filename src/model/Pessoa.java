package model;

public class Pessoa {
	private String CPF ; 
	private String nome ;
	
	
	
	public Pessoa(String CPF, String nome) {
		super();
		this.CPF = CPF;
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Pessoa [CPF=" + CPF + ", nome=" + nome + "]";
	} 
	
	

}
