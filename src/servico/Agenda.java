package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.Cliente;
import entidade.Contato;

@WebService	
@SOAPBinding(style = Style.RPC)
public interface Agenda {
	
	@WebMethod
	public boolean inserirCliente(Cliente cliente, Contato contato);
	
		
	@WebMethod
	public boolean inserirContato(Cliente cliente, Contato contato);
	
	@WebMethod
	public boolean excluirContato(Cliente cliente, Contato contato);
	

}
