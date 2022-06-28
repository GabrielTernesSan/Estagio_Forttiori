# Sprints

## Sprint 1

### Git / GitLab

- Criar repositorio remoto
- Conceito de  Issues
- Conceito de Milestones
- Git Ignore
- Comandos básicos do git
- Resolução de conflitos em merge
- Git Stash
- Git cherry pick
- Git Rebase
- Diferença entre o Merge e o Rebase

### Básicos Java   

- Object Oriented Programming (OOP)
- Construtores
- Getter e Setter
- Controle de acessos (public, private, protected)
- static
- final
- Heranca
- Polimorfismo
- Classes Abstratas
- Interface
- Enum
- Polimorfismo de sobrecarga / sobreposição
- Upcasting
- Downcasting
- Static, uso na herança, com metodo statico, com atributo statico, como funciona.
- Final, na herança, no metodo, no atributo, na classe, como funciona.
- O java aceita múltiplas heranças?
- O java aceita múltiplas implementações de uma interface uma uma classe?

## Sprint 2

### Estruturas de dados (List, Map, HashMap, set, stack, queue) 

- Equals e hashCode
- Conceitos de Lista, Fila, e Pilha
- Implementações e metodos das Interfaces 
  - List
    - Diferenças entre ArrayList e LinkedList
  - Queue
  - Set
    - Diferenças entre LinkedHashSet, HashSet e TreeSet
  - Map 
    - Diferenças entre HashMap, LinkedHashMap e TreeMap

Criar uma coleção com um milhão de elementos para cada estrutura de dados avaliando avaliando performance de:  

- Busca de um elemento
- Inserção de um elemento no meio da coleção
- Inserção no inicio e no final da coleção
- Remoção de todos elementos  da coleção
- Remoção de um elemento no meio da coleção
- Performance nos metodos add, remove, get e set
- Elementos duplicados
- Espaço inicial e maximo 

###  Novas funcionalidades das versões 8  do Java na prática

- Interfaces Funcionais
- Lambda
- Generics ([https://www.youtube.com/watch?v=vqjA6dqugq8](https://www.youtube.com/watch?v=vqjA6dqugq8))
- Wildcards ([https://www.youtube.com/watch?v=do-mETsgox8&t=1513s](https://www.youtube.com/watch?v=do-mETsgox8&t=1513s))
- Optional ([https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1](https://medium.com/@racc.costa/optional-no-java-8-e-no-java-9-7c52c4b797f1))
- Streams
- API DE DATAS ([https://www.baeldung.com/java-datetimeformatter](https://www.baeldung.com/java-datetimeformatter))
  - Time zone
- Protolo HTTP
  - Request methods
    - Header
    - user-agent
    - cookies
    - enconding
    - Media type
  - Body
  - Path Variable
  - Query Param

## Sprint 3

- Lombok([http://stevenmwesigwa.com/tutorials/project-lombok/1/introduction-to-project-lombok](http://stevenmwesigwa.com/tutorials/project-lombok/1/introduction-to-project-lombok)) 
          @Data 
          @Builder 
          @SuperBuilder
          @AllArgsCnstructor 
          @NoArgsConstructor 

- Criando primeira API com Spring MVC e Gradle no Spring Initializr
- Criar API conectando em um banco Mongo DB com Spring Data(https://start.spring.io/) 
  - Desenvolver 1 operação de cadastro (POST) de produtos 
  - Desenvolver 1 operação de atualização (PUT) de produtos 
  - Desenvolver 1 operação de busca (GET) de produtos 
  - Desenvolver 1 operação de delete (DELETE) de produtos 
  - Desenvolver 1 operação de delete que exclua objetos por um ou mais id 
  - Desenvolver 1 operação que receba um Cookie simples 
- Tratar erros com @ExceptionHandlers
- Versionamento
- Serialização e desserialização de datas com Jackson no formato ISO (https://www.baeldung.com/spring-boot-formatting-json-dates)

## Sprint 4

- Consumir APIs Externa 

- Test unitarios com J-Unit 5 
  - Criar testes automatizados para a API com banco em memória (Mongo Embedded)
- Criar documentação para a API com Swagger

## Sprint 5

- Spring Cloud Config 
- S.O.L.I.D 
- Design Patterns 
  - Builder  
  - Facade 
  - Decorator 
  - Strategy 
  - Observer
- Converter api para WebFlux
- Diferença entre Spring MVC e WebFlux

## Sprint 6

- Angular CLI
- Ciclo de vida da AP
- Componentes
- Data Binding
- Diretivas
- Modulos
- Rotas
- Proteção de Rotas
- @Input
- @Output
- Pipes
- Eventos
- Operador de Navegação Segura
- Formulários
- Angular Material

## Sprint 7

- Interceptor
- resolver
- Integração com api  BackEnd

## Sprint 8

- Gradle(Multimodulos)
  - plugins( para que servem, e o que impactam no projeto)        - tasks( fazer um task)
  - settings.gradle ( o que é esse arquivo no projeto , e como funciona)
  - build.gradle( o que é esse arquivo no projeto, e como funciona) 
- Estudar o que são e para que servem as configurações abaixo no arquivo build.radle:
  - repositories {}
  - configurations {}
  - plugin {}
  - dependencies {}
  - compile vs implementation
  - compileOnly
  - runtimeOnly
  - implementation{}
  - testCompileOnly
  - testRunTimeOnly
  - testImplementation

## Sprint 9

- Criando Jobs- Spring Scheduler
  - Spring Batch
  - Caching
  - Criar um Job com Spring Batch para popular a base dados da API criada na 2 sprint com itens (inserir dados via API)

## Sprint 10

- Redux
- NgRx

## Sprint 11 

- Auth 2 
- Spring Security 
- KeyCloak 
- proteger uma rota especifica da API

## Sprint 12

- Autenticação com backend via Keycloak
- Refresh token
- Angular Guard