package entidade;

import java.util.ArrayList;
import java.util.List;

public class RetornoCliente {

	private int codigoRetorno; // 0- sucesso 1 falha
	private String mensagemRetorno;
	private List<Cliente> listaCliente;	
	private List<Contato> listaContato;
	
	// iniciando valores 
	public RetornoCliente() {
		this.mensagemRetorno = "";
		this.codigoRetorno = 0;
		this.listaCliente = new ArrayList<Cliente>();
		this.listaContato = new ArrayList<Contato>();
	}
	
	public List<Contato> getListaContato() {
		return listaContato;
	}

	public void setListaContato(List<Contato> listaContato) {
		this.listaContato = listaContato;
	}

	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	public List<Cliente> getListaCliente() {
		return listaCliente;
	}
	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
	
	
	
	
}
