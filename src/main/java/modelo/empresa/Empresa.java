package modelo.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodalvaro.utils.entity.EntidadeAuditavel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Empresa")
@Where(clause = "habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empresa extends EntidadeAuditavel{
	
	private static final long serialVersionUID = -8125191937425958244L;

	@Column
	private String chave;
	
	@Column
	private String cnpj;
	
	@Column
	private String site;
	
	@Column
	private String fone;
	
	@Column
	private String foneAlternativo;
	
	@Column
	private String inscricaoEstadual;
	
	@Column
	private String nomeEmpresarial;
	
	@Column
	private String nomeFantasia;
	

}
