package entidade;

public class Contato {

	private String telefone;
	private String email;
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//cast - 
		@Override // metodo de comparação
		public boolean equals(Object obj) {

			Contato contatoEntrada = (Contato)obj;
			
			if(this.email.equalsIgnoreCase(contatoEntrada.getEmail())
					|| this.telefone.equals(contatoEntrada.getTelefone())) {
					return true;
					}else 	{
					return false;
		}
			
		}
}
