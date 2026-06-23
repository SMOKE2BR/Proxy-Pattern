# Proxy Pattern - Java

Este projeto demonstra o uso do **padrão de projeto Proxy** em Java, aplicado a um sistema de relatórios acadêmicos com controle de acesso.

## 📌 Estrutura


  ***DIAGRAMA DE CLASSES***

  
<img width="2721" height="2015" alt="603127012-262b0945-923b-4857-a5ff-3f1a0d84272b" src="https://github.com/user-attachments/assets/e8dee953-f178-411b-b03b-c3e10c6455d8" />


- **Interface**
  - `IRelatorio` → define os métodos para obter nome do aluno e suas notas.

- **Classe concreta**
  - `Relatorio` → representa o relatório real, contendo nome do aluno e lista de notas.

- **Proxy**
  - `RelatorioProxy` → controla o acesso ao relatório.  
    Apenas usuários que são professores podem visualizar as notas.

- **Classe**
  - `Usuario` → representa um usuário do sistema, com nome e flag indicando se é professor.

- **Classe de execução**
  - `Main` → instancia relatórios e usuários, demonstrando o controle de acesso via proxy.

## 🚀 Como executar

1. Abra o projeto no **IntelliJ IDEA**.
2. Certifique-se de que os arquivos estão em `src/proxy`.
3. Execute a classe `Main`.

## 💻 Saída esperada

Aluno: Vinícius
Notas (professor): [8, 9, 10]
Acesso negado: apenas professores podem visualizar as notas.


## 🎯 Objetivo

O padrão **Proxy** fornece um substituto ou representante para outro objeto, controlando o acesso a ele.  
Neste exemplo, o `RelatorioProxy` garante que apenas professores possam acessar as notas dos alunos, protegendo informações sensíveis.
