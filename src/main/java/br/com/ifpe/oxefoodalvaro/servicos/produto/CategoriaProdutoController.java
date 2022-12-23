package br.com.ifpe.oxefoodalvaro.servicos.produto;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefoodalvaro.modelo.produto.CategoriaProduto;
import br.com.ifpe.oxefoodalvaro.modelo.produto.CategoriaProdutoService;
import br.com.ifpe.oxefoodalvaro.utils.entity.GenericController;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping ("/api/categoriaproduto")
public class CategoriaProdutoController extends GenericController {

    @Autowired
    private CategoriaProdutoService categoriaProdutoService;

    @PostMapping
    public ResponseEntity<CategoriaProduto> save(@RequestBody @Valid CategoriaProdutoRequest request) {

    validarPreenchimentoChave(request.getChaveEmpresa());
    CategoriaProduto categoriaProduto = categoriaProdutoService.save(request.buildCategoriaProduto());
    return new ResponseEntity<CategoriaProduto>(categoriaProduto, HttpStatus.CREATED);
    }
    
    @PutMapping("/{id}")
    @ApiOperation(value = "Serviço responsável por atualizar as informações da categoria de produto no sistema.")
    public ResponseEntity<CategoriaProduto> update(@PathVariable("id") Long id, @RequestBody CategoriaProdutoRequest request) {

	categoriaProdutoService.update(id, request.buildCategoriaProduto());
	return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Rota responsável por remover(exclusão lógica) uma categoria de produto do sistema.")
    public ResponseEntity<Void> delete(@PathVariable Long id) {

	 categoriaProdutoService.delete(id);
	 return ResponseEntity.noContent().build();
    }

    
}
