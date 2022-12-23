package servicos.clientes;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;
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
import modelo.cliente.Cliente;
import modelo.cliente.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController extends GenericController {

	@Autowired
	private ClienteService clienteService;

	@NotNull(message = "O Chave Empresa é de preenchimento obrigatório")
	@NotBlank(message = "O Chave Empresa é de preenchimento obrigatório")
	private String chaveEmpresa;

	@NotNull(message = "O Nome é de preenchimento obrigatório")
	@NotBlank(message = "O Nome é de preenchimento obrigatório")
	@Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
	private String nome;

	@NotNull(message = "O CPF é de preenchimento obrigatório")
	@NotBlank(message = "O CPF é de preenchimento obrigatório")
	@CPF
	private String cpf;

	@Length(min = 8, max = 20, message = "O campo Fone tem que ter entre {min} e {max} caracteres")

	@PostMapping
	public ResponseEntity<Cliente> save(@RequestBody @Valid ClienteRequest request) {

		Cliente clienteRequisicao = request.buildCliente();
		Cliente clienteSalvo = clienteService.save(clienteRequisicao);
		return new ResponseEntity<Cliente>(clienteSalvo, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public Cliente get(@PathVariable Long id) {

		return clienteService.findById(id);
	}

	@GetMapping("/porempresa/{chaveEmpresa")
	public List<Cliente> consultarPorChaveEmpresa(@PathVariable String chaveEmpresa) {

		return clienteService.consultarPorChaveEmpresa(chaveEmpresa);
	}
}
