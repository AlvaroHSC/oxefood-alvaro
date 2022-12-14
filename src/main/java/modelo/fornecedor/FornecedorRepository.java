
package modelo.fornecedor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>, JpaSpecificationExecutor<Fornecedor> {

	@Query(value = "SELECT f FROM Fornecedor f wehere f.chaveEmpresa = :chaveEmpresa ORDER BY f.nome ACS")
	List<Fornecedor> listarFornecedores(String chaveEmpresa);

}
