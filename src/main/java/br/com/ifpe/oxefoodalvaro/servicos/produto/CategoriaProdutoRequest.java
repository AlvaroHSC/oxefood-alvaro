package br.com.ifpe.oxefoodalvaro.servicos.produto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.ifpe.oxefoodalvaro.modelo.produto.CategoriaProduto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoRequest {

	private String chaveEmpresa;

	private Long idCategoria;

	@Size(max = 1000)
	@NotNull
	@NotEmpty
	private String descricao;

	public CategoriaProduto buildCategoriaProduto() {

		return CategoriaProduto.builder().chaveEmpresa(chaveEmpresa).descricao(descricao).build();
	}

}
