package servico;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import entidade.Cliente;
import entidade.RetornoCliente;

@WebService(endpointInterface = "servico.Agenda")
public class AgendaImp implements Agenda {
	
	private List<Cliente> listaCliente = new ArrayList<Cliente>();
	
	
	@Override
	public RetornoCliente inserirCliente(Cliente cliente) {
		RetornoCliente retorno = new RetornoCliente();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO");
		
		if(this.existe(cliente) == null) {
			this.listaCliente.add(cliente);
		}else {
			retorno.setCodigoRetorno(0);
			retorno.setMensagemRetorno("FALHA: Cliente já existe!!");
		}
		return retorno;
	}
	@Override
	public RetornoCliente pesquisaCliente(Cliente cliente) {
		RetornoCliente retorno = new RetornoCliente();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO");
		retorno.setListaCliente(this.listaCliente);
		return retorno;
	}
	@Override
	public RetornoCliente adicionarContato(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public RetornoCliente excluirContato(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	// metodo utilizado para verificar e retornar o cliente existente
	private Cliente existe(Cliente cliente) {
		if(cliente != null && cliente.getCpf() != null
				&& !cliente.getCpf().isEmpty()) {
			
		//indexOf percorre a lista e retorna 0
			int index = this.listaCliente.indexOf(cliente);
		
		if(index != -1) {
			return this.listaCliente.get(index);
		}else {
				return null;
			}
		}
			
		else {
			return null;
		}
		}
	}
	


