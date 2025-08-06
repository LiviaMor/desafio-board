## Board de Tarefas em Java — GFT Start #7

Aprenda a criar um **board de tarefas** completo em Java, passando por todas as etapas do desenvolvimento — desde o planejamento e estruturação até a implementação de funcionalidades como gerenciamento de dados, integração entre camadas e uso de boas práticas de programação.

Este projeto foi desenvolvido como parte do programa **GFT Start #7**, utilizando **Java 21**, **MySQL** e ferramentas modernas do ecossistema Java.

---

### 🚀 Objetivos do Projeto

- Criar uma aplicação Java para gerenciamento de tarefas
- Aplicar boas práticas de arquitetura (camadas, DTOs, serviços)
- Integrar com banco de dados MySQL usando JDBC e Liquibase
- Utilizar ferramentas como Lombok para reduzir boilerplate
- Aprender sobre versionamento de banco e testes automatizados

---

### 🛠️ Tecnologias Utilizadas

| Tecnologia        | Finalidade                          |
|-------------------|--------------------------------------|
| Java 21           | Linguagem principal                  |
| Maven             | Gerenciador de dependências          |
| MySQL             | Banco de dados relacional            |
| Liquibase         | Versionamento de banco de dados      |
| Lombok            | Redução de código repetitivo         |


---

### 📦 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com/scarlet/board/
│   │       ├── dto/
│   │       ├── exception/
│   │       ├── persistence/
│   │       ├── service/
│   │       └── ui/
│   └── resources/
│       └── db/changelog/
│           └── migrations/
│           └── db.changelog-master.xml
└── test/
    └── java/
└── pom.xml
        
```

---

### ⚙️ Como Executar

1. **Clone o repositório**
   ```bash
   git clone [https://github.com/LiviaMor/desafio-board]
   cd board-java
   ```

2. **Configure o banco de dados MySQL**
   - Crie um banco chamado `board_db`
   - Atualize as credenciais no arquivo de configuração (ex: `liquibase.properties` ou diretamente no código JDBC)

3. **Compile e execute o projeto**
   ```bash
   mvn clean install
   mvn exec:java
   ```

---

### 📌 Funcionalidades

- ✅ Criar, listar, atualizar e excluir tarefas
- ✅ Organizar tarefas por status (pendente, em andamento, concluída)
- ✅ Persistência com MySQL
- ✅ Versionamento de banco com Liquibase

---

### 📚 Aprendizados

- Estruturação de projetos Java em camadas
- Integração com banco de dados relacional
- Uso de ferramentas modernas como Lombok e Liquibase
- Boas práticas de programação e testes automatizados

---

