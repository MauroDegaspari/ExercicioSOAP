package entidade;

import java.util.List;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String idade;
	private String sexo;
	private String interesses;
	private List<Contato> listaDeContato;
	
	
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
	public List<Contato> getListaDeContato() {
		return listaDeContato;
	}
	public void setListaDeContato(List<Contato> listaDeContato) {
		this.listaDeContato = listaDeContato;
	}
	
	//cast - 
	@Override // metodo de comparação
	public boolean equals(Object obj) {
		Cliente clienteEntrada = (Cliente)obj; // cliente de entrada
		
		if(this.cpf.equals(clienteEntrada.getCpf())) {
			return true;
	}else 	{
		return false;
	}
		
	}
}
