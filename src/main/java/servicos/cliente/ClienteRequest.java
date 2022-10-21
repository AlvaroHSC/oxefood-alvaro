package servicos.cliente;

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

	public Cliente buildCliente() {

	    return Cliente.builder()
	        .chaveEmpresa(chaveEmpresa)
	        .nome(nome)
	        .cpf(cpf)
	        .fone(fone)
	        .foneAlternativa(foneAlternativa)
	        .build();
	    }
}
