package servicos.fornecedor;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.fornecedor.Fornecedor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorRequest {

	private String chaveEmpresa;	

	private String nome;

	private String endereco;

	private String logoMarca;

	private Double valorMercado; 

	private String paginaWeb;
	
	private String contatoVencedor;
	
	public Fornecedor buildFornecedor() {

	    return Fornecedor.builder()
	    	.chaveEmpresa(chaveEmpresa)
	        .nome(nome)
	        .endereco(endereco)
	        .logoMarca(logoMarca)
	        .valorMercado(valorMercado)
	        .PaginaWeb(paginaWeb)
	        .contatoVendedor(contatoVencedor)
	        .build();
	    }

}
