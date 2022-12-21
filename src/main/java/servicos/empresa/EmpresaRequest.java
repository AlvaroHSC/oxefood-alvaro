package servicos.empresa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import modelo.empresa.Empresa;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaRequest {
	
	private String chave;
	
	private String site;
	
	private String cnpj;
	
	private String inscricaoEstadual;
	
	private String nomeEmpresarial;
	
	private String nomeFantasia;
	
	private String fone;

	private String foneAlternativo;
	
	public Empresa buildEmpresa() {
		
		Empresa empresa = Empresa.builder()
				.chave(chave)
				.site(site)
				.cnpj(cnpj)
				.inscricaoEstadual(inscricaoEstadual)
				.nomeEmpresarial(nomeEmpresarial)
				.nomeFantasia(nomeFantasia)
				.fone(fone)
				.foneAlternativo(foneAlternativo)
				.build();
		
		return empresa;
				
	}
}
