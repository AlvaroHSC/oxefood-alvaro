package servicos.clientes;

import java.util.Arrays;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import acesso.Usuario;
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

	@NotBlank(message = "O e-mail é de preenchimento obrigatório")
	@Email
	private String email;

	@NotBlank(message = "A senha é de preenchimento obrigatório")
	private String password;

	public Cliente buildCliente() {

		return Cliente.builder()
				.chaveEmpresa(chaveEmpresa)
				.usuario(buildUsuario())
				.nome(nome)
				.email(email)
				.cpf(cpf)
				.fone(fone)
				.foneAlternativa(foneAlternativa)
				.build();
	}

	public Usuario buildUsuario() {

		return Usuario.builder()
				.username(email)
				.password(password)
				.roles(Arrays.asList(Usuario.ROLE_CLIENTE))
				.build();
	}

}
