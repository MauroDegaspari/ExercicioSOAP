package servico;

import javax.jws.WebService;

import entidade.Cliente;
import entidade.Contato;
@WebService(endpointInterface = "servico.Agenda")
public class AgendaImp implements Agenda {

	@Override
	public boolean inserirCliente(Cliente cliente, Contato contato) {
		
		return false;
	}


	@Override
	public boolean inserirContato(Cliente cliente, Contato contato) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirContato(Cliente cliente, Contato contato) {
		// TODO Auto-generated method stub
		return false;
	}

}
