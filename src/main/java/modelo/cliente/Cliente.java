package modelo.cliente;

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
@Table(name = "Cliente")
@Where(clause = "habilitado = true")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel{

	private static final long serialVersionUID = -1718916869201872309L;
	
	
	@Column
	private String chaveEmpresa;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String fone;
	
	@Column
	private String foneAlternativa; 
	
}
