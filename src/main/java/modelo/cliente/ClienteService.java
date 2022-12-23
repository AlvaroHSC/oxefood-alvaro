package modelo.cliente;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifpe.oxefoodalvaro.utils.entity.GenericService;

@Service
public class ClienteService extends GenericService {

	@Autowired
	private ClienteRepository repository;

	@Transactional
	public Cliente save(Cliente cliente) {

	usuarioService.save(cliente.getUsuario());
		
		super.preencherCamposAuditoria(cliente);
		Cliente clienteSalvo = repository.save(cliente);
		
		emailService.enviarEmailConfirmacaoCadastroCliente(clienteSalvo);
		
		return clienteSalvo;
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
