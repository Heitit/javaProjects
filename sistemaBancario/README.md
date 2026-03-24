# Sistema Bancário - Praticando POO

Este projeto foi desenvolvido como parte dos meus estudos em Java para consolidar conceitos fundamentais de **Programação Orientada a Objetos (POO)**. O foco principal foi a segurança dos dados (Encapsulamento) e a flexibilidade na criação de objetos (Sobrecarga).

## Funcionalidades
- **Abertura de Conta:** Permite criar uma conta informando número e titular, com a opção de realizar ou não um depósito inicial.
- **Depósito:** Atualização do saldo de forma segura.
- **Saque:** Realização de retiradas com aplicação automática de uma taxa de serviço (R$ 5,00).
- **Exibição de Dados:** Formatação dos dados da conta e saldo com duas casas decimais.

## Conceitos Aplicados
- **Encapsulamento:** Os atributos `numero`, `titular` e `saldo` são privados (`private`). O saldo só pode ser alterado através dos métodos de depósito e saque, garantindo a integridade da conta.
- **Sobrecarga de Construtores:** Implementação de dois construtores para permitir diferentes formas de iniciar a classe `Conta`.
- **Getters e Setters:** Uso estratégico de métodos de acesso. O número da conta, por exemplo, possui apenas *Getter*, pois não deve ser alterado após a criação.
- **Lógica de Negócio:** Centralização das regras de taxas dentro da própria entidade.

## Estrutura do Projeto
- `src/entities/conta.java`: Classe que contém os atributos, construtores e a lógica de negócio.
- `src/application/sistema.java`: Classe principal que gerencia a entrada de dados via console e a interação com o usuário.

## Tecnologias
- **Java 25** (JDK)
- **Eclipse IDE**
- **Git/GitHub** para controle de versão

---
*Projeto desenvolvido por Heitor Antonio - Estudante de ADS*
