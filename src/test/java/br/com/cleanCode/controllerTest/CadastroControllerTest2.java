package br.com.cleanCode.controllerTest;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import br.com.cleanCode.controller.CadastroController;
import br.com.cleanCode.servicesImpl.CadastroServiceImpl;
import io.restassured.http.ContentType;

@WebMvcTest
public class CadastroControllerTest2 {

	@Autowired
	private CadastroController ccontrl;

	@MockBean
	private CadastroServiceImpl service;

	@BeforeEach
	public void setup() {
		standaloneSetup(this.ccontrl);
	}

	@Test
	public void deveRetornarSucesso_QuandoBuscarFilme() {
		when(this.service.listAll());
		given().accept(ContentType.JSON).when().get("/api/cadastro").then().statusCode(HttpStatus.OK.value());
	}

}
