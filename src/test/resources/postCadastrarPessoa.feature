Feature: Cadastrar uma Pessoa

  Scenario: Cadastrar uma Pessoa
    When eu faço um requisição POST para o serviço de cadastrar Pessoa
    Then  deve me retornar o status "201"
    And   retorna os dados da pessoa criado

  Scenario: Cadastar uma Pessoa com um CPF já cadastrado
    When eu faço um requisição POST para o serviço de cadastrar Pessoa
    And   informo nessa requisão o "numerodoCPF"
    Then  deve me retornar o status "400"
    And a mensagem "Já existe pessoa cadastrada com o CPF "numerodoCPF""

  Scenario: Cadastrar um Pessoa com DDD e Telefone já cadastrado
    When eu faço um requisição POST para o serviço de cadastrar Pessoa
    And informo nessa requisição o "telefone"
    Then deve me retornar o status "400"
    And  a mensagem "Já existe pessoa cadastrada com o Telefone "telefone""


  Scenario: Cadastrar uma Pessoa sem Nome
    When eu faço um requisição POST para o serviço de cadastrar Pessoa sem passar Nome
    Then deve me retornar o status "400"
    And   a mensagem "O Campo Nome e obrigatorio"

  Scenario: Cadastrar uma Pessoa sem CPF
    When eu faço um requisição POST para o serviço de cadastrar Pessoa sem passar CPF
    Then deve me retornar o status "400"
    And   a mensagem "O Campo CPF e obrigatorio"

  Scenario: Cadastrar uma Pessoa sem DDD e Telefone
    When eu faço um requisição POST para o serviço de cadastrar Pessoa sem passar DDD e Telefone
    Then deve me retornar o status "400"
    And   a mensagem "O Campo DDD e Telefone e obrigatorio"



