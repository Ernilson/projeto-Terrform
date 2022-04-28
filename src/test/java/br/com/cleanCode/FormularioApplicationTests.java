package br.com.cleanCode;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.cleanCode.model.CadastroModel;
import br.com.cleanCode.servicesImpl.CadastroServiceImpl;


@SpringBootTest
class FormularioApplicationTests {
	
	@Autowired
	private CadastroServiceImpl fsi;
	
	@Test
	void contextLoads() {
		CadastroModel fm = new CadastroModel();
	fm.setNome("Esdras Pinheiro Alves");
	fm.setTelefone("61 98500-0102");
	//fm.setEmail("esdras.dev@hotmail.com");
	fm.setEndereco("Qd 103 Cj 04 Cs 08");
	
	
	
	fsi.salveOrUpdate(fm);
	}

	@Test
	public void lista() {
		List<CadastroModel> fm = fsi.listAll();
		
		System.out.println("Total de registros" + fm.size());

		for (CadastroModel formulario : fm) {
			System.out.println(formulario.getNome() + "test" + formulario.getEndereco());
			
		}
				
		
	}
	
}
