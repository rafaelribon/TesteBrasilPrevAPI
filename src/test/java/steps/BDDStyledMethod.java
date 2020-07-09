package steps;


import io.restassured.http.ContentType;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;



public class BDDStyledMethod {

    public static void RequisaoGETConsultarPessoas() {
        when().get("http://localhost:8080/pessoas/11/985388877").then()
                .statusCode(200)
                .body("nome",containsString("Rafael Teixeira"))
                .body("cpf",equalTo("12345678909"));

    }


    public static void RequisaoGETConsultarPessoasporTelefone() {
        when().get("http://localhost:8080/pessoas/985388877").then()
                .statusCode(404)
                .body("message",equalTo("No message available"));

    }


    public static void RequisaoGETConsultarPessoasporDDD() {
        when().get("http://localhost:8080/pessoas/11").then()
                .statusCode(404)
                .body("message",equalTo("No message available"));



    }

    public static void RequisaoGETConsultarPessoasporDadosInvalidos() {
        when().get("http://localhost:8080/pessoas/99/985388877").then()
                .statusCode(404)
                .body("erro",containsString("Não existe pessoa com o telefone"));

    }

//    public static void RequisicaoPostCadastrarPessoa(){
//        JSONObject jsonObjectToPost  = new JSONObject();
//
//        jsonObjectToPost .put("nome", "Rafael Teixeira");
//        jsonObjectToPost .put("cpf", "12345678909");
//
//        JSONArray array = new JSONArray();
//        JSONObject arrayItem = new JSONObject();
//
//        arrayItem.put("logradouro","Rua Alexandre Dumas");
//        arrayItem.put("numero","123");
//        arrayItem.put("complemento","Empresa");
//        arrayItem.put("bairro","Chacara Santo Antonio");
//        arrayItem.put("cidade","São Paulo");
//        arrayItem.put("estado","SP");
//        array.put(arrayItem.toString());
//        jsonObjectToPost.put("enderecos", array.toString());
//        JSONArray array2 = new JSONArray();
//        JSONObject arrayItem2 = new JSONObject();
//         arrayItem2.put("ddd","11");
//         arrayItem2.put("numero","985388877");
//         array2.put(arrayItem2.toString());
//         jsonObjectToPost.put("telefones", array.toString());
//
//
//         given().contentType(ContentType.JSON).body(jsonObjectToPost)
//                 .post("http://localhost:8080/pessoas").then().statusCode(201);
//
//    }
//
//
//    public static void RequisicaoPostCadastrarPessoaSemNomes(){
//        JSONObject jsonObjectToPost  = new JSONObject();
//        jsonObjectToPost.put("cpf", "12345678909");
//
//        JSONArray array2 = new JSONArray();
//        JSONObject arrayItem2 = new JSONObject();
//        arrayItem2.put("ddd","11");
//        arrayItem2.put("numero","985388877");
//        array2.put(arrayItem2.toString());
//        jsonObjectToPost.put("telefones", array2.toString());
//
//
//        given().contentType(ContentType.JSON).body(jsonObjectToPost)
//                .post("http://localhost:8080/pessoas").then().statusCode(400);
//
//    }





}
