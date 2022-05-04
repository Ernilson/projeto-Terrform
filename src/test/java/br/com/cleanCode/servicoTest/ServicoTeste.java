package br.com.cleanCode.servicoTest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.cleanCode.CleanCodeApplicationTests;
import br.com.cleanCode.model.CadastroModel;
import br.com.cleanCode.servicesImpl.CadastroServiceImpl;

public class ServicoTeste  extends CleanCodeApplicationTests{

	@Autowired
	private CadastroServiceImpl servico;
	
	@Test
	public void addTest() {
		CadastroModel cm = new CadastroModel();
		cm.setNome("teste+1");
		cm.setEndereco("test123");
		cm.setTelefone("1234567");
		
		servico.salveOrUpdate(cm);
	}
	
}
