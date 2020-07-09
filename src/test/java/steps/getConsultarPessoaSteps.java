package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class getConsultarPessoaSteps {


    @And("retorna os dados da pessoa")
    public void retornaOsDadosDaPessoa() {

    }

    @When("eu faço um requisição GET para o serviço de consultar Pessoa passando telefone")
    public void euFaçoUmRequisiçãoGETParaOServiçoDeConsultarPessoaPassandoTelefone() {
        BDDStyledMethod.RequisaoGETConsultarPessoasporTelefone();

    }

    @When("eu faço um requisição GET para o serviço de consultar Pessoa passando DDD")
    public void euFaçoUmRequisiçãoGETParaOServiçoDeConsultarPessoaPassandoDDD() {
      BDDStyledMethod.RequisaoGETConsultarPessoasporDDD();

    }
//
    @When("eu faço um requisição GET para o serviço de consultar Pessoa passando dados invalidos")
    public void euFaçoUmRequisiçãoGETParaOServiçoDeConsultarPessoaPassandoDadosInvalidos() {
       BDDStyledMethod.RequisaoGETConsultarPessoasporDadosInvalidos();
    }

    @When("^eu faço um requisição GET para o serviço de consultar Pessoa\"$")
    public void euFaçoUmRequisiçãoGETParaOServiçoDeConsultarPessoa() throws Throwable {
        BDDStyledMethod.RequisaoGETConsultarPessoas();
    }

    @Then("^deve me retornar o status \"([^\"]*)\"$")
    public void deveMeRetornarOStatus(String arg0) throws Throwable {

    }
}


