package modelo.cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {

<<<<<<< HEAD
	@Query(value = "SELECT c FROM Cliente c WHERE c.chaveEmpresa = :chaveEmpresa ORDER BY c.nome ACS")
	List<Cliente> listarCliente(String chaveEmpresa);

	List<Cliente> findByChaveEmpresaOrderByNomeAsc(String chaveEmpresa);
}
=======
	/*
	 * @Query(value = "SELECT c FROM Cliente c WHERE c.chaveEmpresa = :chaveEmpresa ORDER BY c.nome ACS")
	 * List<Cliente> listarCliente(String chaveEmpresa);
	 * */
	
	List<Cliente> findByChaveEmpresaOrderByNomeAsc(String chaveEmpresa);
}
>>>>>>> de01413196dcc76b5ea9c0de018fdf4bbb997edc
