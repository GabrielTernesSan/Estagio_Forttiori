## Bibliotecas

Bibliotecas são códigos pré-definidos para uso em aplicações. É uma coleção de recursos usados por programas de computador. Podem incluir: 

- Dados de configuração;
- Documentação;
- Procedimentos;
- Classes;
- Funções;
- Templates;
- Especificações.

As bibliotecas tem como objetivo agilizar o desenvolvimento, implementar o reúso de código, diminuir a ocorrência de erros etc. Temos bibliotecas padrão, aquelas que já vem com a IDE como a java.util, java.io e a java.lang, e temos as bibliotecas externas que necessitam ser importadas para a aplicação.

## Gradle

Ferramenta de build é um sistema que permite automatizar todas as tarefas rotineiras de um projeto de uma forma organizada e que evite que o desenvolvedor tenha que perder tempo.

Em outras palavras, adicionar uma nova biblioteca, realização de testes, empacotamento e deploy, ou até mesmo, a compatibilidade entre as diversas IDEs são tarefas facilmente resolvidas com uma build tool, ou seja, ao invés de você desenvolvedor se responsabilizar por todos esses passos, as build tools farão isso pra você!

O Gradle não é apenas uma build tool, ele é considerado como um build system (sistema de construção), justamente por disponibilizar diversas features de build para o desenvolvedor de forma padronizada e de fácil uso.

## Lombok

O Lombok é uma biblioteca Java focada em produtividade e redução de código boilerplate[^*] que por meio de anotações adicionadas ao nosso código ensinamos o compilador (maven ou gradle) durante o processo de compilação a criar código Java.

### Annotations

#### @Getter e @Setter

Essas anotações são reposnsáveis por gerar os getters e os setters da aplicação. Temos algumas formas de utilizá-la:

- Anotação no atributo

  ````java
  import lombok.Getter;
  import lombok.Setter;
  
  public class Cliente{
      @Getter 
      @Setter 
      private String nome;
      private String sobrenome;
  }
  ````

  Com a anotação no atributo nós geramos o Getter e o Setter somente do "nome".

- Anotação na classe

  ```java
  import lombok.Getter;
  import lombok.Setter;
  
  @Getter 
  @Setter  
  public class Cliente{
      private String nome;
      private String sobrenome;
  }
  ```

  Com a anotação na classe nós geramos os Getters e o Setterr de todos os atributos

- Podemos não gerar os métodos de atributos específicos

  ```java
  import lombok.Getter;
  import lombok.Setter;
  import lombok AccessLevel;
  
  @Getter 
  @Setter  
  public class Cliente{
      private String nome;
      private String sobrenome;
      @Setter(value = AccessLevel.NONE)
      private Double saldo;
  }
  ```

- Podemos definir niveis de acesso

  ```java
  import lombok.Getter;
  import lombok.Setter;
  import lombok AccessLevel;
  
  @Getter 
  @Setter  
  public class Cliente{
      private String nome;
      private String sobrenome;
      @Getter(value = AccessLevel.PRIVATE)
      private Double saldo;
  }
  ```

  #### @ToString

  Uma outra anotação muito útil é a @ToString que é resposável por reescrever o método toString do Java

  - Assim como as anotações anteriores nós podemos por a anotação no nível da classe, que gerará um método com todos os atributos

    ```java
    import lombok.Getter;
    import lombok.Setter;
    import lombok.ToString;
    
    @ToString
    @Getter 
    @Setter  
    public class Cliente{
        private String nome;
        private String sobrenome;
        private Double saldo;
    }
    // Cliente(nome=Gabriel , sobrenome=Santos, saldo=759,24)
    ```

  - Ou podemos especificar quais atributos irão compor o método

    ```java
    import lombok.Getter;
    import lombok.Setter;
    import lombok.ToString;
    
    @ToString
    @Getter 
    @Setter  
    public class Cliente{
        private String nome;
        private String sobrenome;
        @ToString.Exclude
        private Double saldo;
    }
    // Cliente(nome=Gabriel , sobrenome=Santos)
    ```

    ```java
    import lombok.Getter;
    import lombok.Setter;
    import lombok.ToString;
    
    @ToString(onlyExplicitlyIncluded = true)
    @Getter 
    @Setter  
    public class Cliente{
        
        @ToString.Include
        private String nome;
        private String sobrenome;
        @ToString.Include
        private Double saldo;
    }
    // Cliente(nome=Gabriel , saldo=759,24)
    ```

  #### @EqualsAndHashCode

  Essa anotação é reponsável por reescrever os métodos `equals` e `hashCode` 

  ```java
  import lombok.EqualsAndHashCode;
  
  @EqualsAndHashCode
  public class Cliente{
      private String nome;
      private String sobrenome;
      private Double saldo;
  }
  ```

  ```java
  import lombok.EqualsAndHashCode;
  
  @EqualsAndHashCode(onlyExplicitlyIncluded = true)
  public class Cliente{
      @EqualsAndHashCode.Include
      private String nome;
      private String sobrenome;
      private Double saldo;
  }
  ```

  #### @AllArgsConstructor
  
  ​	Essa anotação fica responsável por gerar um construtor com todos os argumentos da classe
  
  ```java
  import lombok.AllArgsConstructor;
  
  @AllArgsConstructor
  public class Cliente{
      private String nome;
      private String sobrenome;
      private Double saldo;
  }
  ```
  
  #### @NoArgsConstructor
  
  Também temos a anotação @NoArgsConstructor que cria um construtor sem nenum argumento
  
  ````java
  import lombok.NoArgsConstructor;
  
  @NoArgsConstructor
  public class Cliente{
      private String nome;
      private String sobrenome;
      private Double saldo;
  }
  ````
  
  Também temos a opção de termos as duas anotações na classe
  
  ```java
  import lombok.NoArgsConstructor;
  import lombok.AllArgsConstructor;
  
  @AllArgsConstructor
  @NoArgsConstructor
  public class Cliente{
      private String nome;
      private String sobrenome;
      private Double saldo;
  }
  ```
  
  #### @RequiredArgsConstructor
  
  Temos mais uma opção para anotações construtoras que é a @RequiredArgsConstructor que gerará um construtor apenas com os argumentos obrigatórios. Para especificarmos que um argumento é obrigatório nós usamos a anotação @NonNull do Lombok.
  
  ```java
  import lombok.RequiredArgsConstructor;
  
  @RequiredArgsConstructor
  public class Cliente{
      @NonNull
      private String nome;
      private String sobrenome;
      private Double saldo;
  }
  ```
  
  Essas duas anotações trabalham em conjunto para gerar um construtor com os argumentos que possuem a anotação @NonNull.

### @Data

A anotação @Data engloba 5 anotações, são elas,  `@ToString`, `@EqualsAndHashCode`, `@Getter`, `@Setter` e `@RequiredArgsConstructor`. E assim como nessas anotações podemos fazer alterações das mesmas que a anotação @Data engloba, por exemplo:

```java
import lombok.Data;

@Data
public class Cliente{
    private String nome;
    private String sobrenome;
    @Setter(value = AccessLevel.NONE)
    private Double saldo;
}
```

## Padrão de projeto builder

Quando temos objetos com um construtor muito grande, ou seja, com muitos argumentos nós acabamos ficando com instaciações "feias", imagine que eu tenha uma classe `Pessoa`e esta tenha vários atributos mas esses atributos dependem de funções, loops, etc; então eu teria algo como isso:

```java
Pessoa pessoa1 = new Pessoa("Gabriel", "Santos", 21, 1.82);
```

Mas esses não são todos os meus argumentos, então ao imprimir esse código ficaria algo como `Pessoa(nome=Gabriel, sobrenome=Santos, idade=21, altura=1.82, profissao=null, endereço=null)`.

O **Builder** é um padrão de projeto criacional que permite a você construir objetos complexos passo a passo. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

O padrão Builder sugere que você extraia o código de construção do objeto para fora de sua própria classe e mova ele para objetos separados chamados *builders*.

#### @Builder

Essa anotação cria uma nova classe com base no padrão de projeto Builder. Então ao utilizar essa anotação nós podemos usar os métodos da classe builder.

```java
import lombok.Builder;

@Builder
public class Pessoa{
    private String nome;
    private String sobrenome;
    private Double altura;
    private Double peso;
    private String profissao;
    private Integer idade;
    private String endereco;
}
```

```java
public class Teste{
    public static void main(String[] args){
        Pessoa pessoa = Pessoa.builder()
            .nome("Gabriel")
            .sobrenome("Santos")
            .idade(21)
            .build()
    }
}
```

Após isso com o método `build()` ele retorna uma instância da classe criada.

#### @SuperBuilder

Ao contrário do @Builder, o @SuperBuilder também trabalha com campos de superclasses. No entanto, ele só funciona para tipos. Mais importante, requer que todas as superclasses também tenham a anotação @SuperBuilder.

```java
import lombok.SuperBuilder;

@SuperBuilder
public class Pessoa{
    private String name;
    private String surname;
    private Double altura;
    private Double peso;
    private String profissao;
    private Integer idade;
    private String endereco;
}
```

```java
import lombok.SuperBuilder;

@SuperBuilder
public class Aluno extends Pessoa{
   private String matricula;
   private Integer cadeiras;
}
```

```java
public class Programa {
    public static void main(String[] args) {
        Aluno aluno = Aluno.builder()
                .name("Gabriel")
                .surname("Santos")
                .idade(45)
                .altura(1.81)
                .matricula(202112216)
                .cadeiras(5)
                .build();

        System.out.println(client);
    }
```

## MongoDB

É um banco de dados opensource, de alta performance e flexível, sendo considerado o principal banco de dados NoSQL. Os banco de dados NoSQL apresentam algumas vantagens sobre os outros tipos, principalmente quando precisamos de escalabilidade, flexibilidade, bom desempenho e facilidade para consultas.

O MongoDB é orientado a documentos, ou seja, os dados são armazenados como documentos, ao contrário de bancos de dados de modelo relacional, onde trabalhamos com registros em linhas e colunas. Os documentos podem ser descritos como dados no formato de chave-valor, no caso, utilizando o formato JSON (JavaScript Object Notation).

## Padrão MVC

O MVC é uma sigla do termo em inglês Model (modelo) View (visão) e Controller (Controle) que facilita a troca de informações entre a interface do usuário aos dados no banco, fazendo com que as respostas sejam mais rápidas e dinâmicas.

É um padrão de arquitetura de software responsável por contribuir na otimização da velocidade entre as requisições feitas pelo comando dos usuários.

#### Model

Sua responsabilidade é gerenciar e controlar a forma como os dados se comportam por meio das funções, lógica e regras de negócios estabelecidas. Ele é o detentor dos dados que recebe as informações do Controller, válida se ela está correta ou não e envia a resposta mais adequada. 

#### Controller

A camada de controle é responsável por intermediar as requisições enviadas pelo View com as respostas fornecidas pelo Model, processando os dados que o usuário informou e repassando para outras camadas.

#### View

Essa camada é responsável por apresentar as informações de forma visual ao usuário. Em seu desenvolvimento devem ser aplicados apenas recursos ligados a aparência como mensagens, botões ou telas. 

Seguindo nosso processo de comparação o View está na linha de frente da comunicação com usuário e é responsável transmitir questionamentos ao controller e entregar as respostas obtidas ao usuário. É a parte da interface que se comunica, disponibilizando e capturando todas as informação do usuário.

## API

A diferença fundamental entre um aplicativo web e uma **API REST** é que a resposta de um aplicativo da web é uma visualização geral de HTML + CSS + JavaScript enquanto a **API REST** apenas retorna dados em forma de JSON ou XML.

### O que são EndPoints?

Um endPoint é uma URL onde seus serviços podem ser acessados por uma aplicação cliente.

![img](https://miro.medium.com/max/592/1*IsjhDM_F2HOvtNL3DKsTwQ.png)

### O que é injeção de dependência?

Injeção de Dependência é um é um padrão de projeto usado para evitar o alto nível de acoplamento de código dentro de uma aplicação. Sistemas com baixo acoplamento de código são melhores pelos seguintes motivos: Aumento na facilidade de manutenção/implementação de novas funcionalidades e também habilita a utilização de mocks para realizar unit testes.

Injeção de dependência é uma das duas maneiras de implementar a inversão de controle. Inversão de controle é um termo mais amplo, onde a responsabilidade de informar a implementação a ser utilizada deixa de ser da classe, e passa a ser do consumidor da classe. A segunda maneira de implementar a IoC seria com Service Locator.

## Controller

No Framework **Spring**, um **Controller** é uma classe responsável pela preparação de um modelo de *Map* com dados a serem exibidos pela *view* e pela escolha da *view* correta. Basicamente ele é o responsável por controlar as requisições indicando quem deve receber as requisições para quem deve responde-las. Também pode mandar diretamente no fluxo do *response* usando a anotação **@ResponseBody** e concluir a solicitação.

### @Controller vs @RestController

A annotation **@RestController** no Spring MVC nada mais é do que uma combinação das annotations **@Controller** e **@ResponseBody**. Nas anotações **@Controller** e **@RestController**. O trabalho do **@Controller** é criar um *Map* do model object e encontrar uma view, mas o **@RestController** simplesmente retorna o objeto e os dados do objeto são gravados diretamente na resposta HTTP como JSON ou XML.

Isso também pode ser feito com o **@Controller** tradicional e o uso da anotação **@ResponseBody**, mas como esse é o comportamento padrão dos serviços **RESTful**, o Spring criou o **@RestController** que combina o comportamento do **@Controller** e do **@ResponseBody**.

O comportamento de escrever diretamente no fluxo do *response* é muito útil para atender chamadas para serviços **RESTful**, porque retornamos somente dados em vez de retornar uma exibição (*view*).

### @RequestMapping

Esta anotação é usada em nível de classe e método. A anotação é usada para mapear solicitações da web para classes manipuladoras especificas e métodos manipuladores. Quando usado em nível de classe, ele cria uma URI de base para o qual o controlador será usado. Quando esta anotação é usada em métodos, ela lhe dará o URI no qual os métodos do manipulador serão executados. A partir disso, você pode inferir que o mapeamento de solicitação de nível de classe permanecerá o mesmo, enquanto cada método de manipulador terá seu próprio mapeamento de solicitação.

### @Autowired

Serve para marcar o ponto de injeção na sua classe. Você pode colocar ela sobre atributos ou sobre o seu construtor com argumentos.

### @GetMapping

Essa anotação é usada para mapear solicitações HTTP GET em métodos manipuladores específicos. @GetMapping é uma anotação composta que atua como um atalho para @ RequestMapping ( method = RequestMethod. GET ).

### @PostMapping

Essa anotação é usada para mapear solicitações HTTP POST em métodos específicos de manipulador. @PostMapping é uma anotação composta que atua como um atalho para @ RequestMapping ( method = RequestMethod. POST ).

### @PutMapping

Essa anotação é usada para mapear solicitações HTTP PUT em métodos manipuladores específicos. @PutMapping é uma anotação composta que atua como um atalho para @ RequestMapping ( method = RequestMethod. PUT ).

### @DeleteMapping

Esta anotação é usada para mapear solicitações HTTP DELETE em métodos manipuladores específicos. @DeleteMapping é uma anotação composta que atua como um atalho para @ RequestMapping ( method =RequestMethod . DELETE ).

### @PathVariable

Esta anotação é usada para anotar os argumentos do método do manipulador de solicitações. A anotação @RequestMapping pode ser usada para manipular alterações dinâmicas no URI, onde determinado valor de URI atua como um parâmetro.

## Service

Pense em classes que representam algum fluxo de negócio da sua aplicação. Por exemplo, um fluxo de finalização de compra envolve atualizar, manipular o carrinho, enviar email, processar pagamento etc. Este é o típico código que temos dificuldade de saber onde vamos colocar, em geral ele pode ficar em um service.

### @Service

Esta anotação é usada em uma classe. O @Service marca uma classe Java que executa algum serviço, como executar lógica de negócios, executar cálculos e chamar APIs externas. Esta anotação é uma forma especializada da anotação @ Component destinada a ser usada na camada de serviço.

## Repository

**Repository**(Repositório) é um padrão de projeto que visa mediar a pesquisa de objetos de dominio entre a camada de dominio e a camada de mapeamento de dados usando uma interface semelhante à de uma coleção[1].

Para a camada de dominio parece que estamos filtrando uma coleção em memoria. Para a camada de mapeamento estamos fornecendo uma frase de pesquisa que ela entende. No meio libertamos a camada de dominio de saber como fazer pesquisas na camada de mapeamento e ganhamos um local centralizado para modificar a tradução entre as duas camadas.

O objeto Repository tem uma interface simples. Ele recebe um objeto com a especificação da pesquisa e retorna uma coleção com os objetos de dominio que satisfazem essa pesquisa. A especificação é um objeto. Qualquer objeto pode ser usado, mas o ideal é utilizar o padrão Query Object. (Do ponto de vista do padrão **Query Object** o Repository atua como um intrepretador da especifiação.

O objeto Repository pode ainda ser mais inteligente preocupando-se menos com a camada de mapeamento com quem conversa ao fazer uso do padrão **Strategy**.

O papel principal de um Repository é ser um tradutor de pesquisas , mas podemos aumentar a sua responsabilidade um pouco mais. Na presenta de uma camada de mapeamento pesquisar não é a única tarefa delegada a ela pela camada de dominio. Tarefas como inserir e apagar também são importantes.

## MongoDB + Spring boot

Um dos benefícios do Spring Data é a integração com diversos conceitos de provedores de dados, ou seja, o framework não se limite apenas aos padrões Java JPA e JDBC o Spring Data possui diversos módulos de integração com tecnologias como: MongoDB, Redis, Cassandra, entre outros, além de módulos estendidos pela comunicado como Elasticsearch e DynamoDB.

Por padrão, o Spring Boot não tem acesso as funcionalidades do Spring Data e MongoDB, dessa forma, é preciso adicionar a dependência.

Posterior as configurações, o projeto está pronto para utilizar os recursos do Spring Data em conjunto com MongoDB.

O Mapeamento de entidade é similar ao mapeamento do JPA, onde ao invés de @Table é utilizado o @Document e da mesma forma que o JPA, também é preciso definir um id para a classe de modelo.

Na camada repository também é similar ao JPA, onde o Spring Data disponibiliza uma interface MongoRepository com os principais métodos como: findAll, save, insert, entre outros.

[^*]: Em programação de computadores, código boilerplate ou boilerplate se refere a seções de código que devem ser incluídas em muitos lugares com pouca ou nenhuma alteração 