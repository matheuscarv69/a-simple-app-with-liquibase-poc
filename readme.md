#  Liquibase commands

### Descrição do comando

O comando na linha 6 executa um rollback no banco de dados utilizando o Liquibase. Ele reverte a última alteração aplicada ao banco de dados, com base no arquivo de changelog especificado.

#### Detalhes do comando:
- **`mvn liquibase:rollback`**: Executa o comando de rollback do Liquibase.
- **`-Dliquibase.changeLogFile=src/main/resources/db/changelog/db.changelog-master.yaml`**: Especifica o arquivo de changelog principal que contém o histórico de alterações.
- **`-Dliquibase.rollbackCount=1`**: Define que será revertida apenas a última alteração (1 changeSet).
- **`-Dliquibase.username=user`**: Informa o nome de usuário para conexão com o banco de dados.
- **`-Dliquibase.password=password`**: Informa a senha para conexão com o banco de dados.

#### Contexto:
Este comando é útil para desfazer alterações no banco de dados de forma controlada, especialmente em ambientes de desenvolvimento ou testes, onde é necessário reverter mudanças específicas.

### Exemplo de execução do comando

```bash
mvn liquibase:rollback -Dliquibase.changeLogFile=src/main/resources/db/changelog/db.changelog-master.yaml -Dliquibase.rollbackCount=1 -Dliquibase.username=user -Dliquibase.password=password 
```

