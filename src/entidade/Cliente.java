package entidade;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String idade;
	private String sexo;
	private String interesses;
	private Contato listaDeContato;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getInteresses() {
		return interesses;
	}
	public void setInteresses(String interesses) {
		this.interesses = interesses;
	}
	public Contato getListaDeContato() {
		return listaDeContato;
	}
	public void setListaDeContato(Contato listaDeContato) {
		this.listaDeContato = listaDeContato;
	}

}
