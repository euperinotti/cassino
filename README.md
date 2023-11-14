# Cassino

Aplicação que simula um sistema de cassino utilizando SpringBoot e React

## Backend

O backend do sistema consiste em uma API responsável por se comunicar com o banco de dados e fazer o controle do consumo dos dados.

Para utilizar devidamente desse sistema, é necessário fazer a instalação do banco de dados [PostgreSQL](https://www.postgresql.org/)
Após isso é necessário executar o arquivo `schema.sql`, que está dentro da pasta `resources`, no software de gerenciamento de banco de dados de sua preferência para que o banco seja inicializado.

Depois basta iniciar a aplicação utilizando o SpringBoot.

A aplicação será inicializada na porta `8080` padrão

### Controllers e Rotas
Os controllers consistem em entidades que recebem um repository para fazer a persistência de dados e rotas que indicam qual operação o usuário deseja fazer.

Você pode ter acesso as rotas da api apartir do link a baixo: 

[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://app.getpostman.com/run-collection/24852368-52801c98-f39d-44b4-8a33-b73087aa4ec8?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D24852368-52801c98-f39d-44b4-8a33-b73087aa4ec8%26entityType%3Dcollection%26workspaceId%3Db8bf9bc4-165f-4ee1-a8e3-5dfd8c2699a8)

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

Ficha
```java
@RestController
@RequestMapping("ficha")
public class FichaController {
  @Autowired
  IContaRepository repository;

  @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> comprar(@RequestBody ComprarFicha entity) {
    ContaDTO conta = ContaMapper.toDTO(repository.getReferenceById(entity.getIdConta()));
    conta.adicionarFicha(entity.getQuantidade());
    ContaDTO response = ContaMapper.toDTO(repository.save(ContaMapper.toBO(conta)));

    return ResponseEntity.ok(response);
  }
}
```

Jogo
```java
@RestController
@RequestMapping("jogo")
public class JogoController {
  @Autowired
  IJogoRepository repository;

  @Autowired
  ICartaRepository cartaRepository;

  @Autowired
  IUserRepository userRepository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> registrar(@RequestBody RegistrarJogo entity) {
    UserDTO usuario = UserMapper.toDTO(userRepository.findById(entity.getIdUsuario()).get());
    CartaDTO carta = CartaMapper.toDTO(cartaRepository.findById(entity.getIdCarta()).get());
    
    if (carta.getTipo()) {
      usuario.getConta().ganhouDinheiro(carta.getValor());
      usuario.getConta().subtrairFicha();
    } else {
      usuario.getConta().perdeuDinheiro(carta.getValor());
      usuario.getConta().subtrairFicha();
    }

    userRepository.save(UserMapper.toBO(usuario));

    return ResponseEntity.ok(repository.save(new JogoBO(null, UserMapper.toBO(usuario), CartaMapper.toBO(carta))));
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<JogoBO> users = repository.findAll();
    return ResponseEntity.ok(users);
  }
}

```

Carta
```java
@RestController
@RequestMapping("carta")
public class CartaController {
  @Autowired
  ICartaRepository repository;

  @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> cadastrar(@RequestBody CartaDTO entity) {
    return ResponseEntity.ok(repository.save(CartaMapper.toBO(entity)));
  }

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> buscarTodos() {
    List<CartaBO> cartas = repository.findAll();
    return ResponseEntity.ok(cartas);
  }
}

```

## Frontend

O frontend do sistema consiste em uma aplicação `React` feita com `Vite`

Para inicilizar é necessário rodar `yarn install` ou `npm install` para instalar todos os pacotes necessários, em seguida `yarn dev` para executar a aplicação em mode de desenvolvimento.

O frontend utiliza da biblioteca `axios` para chamados ao backend, portanto é necessário que os dois serviços estejam rodando simultaneamente

O frontend da aplicação roda na porta `5173`