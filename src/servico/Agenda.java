package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.Cliente;
import entidade.Contato;
import entidade.RetornoCliente;

@WebService	
@SOAPBinding(style = Style.RPC)
public interface Agenda {
	
	@WebMethod
	public RetornoCliente inserirCliente(Cliente cliente);	
			
	@WebMethod
	public RetornoCliente pesquisaCliente(Cliente cliente);
	
	@WebMethod
	public RetornoCliente adicionarContato(Contato contato);
	
	@WebMethod
	public RetornoCliente excluirContato(Cliente cliente);
	
	

}
