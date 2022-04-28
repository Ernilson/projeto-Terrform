 package br.com.cleanCode.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cleanCode.model.CadastroModel;
import br.com.cleanCode.repository.CadastroRepository;
import br.com.cleanCode.services.CadastroService;


@Service
public class CadastroServiceImpl implements CadastroService{

	@Autowired
	private CadastroRepository rp;
	
	@Override
	public CadastroModel salveOrUpdate(CadastroModel c) {
		return rp.save(c);
	}

	@Override
	public void delete(Long id) {
		rp.deleteById(id);
		
	}

	@Override
	public List<CadastroModel> listAll() {
		return rp.findAll();
	}

	@Override
	public Optional<CadastroModel> buscaPorId(Long id) {
		return rp.findById(id);
	}

	
	
}
