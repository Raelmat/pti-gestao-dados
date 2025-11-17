# 🎓 PTI - Gestão de Dados Universitários

Sistema desenvolvido para o Projeto Integrador, focado na gestão e organização de dados da universidade. O repositório reúne documentação, protótipos, diagramas e código utilizado no desenvolvimento da solução.

---

## 📋 Sobre o Projeto

Este projeto visa desenvolver um sistema integrado para gestão de dados universitários, contemplando cadastros de pessoas físicas, jurídicas, professores, fornecedores e alunos, conforme modelagem definida na primeira fase do PI.

---

## 👥 Equipe de Desenvolvimento

| Responsável | GitHub |
|-------------|---------|
| Israel Felipe Chaves da Silva | @Raelmat |
| Kayque Pardim dos Santos | [@github] |
| Marcus Vinícius Campos Machado | [@github] |
| Nathan de Sales Messias | @NathanosPregui |
| Robson Silva de Pinho | [@github] |

---

## 🎯 Funcionalidades Principais

- ✅ **Cadastro de Pessoa Física**
- ✅ **Cadastro de Pessoa Jurídica** 
- ✅ **Cadastro de Professores**
- ✅ **Cadastro de Fornecedores**
- ✅ **Cadastro de Alunos**

---

## 📊 Diagramas da Modelagem

### 📌 Diagrama de Casos de Uso 
![Diagrama de Casos de Uso](./docs/diagrama-casos-uso.png)

```mermaid
graph TD
    style Administrador fill:#ffebee
    style Secretario fill:#e8f5e8
    style Professor fill:#e3f2fd
    style Aluno fill:#fff3e0
    style Fornecedor fill:#f3e5f5
    
    Administrador["Administrador"] --> CadastroProfessores
    Administrador --> CadastroAlunos
    Administrador --> CadastroFornecedores
    Administrador --> CadastroPF
    Administrador --> CadastroPJ
    
    Secretario["Secretário(a)"] --> CadastroProfessores
    Secretario --> CadastroAlunos
    
    Professor["Professor(a)"] --> CadastroAlunos
    
    Aluno["Aluno"] --> CadastroAlunos
    
    Fornecedor["Fornecedor"] --> CadastroFornecedores
    
    CadastroProfessores -.->|<<include>>| CadastroPF
    CadastroAlunos -.->|<<include>>| CadastroPF
    CadastroFornecedores -.->|<<include>>| CadastroPJ
    
    subgraph "Sistema de Gestão Universitária"
        CadastroPF["Cadastro de Pessoa Física"]
        CadastroPJ["Cadastro de Pessoa Jurídica"]
        CadastroProfessores["Cadastro de Professores"]
        CadastroAlunos["Cadastro de Alunos"]
        CadastroFornecedores["Cadastro de Fornecedores"]
    end
    
    %% Estilo das setas
    linkStyle 8,9,10 stroke:#ff6b6b,stroke-width:2px,stroke-dasharray: 5 5
    linkStyle 0,1,2,3,4,5,6,7 stroke:#2e86ab,stroke-width:2px
```

## 📘 Diagrama de Classes – Gestão de Dados Universitária
![Diagrama de Classes](./docs/diagrama-classes.png)

```mermaid
classDiagram
    %% Entidade Base
    class Perfil {
        <<Abstract>>
        #String Nome
        #String Endereco
        #String Telefone
        #String Email
        +Cadastro() void
    }

    %% Especializações de Perfil
    class PessoaFisica {
        <<Abstract>>
        #String CPF
        #String RG
        #Date DataNasci
        #String Sexo
        #String Matricula
    }

    class PessoaJuridica {
        <<Abstract>>
        #String CNPJ
        #String InscriEstadual
        #String NoFantasia
        #String RepreLegal
    }

    %% Classes Administrativas
    class Adm {
        -String Senha
        +CadastrarFornecedor() void
        +CadastrarPessoaFisica() void
    }

    class Funcionario {
        <<Abstract>>
        #String RegistroPro
    }

    %% Especializações de Funcionário
    class Professor {
        -String Formacao
        -String Disciplina
        +Professor()
        +VerNotas() void
        +VerFrequencia() void
        +AlterarNota() void
    }

    class Secretario {
        +CadastrarAluno() void
        +CadastrarProfessor() void
    }

    %% Demais Entidades
    class Aluno {
        -String Curso
        -String Serie
        -String Turma
        -String HistoricoEscolar
        +Aluno()
        +VerNotas() void
        +VerFrequencia() void
    }

    class Fornecedor {
        -String Contato
        -String Produto
        -String Servicos
        -String PagamentoCondi
        +CadastrarProduto() void
        +RemoverProduto() void
        +ListarProdutos() void
        +EditarProduto() void
    }

    %% Hierarquia de Herança
    Perfil <|-- PessoaFisica
    Perfil <|-- PessoaJuridica
    Perfil <|-- Adm
    
    PessoaFisica <|-- Funcionario
    PessoaFisica <|-- Aluno
    
    Funcionario <|-- Professor
    Funcionario <|-- Secretario
    
    PessoaJuridica <|-- Fornecedor
```
## 📱 Telas Principais

Aqui estão as principais interfaces desenhadas no projeto:

 

## 🔒 TELA DE LOGIN <img width="1920" height="1080" alt="Faculdade Sistema (1)" src="https://github.com/user-attachments/assets/6fbf6045-97d7-4b2f-b035-e10323b3179c" />

## 🏠 TELA HOME <img width="1920" height="1080" alt="Admin Dashboard (1)" src="https://github.com/user-attachments/assets/671d9c32-d0c1-4d4d-bbe1-ae2c0eec41b2" />

## 👤 TELA PERFIL <img width="1920" height="1080" alt="Admin Dashboard 2" src="https://github.com/user-attachments/assets/fbfccde7-1e83-44fe-bcf6-9c33a0663833" />

## 🛠️ Como visualizar este projeto

1. Acesse o link do protótipo navegável: [**🔗 Clique aqui para ver no Figma**](https://www.figma.com/design/ry2DuZIYmvmNpmPkfl0Cmz/Untitled?node-id=1-300&t=ATJYSIwsVrCSXU4v-1)
2. Navegue entre as telas clicando nos hotspots interativos.
3. Utilize o modo "Comentários" (tecla C) se quiser deixar feedback.

---

## 🤝 Contribuição

Este projeto foi desenvolvido para fins de estudo/trabalho. Sinta-se à vontade para duplicar o arquivo e explorar as camadas.

---
