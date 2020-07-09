Feature:
  Consultar Dados de Cadastro de Pessoas

  Scenario:  Consultar Pessoa por telefone e DDD cadastrados
    When eu faço um requisição GET para o serviço de consultar Pessoa"
    Then deve me retornar o status "200"
    And   retorna os dados da pessoa


  Scenario: Consultar Pessoa por Telefone
    When eu faço um requisição GET para o serviço de consultar Pessoa passando telefone
    Then deve me retornar o status "400"



  Scenario: Consultar Pessoa por DDD
    When eu faço um requisição GET para o serviço de consultar Pessoa passando DDD
    Then deve me retornar o status "400"



  Scenario: Consultar Pessoa por Telefone e DDD não cadastrado
    When eu faço um requisição GET para o serviço de consultar Pessoa passando dados invalidos
    Then deve me retornar o status "400"