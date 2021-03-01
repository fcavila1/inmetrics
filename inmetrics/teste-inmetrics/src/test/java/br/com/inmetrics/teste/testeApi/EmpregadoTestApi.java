package br.com.inmetrics.teste.testeApi;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

import java.util.List;

import org.json.simple.JSONObject;
import org.junit.Test;

import br.com.inmetrics.model.EmpregadoModel;
import br.com.inmetrics.rest.core.BaseTest;
import br.com.inmetrics.singleton.EmpregadoSingleton;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class EmpregadoTestApi extends BaseTest {

	ValidatableResponse response;
	EmpregadoModel empregado = EmpregadoSingleton.getInstance();

	List<EmpregadoModel> listaEmpregados;

	@Test
	public void cadastrarEmpregado(int statusCode, String nome) {
//		System.out.println("EMPREGADO RECEBIDO EH:\n" + empregado.toString());
		JSONObject requestParams = new JSONObject();
		requestParams.put("admissao", empregado.getAdmissao());
		requestParams.put("cargo", empregado.getCargo());
		requestParams.put("comissao", empregado.getComissao());
		requestParams.put("cpf", empregado.getCpf());
		requestParams.put("departamentoId", empregado.getDepartamentoId());
		requestParams.put("nome", empregado.getNome());
		requestParams.put("salario", empregado.getSalario());
		requestParams.put("sexo", empregado.getSexo());
		requestParams.put("tipoContratacao", empregado.getTipoContratacao());

		given().auth().basic("inmetrics", "automacao").contentType(ContentType.JSON) // contentType esperado
				.header("Content-Type", "application/json").log().all().body(requestParams.toJSONString()).when().log()
				.all().post("/empregado/cadastrar").then().statusCode(statusCode).body("nome", is(nome));
	}

	@Test
	public void listarEmpregadoCadastradoPeloIp(int statusCode) {

		JsonPath path = given()
				.auth()
				.basic("inmetrics", "automacao")
				.header("Content-Type", "application/json")
				.get("/empregado/list_all/")
				.andReturn().jsonPath();
		
		List<EmpregadoModel> empregados = path.getList("", EmpregadoModel.class);

		// Guarda o id do ultimo empregado cadastrado para recuperar ele abaixo
		int ultimoIdCadastrado = empregados.get(empregados.size()-1).getEmpregadoId();
		System.out.println("******************Ultimo ID cadastrado"+ultimoIdCadastrado);
		
		given()
		 .auth().basic("inmetrics", "automacao")
		 .contentType(ContentType.JSON) //contentType esperado
		 .header("Content-Type", "application/json")
		 .log().all()
		 	.when()
		  		.get("/empregado/list/" + ultimoIdCadastrado)
		  	.then()
		  		.log().all()
		  		.statusCode(statusCode)
		  		.body("nome", is(empregados.get(empregados.size()-1).getNome()))
		 ;
	}

	@Test
	public void listarTodosEmpregados(int statusCode, int tamanhoLista) {
		given()
		 .auth()
		 .basic("inmetrics", "automacao")
		 .contentType(ContentType.JSON) // contentType esperado
		 .header("Content-Type", "application/json")
		 .log().all()
		 	.when()
		 		.get("/empregado/list_all/")
		 	.then()
		 		.log().all()
		 		.statusCode(statusCode)
		 		.body("empregadoId.max()", is(greaterThan(tamanhoLista)));
	}
	
	@Test
	public void alterarEmpregado(int statusCode) {
		RestAssured.registerParser("text/plain", Parser.JSON);
		JsonPath path = given()
				.auth()
				.basic("inmetrics", "automacao")
				.header("Content-Type", "application/json")
				.get("/empregado/list_all/")
				.andReturn().jsonPath();
		
		List<EmpregadoModel> empregados = path.getList("", EmpregadoModel.class);

		// Guarda o id do ultimo empregado cadastrado para recuperar ele abaixo
		int ultimoIdCadastrado = empregados.get(empregados.size()-1).getEmpregadoId();
		System.out.println("******************Ultimo ID cadastrado"+ultimoIdCadastrado);
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("admissao", empregados.get(empregados.size()-1).getAdmissao());
		requestParams.put("cargo", empregados.get(empregados.size()-1).getCargo());
		requestParams.put("comissao", empregados.get(empregados.size()-1).getComissao());
		requestParams.put("cpf", empregados.get(empregados.size()-1).getCpf());
		requestParams.put("departamentoId", 0);
		requestParams.put("nome", empregado.getNome());
		requestParams.put("salario", empregado.getSalario());
		requestParams.put("sexo", empregados.get(empregados.size()-1).getSexo());
		requestParams.put("tipoContratacao", empregado.getTipoContratacao());

		given()
		 .auth().basic("inmetrics", "automacao")
		 .contentType(ContentType.JSON) //contentType esperado
		 .header("Content-Type", "application/json")
		 .log().all()
		 .body(requestParams.toJSONString())
		 	.when()
		  		.put("/empregado/alterar/" + ultimoIdCadastrado)
		  	.then()
		  		.log().all()
		  		.statusCode(200)
		  		.body("nome", is(empregado.getNome()))
		 ;
		
	}
}
