package modelo.fornecedor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Where;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.ifpe.oxefoodalvaro.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxefoodalvaro.utils.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Fornecedor")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor extends EntidadeAuditavel{
	
	private static final long serialVersionUID = -3896853083438030649L;
	
	public static final String LABEL = "Fornecedor";

    @JsonIgnore
    @NotNull

	@Column
	private String chaveEmpresa;
	
    @NotNull
    @Column(nullable = false, length = 100)
    private String nome;
	
	@Column
	private String endereco;
	
	@Column
	private String logoMarca;
	
	@Column
	private Double valorMercado;
	
	@Column
	private String PaginaWeb;
	
	@Column
	private String contatoVendedor;

	    public void updateFrom(Fornecedor param) {
	    this.setNome(param.getNome());
	    }
	
	
}

