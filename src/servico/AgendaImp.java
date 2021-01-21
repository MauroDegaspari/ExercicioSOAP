package servico;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import entidade.Cliente;
import entidade.Contato;
import entidade.RetornoCliente;

@WebService(endpointInterface = "servico.Agenda")
public class AgendaImp implements Agenda {

	private List<Cliente> listaCliente = new ArrayList<Cliente>();
		

	@Override
	public RetornoCliente inserirCliente(Cliente cliente) {
		RetornoCliente retorno = new RetornoCliente();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO");

		if (this.existe(cliente) == null) {
			this.listaCliente.add(cliente);
		} else {
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
		
			RetornoCliente retorno = new RetornoCliente();
			retorno.setCodigoRetorno(0);
			retorno.setMensagemRetorno("SUCESSO!!!");
			// 1 - verificar se existe o cliente na base
			Cliente clienteBase = this.existe(cliente);
			
			if(clienteBase != null) {
				//2 - Verificar se existe contatos para serem inseridos
				if(cliente.getListaDeContato() != null && 
					cliente.getListaDeContato().size() > 0) {
					
			// 3 - Verifica se existe contato ja inseridos na base --------
					boolean existeContato = false;
					for (Contato contatoEntrada : cliente.getListaDeContato()) {
						int index = clienteBase.getListaDeContato().indexOf(contatoEntrada);
						if(index != -1) {
							existeContato = true;
						}
					}
					
				// 4 - Se existir contato manda o erro, senão, adiciona todos os contatos
					if(existeContato) {
						retorno.setCodigoRetorno(1);
						retorno.setMensagemRetorno("FALHA: Contato já existente!!!");
					} else {
						clienteBase.getListaDeContato().addAll(cliente.getListaDeContato());
					}

				}else {
					retorno.setCodigoRetorno(1);
					retorno.setMensagemRetorno("FALHA: Não existe contato para adicionar!!!");
				}
			}else {
				retorno.setCodigoRetorno(1);
				retorno.setMensagemRetorno("FALHA: Cliente não existe!!");
			}
			
			return retorno;
		}
	@Override
	public RetornoCliente excluirContato(Cliente cliente) {
		
		RetornoCliente retorno = new RetornoCliente();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO!!!");
		// 1 - verificar se existe o cliente na base
		Cliente clienteBase = this.existe(cliente);
		
		if(clienteBase != null) {
			//2 - Verificar se existe contatos para serem inseridos
			if(cliente.getListaDeContato() != null && 
				cliente.getListaDeContato().size() > 0) {
				
		
				//3 - verificar se o contato existe para ser deletado.
				for (Contato contatoEntrada : cliente.getListaDeContato()) {
					int index = clienteBase.getListaDeContato().indexOf(contatoEntrada);
					if(index != -1) {
						
						cliente.getListaDeContato().remove(index);
					}
				}
				

			}else {
				retorno.setCodigoRetorno(1);
				retorno.setMensagemRetorno("FALHA: Não existe contato para remover!!!");
			}
		}else {
			retorno.setCodigoRetorno(1);
			retorno.setMensagemRetorno("FALHA: Cliente não existe!!");
		}
		
		return retorno;
	}

	// metodo utilizado para verificar e retornar o cliente existente
	private Cliente existe(Cliente cliente) {
		if (cliente != null && cliente.getCpf() != null && !cliente.getCpf().isEmpty()) {

			// indexOf percorre a lista e retorna 0
			int index = this.listaCliente.indexOf(cliente);

			if (index != -1) {
				return this.listaCliente.get(index);
			} else {
				return null;
			}
		}

		else {
			return null;
		}
	}
	

	
}
