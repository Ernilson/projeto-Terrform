package br.com.cleanCode.services;

import java.util.List;
import java.util.Optional;

import br.com.cleanCode.model.CadastroModel;

public interface CadastroService {

	// Metodo para Salvar ou Alterar
	CadastroModel salveOrUpdate(CadastroModel c);

	// Metodo para Deletar pelo Id
	void delete(Long id);

	// Metodo para Listar todos os cadastros
	List<CadastroModel> listAll();

	// Metodo para buscar por Id
	Optional<CadastroModel> buscaPorId(Long id);

}
