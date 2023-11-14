# Cassino

Aplicação que simula um sistema de cassino utilizando SpringBoot e React

## Utilização

Para utilizar devidamente desse sistema, é necessário fazer a instalação do banco de dados [PostgreSQL](https://www.postgresql.org/)
Após isso é necessário executar o arquivo `schema.sql` que está dentro da pasta `resources` para que o banco seja inicializado.
Depois basta iniciar a aplicação utilizando o SpringBoot.

A aplicação será inicializada na porta 8080 padrão

## Backend

O backend do sistema consiste em uma API responsável por se comunicar com o banco de dados e fazer o controle do consumo dos dados.

### Controllers

Os controllers consistem em entidades que recebem um repository para fazer a persistência de dados e rotas que indicam qual operação o usuário deseja fazer.

- Usuario
  - Métodos: GET, POST, PUT
- Conta
  - Métodos: GET, POST, PUT
- Ficha
  - Métodos: GET, POST
- Jogo
  - Métodos: GET, POST
- Compra
  - Métodos: GET, POST

### Controllers e Rotas
Usuario:
```java

@RestController
@RequestMapping("user")
public class UserController {

  @Autowired
  IUserRepository repository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> cadastrar(@RequestBody UserDTO entity) {
    repository.save(UserMapper.toBO(entity));
    UserBO user = repository.findByNome(entity.getNome());
    return ResponseEntity.ok(user);
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<UserBO> users = repository.findAll();
    return ResponseEntity.ok(users);
  }

  @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE, path = "/{id}")
  public ResponseEntity<Object> deletar(@PathVariable(value = "id") Long id) {
    repository.deleteById(id);
    return ResponseEntity.ok("Usuário deletado");
  }
}

```

Conta
```java

```

Ficha
```java

```

Jogo
```java

```

Carta
```java

```

## Frontend

O frontend do sistema consiste em uma aplicação `React` feita com `Vite`

Para inicilizar é necessário rodar `yarn install` ou `npm install` para instalar todos os pacotes necessários, em seguida `yarn dev` para executar a aplicação em mode de desenvolvimento.

O frontend utiliza da biblioteca `axios` para fazer o trafego de dados do backend em Spring, portanto é necessário que os dois serviços estejam rodando simultaneamente