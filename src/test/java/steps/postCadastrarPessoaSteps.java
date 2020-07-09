package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class postCadastrarPessoaSteps {

    @When("^eu faço um requisição POST para o serviço de cadastrar Pessoa$")
    public void euFaçoUmRequisiçãoPOSTParaOServiçoDeCadastrarPessoa() {
//        BDDStyledMethod.RequisicaoPostCadastrarPessoa();
    }

    @And("^retorna os dados da pessoa criado$")
    public void retornaOsDadosDaPessoaCriado() {
    }

    @And("^informo nessa requisão o \"([^\"]*)\"$")
    public void informoNessaRequisãoO(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^a mensagem \"([^\"]*)\"numerodoCPF\"([^\"]*)\"$")
    public void aMensagemNumerodoCPF(String arg0, String arg1) throws Throwable {

    }

    @And("^informo nessa requisição o \"([^\"]*)\"$")
    public void informoNessaRequisiçãoO(String arg0) throws Throwable {

    }

    @And("^a mensagem \"([^\"]*)\"telefone\"([^\"]*)\"$")
    public void aMensagemTelefone(String arg0, String arg1) throws Throwable {

    }


    @When("^eu faço um requisição POST para o serviço de cadastrar Pessoa sem passar Nome$")
    public void euFaçoUmRequisiçãoPOSTParaOServiçoDeCadastrarPessoaSemPassarNome() {
//        BDDStyledMethod.RequisicaoPostCadastrarPessoaSemNomes();
    }

    @And("^a mensagem \"([^\"]*)\"$")
    public void aMensagem(String arg0) throws Throwable {

    }

    @When("^eu faço um requisição POST para o serviço de cadastrar Pessoa sem passar CPF$")
    public void euFaçoUmRequisiçãoPOSTParaOServiçoDeCadastrarPessoaSemPassarCPF() {
    }

    @When("^eu faço um requisição POST para o serviço de cadastrar Pessoa sem passar DDD e Telefone$")
    public void euFaçoUmRequisiçãoPOSTParaOServiçoDeCadastrarPessoaSemPassarDDDETelefone() {
    }

}

