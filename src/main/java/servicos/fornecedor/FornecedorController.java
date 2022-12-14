package servicos.fornecedor;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodalvaro.utils.entity.GenericController;
import modelo.fornecedor.Fornecedor;
import modelo.fornecedor.FornecedorService;

@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController extends GenericController {

	@Autowired
	private FornecedorService fornecedorService;

	@PostMapping
	public ResponseEntity<Fornecedor> save(@RequestBody @Valid FornecedorRequest request) {

		Fornecedor fornecedor = fornecedorService.save(request.buildFornecedor());
		return new ResponseEntity<Fornecedor>(fornecedor, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public Fornecedor get(@PathVariable Long id) {

		return fornecedorService.findById(id);
	}

	@GetMapping("/porempresa/{chaveEmpresa")
	public List<Fornecedor> consultarPorChaveEmpresa(@PathVariable String chaveEmpresa) {

		return fornecedorService.consultarPorChaveEmpresa(chaveEmpresa);
	}
}
