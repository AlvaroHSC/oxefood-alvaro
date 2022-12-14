package modelo.cliente;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;

import br.com.ifpe.oxefoodalvaro.utils.entity.GenericService;

public class ClienteService extends GenericService {

	@Autowired
	private ClienteRepository repository;

	@Transactional
	public Cliente save(Cliente cliente) {

		super.preencherCamposAuditoria(cliente);

		return repository.save(cliente);
	}

	@Transactional
	public Cliente findById(Long id) {

		return repository.findById(id).get();
	}

	public List<Cliente> consultarPorChaveEmpresa(String chaveEmpresa) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
