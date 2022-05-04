package br.com.cleanCode.controllerTest;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cleanCode.CleanCodeApplicationTests;
import br.com.cleanCode.controller.CadastroController;
import br.com.cleanCode.model.CadastroModel;

public class CadastroControllerTest extends CleanCodeApplicationTests {

	private MockMvc mocMvc;

	@Autowired
	private CadastroController cadController;

	@Before
	public void setUp() {
		this.mocMvc = MockMvcBuilders.standaloneSetup(cadController).build();
	}

	@Test
	public void criaCadastro_RetornaStatusCode201() throws Exception {
		CadastroModel cad = new CadastroModel();
		cad.setNome("teste1");
		cad.setEndereco("testeaqui");
		cad.setTelefone("1234567");

		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writeValueAsString(cad);
		
		this.mocMvc.perform(MockMvcRequestBuilders.post("/cad")
				.contentType(MediaType.APPLICATION_JSON)
				.contentType(json)
				)
				.andExpect(MockMvcResultMatchers.status().isCreated())
				.andExpect(MockMvcResultMatchers.header()
						.string("location", Matchers.containsString("http://localhost/cad")));						
	}

}
