package servicos.clientes;

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

	private String foneAlternativo;

	public Cliente buildCliente() {

		Cliente cliente = Cliente.builder()
				.chaveEmpresa(chaveEmpresa)
				.nome(nome)
				.cpf(cpf)
				.fone(fone)
				.foneAlternativo(foneAlternativo)
				.build();

		return cliente;
	}
}
