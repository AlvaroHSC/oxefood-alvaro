package servicos.cliente;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.cliente.Cliente;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

	private String chaveEmpresa;

	private String nome;

	private String cpf;

	private String fone;

	private String foneAlternativa;

	@NotBlank(message = "O Email é de preenchimento obrigatório")
	private String email;

	public Cliente buildCliente() {

		return Cliente.builder()
				.chaveEmpresa(chaveEmpresa)
				.nome(nome)
				.email(email)
				.cpf(cpf)
				.fone(fone)
				.foneAlternativa(foneAlternativa)
				.build();

	}
}
