package servico;

import java.util.List;

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
	public List<Cliente> PesquisarCliente(Cliente cliente);
	
	@WebMethod
	public boolean inserirContato(Cliente cliente, Contato contato);
	
	@WebMethod
	public boolean excluirContato(Cliente cliente, Contato contato);
	

}
