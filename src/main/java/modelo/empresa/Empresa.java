package modelo.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import br.com.ifpe.oxefoodalvaro.utils.entity.EntidadeAuditavel;

@Entity
@Table(name = "Empresa")
@Where(clause = "habilitado = true")

public class Empresa extends EntidadeAuditavel{
	
	private static final long serialVersionUID = -8125191937425958244L;

	@Column
	private String cnpj;
	
	@Column
	private String empresa;
	
	@Column
	private String fone;
	
	@Column
	private String foneAlternativo;

}
