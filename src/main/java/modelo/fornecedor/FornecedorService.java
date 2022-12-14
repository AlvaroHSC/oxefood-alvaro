package modelo.fornecedor;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ifpe.oxefoodalvaro.utils.entity.GenericService;

public class FornecedorService extends GenericService {
	
	@Autowired
	private FornecedorRepository repository;

	 @Transactional
	    public Fornecedor save(Fornecedor fornecedor) {

	 
	    super.preencherCamposAuditoria(fornecedor);

	    return repository.save(fornecedor);
	    }
	 
	 @Transactional
	 public Fornecedor findById(Long id) {
		 
		 return repository.findById(id).get();
	 }

	public List<Fornecedor> consultarPorChaveEmpresa(String chaveEmpresa) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
}