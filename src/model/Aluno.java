package model;

public class Aluno {
	
	private long id;
	private String ra;
	private String nome;
	private int idade;
	private String sexo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ID: " + getId() + "\n");
		sb.append("RA: " + getRa() + "\n");
		sb.append("Nome: " + getNome() + "\n");
		sb.append("Idade: " +getIdade() + "\n");
		sb.append("Sexo: " + getSexo() + "\n");
		return sb.toString();
	}	

}
