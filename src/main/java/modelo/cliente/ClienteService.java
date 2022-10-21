package modelo.cliente;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ifpe.oxefoodalvaro.utils.entity.GenericService;

public class ClienteService extends GenericService {

	@Autowired
	private ClienteRepository repository;

	 @Transactional
	    public Cliente save(Cliente cliente) {

	 
	    super.preencherCamposAuditoria(cliente);

	    return repository.save(cliente);
	    }

	
}
