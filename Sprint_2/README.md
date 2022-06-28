# Estruturas de dados

​	Com exceção dos tipos primitivos, tudo em Java é um objeto. Sendo assim, todos eles derivam da classe Object que, por sua vez, possui métodos que irão passar pra todas as suas classes filhas. Entre estes métodos está o `equals()`.

## Equals 

​	O método equals é utilizado em comparações. A classes String e as classes Wrapper sobrescrevem `equals()` para garantir que dois objetos desses tipos, com o mesmo conteúdo, possam ser considerados iguais. Quando a finalidade for descobrir se duas referências são iguais, o operador "==" deverá ser usado, pois serão comparados os bits das variáveis.

​	Por **padrão**, o **método equals só retornará true se os dois objetos apontarem pro mesmo endereço de memória**. Por isso, mesmo que os valores sejam iguais, o retorno será false. Para isso, é necessário que o método equals() seja sobrescrito a fim de garantirmos que uma classe seja igual a outra.

**Alguns princípios do método equals() da classe Object:** Se algum outro objeto é igual a um determinado objeto, ele segue estas regras:

- **Reflexivo:** para qualquer valor de referência a, a.equals(a) deve retornar verdadeiro.
- **Simétrico:** para quaisquer valores de referência a e b, se a.equals(b) retornar verdadeiro, então b.equals (a) deve retornar verdadeiro.
- **Transitivo:** para quaisquer valores de referência a, b e c, se a.equals(b) retornar verdadeiro e b.equals(c) retornar verdadeiro, então a.equals(c) deve retornar verdadeiro.
- **Consistente:** para quaisquer valores de referência a e b, várias invocações de a.equals(b) retornam consistentemente verdadeiro ou consistentemente retornam falso, desde que nenhuma informação usada em comparações de igual no objeto seja modificada.

## HashCode

O hashCode é uma ferramenta da JVM usada para montar a tabela de hash de modo correto. Tabela Hash [também conhecida como Tabela de Dispersão ou Tabela de Espalhamento] é uma tabela onde as informações são armazenadas conforme um **"numero hash"** calculado com base nas propriedades da informação. Isso permite que seja muito rápido recuperar uma informação na tabela.

A ideia de uma boa função hash é garantir que somente uma informação esteja em uma determinada "gaveta", só que infelizmente isso nem sempre é possível. Quando mais de uma informação acaba em um mesmo **bucket** [apenas uma outra forma de se referir a "gaveta"] acontece o que chamamos de colisão na tabela hash. Ainda assim é a melhor estratégia, pois temos que procurar apenas entre poucos objetos ao invés daquela volumosa quantidade de antes.

Através do método equals você pode determinar se os objetos são iguais. A ideia do equals é garantir que dois objetos são "significativamente iguais", ou seja, que os objetos tem uma valor igual dadas as suas propriedades.

## Wrappers

Os **Wrapper** são conhecidos na linguagem Java como classes especiais que possuem métodos capazes de fazer conversões em variáveis primitivas e também de encapsular tipos primitivos para serem trabalhados como objetos, ou seja, é feita um embrulho de streams que são fluxo de dados através de canais.

Sendo assim, existe uma classe Wrapper para cada tipo primitivo identificado pelo mesmo nome do tipo que possui e tendo a primeira letra maiúscula. Essa regra de declaração é aplicada a todos os tipos, exceto aos que são char classificados como Character e boolean como Boolean.

##############################################################################################

## Collections

Collections Framework é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection. A Collections Framework contém os seguintes elementos.

![Coleçẽos](https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image001.jpg)

A hierarquia da Collections Framework tem uma segunda árvore. São as classes e interfaces relacionadas a mapas, que não são derivadas de Collection. Essas interfaces, mesmo não sendo consideradas coleções, podem ser manipuladas como tal.

![Map](https://arquivo.devmedia.com.br/REVISTAS/easyjava/imagens/1/4/image002.jpg)

**Não podemos ter listas, maps e sets de tipos primitivos, devemos utilizar os Wrappers pois como são objetos possuem os metodos Equals e HashCode**

## List

A interface **java.util.List** tem o objetivo de definir coleções que têm a função de servirem como arrays de tamanho dinâmico, de forma que cada elemento seja acessível por um índice, que é a posição do elemento no array. Além disso, novos elementos podem ser criados ou removidos em qualquer posição e pode haver elementos duplicados.

As principais classes que descendem da interface **List** são **ArrayList**, **Vector**, **LinkedList** e **Stack**

A implementação mais utilizada da interface `List` é a **`ArrayList`,** que trabalha com uma array interna para gerar uma lista. Portanto, ela é mais **rápida** na **pesquisa** do que sua concorrente, a **`LinkedList`**, a qual é **mais rápida** na **inserção e remoção** de itens nas **pontas**.

#### ArrayList

A `ArrayList`, têm acesso aleatório aos seus elementos: a busca por um elemento em uma determinada posição é feita de maneira imediata, sem que a lista inteira seja percorrida (que chamamos de acesso sequencial). Os elementos são ordenados de acordo com a inserção, podendo ser inseridos em qualquer lugar da lista.

Capacidade default -> 10

#### LinkedList

Cada elemento da LinkedList possui um link para o próximo elemento e para o anterior. Assim como ArrayList ela pode ser ordenada reescrevendo o método `sort`. Além de implementar a interface `List` a LinkedList implementa a interface Queue, por isso, ela possui métodos a mais.

Ao contrário do ArrayList, a busca é linear e inserções e exclusões são rápidas. Portanto, prefira LinkedList quando a aplicação exigir grande quantidade de inserções e exclusões. Além disso, a `LinkedList`, fornece métodos adicionais para obter e remover o primeiro e último elemento da lista.

Capacidade default -> 0

![ {w=75}](https://www.alura.com.br/apostila-java-orientacao-objetos/assets/images/collections/list.png)

## Ordenação: Collections.sort

A classe `Collections` fornece um método estático `sort`, que recebe um `List` como argumento e o ordena por ordem crescente.

Sempre que falamos em ordenação, precisamos pensar em um **critério de ordenação**, uma forma de determinar qual elemento vem antes de qual. É necessário instruir o `sort` sobre como **comparar** a fim de determinar uma ordem na lista. Para isso, o método `sort` necessita que todos seus objetos da lista sejam **comparáveis** e tenham um método que se compara com outra. Como é que o método `sort` terá a garantia de que a sua classe tem esse método? Isso será feito, novamente, por meio de um contrato, ou seja, de uma interface!

## Set

A interface Set estende a interface Collection mas não adiciona novos métodos ou constantes. Em vez disso, esta interface define que uma instância de Set não contenha elementos duplicados. Esta responsabilidade é transferida para as classes que implementam a interface.

### HashSet

O HashSet é o mais rápido de todos, este usa Hash Table e seus elementos **não são ordenados**, não importa o quanto você adicione, remova, retire, o tempo de execução sempre será o mesmo. A garantia de continuidade na ordem dos elementos inseridos é zero, ou seja, esse tipo de estrutura é indicada se você precisa apenas garantir a alta performance sem se importar com a ordem com que os elementos estão ordenados. Os elementos raramente são retornados na mesma ordem na qual foram inseridos.

Capacidade default -> 16

Fator de carga -> 0,6 (ou seja, toda vez que for preenchido 60% do HashSet ele será deslocado para um 2x maior)

### TreeSet

O TreeSet implementa um algoritmo conhecido por red-black tree ou árvore rubro-negra. Sua principal característica é que ele é o único Set que implementa a interface SortedSet em vez de Set diretamente, mas de qualquer forma SortedSet implementa Set, assim continuamos tendo os mesmo métodos no TreeSet. Pelo fato de ele implementar SortedSet ele possui **elementos ordenados automaticamente**, ou seja, independente da ordem que você inserir os elementos, eles serão ordenados. Mas isso tem um custo, a complexidade para os métodos add, remove e contains são bem maiores que do HashSet.

Por implementar SortedSet o TreeSet oferece mais alguns métodos como: first(), last(), headSet(), tailSet() e etc. 

Para ordenar **objetos** temos que implementar a **interface `Comparable`** que obrigatoriamente fará que implementemos o **método `compareTo`**. É através deste método que diremos como o TreeSet deve ordenar nosso Objeto.

### LinkedHashSet

A LinkedHashSet que é um meio termo entre HashSet e TreeSet, ou seja, ela nos proporciona um pouco da performance do HashSet e um pouco do poder de ordenação do TreeSet. O LinkedHashSet faz uso também do HashTable com linked list, ou seja, temos aqui a seguinte situação: Os **elementos continuam na ordem que são inseridos**, diferente do HashSet que “embaralha” tudo.

Capacidade default -> 16

Fator de carga -> 0,6 (ou seja, toda vez que for preenchido 60% do LinkedHashSet ele será deslocado para um 2x maior)

## Map

Map – mapeia chaves para valores. Cada elemento tem na verdade dois objetos: uma chave e um valor. Valores podem ser duplicados, mas chaves não. SortedMap é uma interface que estende Map, e permite classificação ascendente das chaves.

Essa interface é um objeto que mapeia valores para chaves, ou seja, através da chave consegue ser acessado o valor configurado, sendo que a chave não pode ser repetida ao contrário do valor, mas se caso tiver uma chave repetida é sobrescrito pela última chamada.

A sintaxe deve obedecer a lugares apontados da chave e valor, pois cada chave leva somente um elemento.

### HashMap

Essa classe é a implementação da interface Map mais trabalhada no campo de desenvolvimento.

**Características**

- Os elementos não são ordenados;
- É rápida na busca/inserção de dados;
- Permite inserir valores  e chaves nulas;

Existe uma questão simples para fazer a **ordenação de um mapa de dados**. Para aplicar essa ordenação é necessário criar antes uma classe personalizada que implemente a interface Comparable do tipo inteiro e também trabalhar com a classe TreeSet.

### LinkedHashMap

- Um LinkedHashMap contém valores baseados na chave.
- Ele contém apenas elementos únicos.
- Ele pode ter uma chave nula e vários valores nulos.
- É o mesmo que o HashMap, em vez disso, **mantém a ordem de inserção** .

### TreeMap

- Um TreeMap contém valores baseados na chave. Ele implementa a interface NavigableMap e estende a classe AbstractMap. (O que permite usar outros comandos como descendingKeySet() que retorna uma visualização de ordem inversa das chaves contidas neste mapa, firstEntry() retorna um mapeamento de valor-chave associado à menor chave neste mapa ou null se o mapa estiver vazio.)
- Ele contém apenas elementos únicos.
- Ele não pode ter uma chave nula, mas pode ter vários valores nulos.
- É o mesmo que o HashMap, em vez disso, **mantém a ordem crescente (classificado usando a ordem natural de sua chave** ).

## Queue 

Queue – um tipo de coleção para manter uma lista de prioridades, onde a ordem dos seus elementos, definida pela implementação de Comparable ou Comparator, determina essa prioridade. Com a **interface** fila pode-se criar filas e pilhas;

### Fila

- Estrutura linear na qual a inserção e remoção de itens segue o princípio FIFO (First-in-first-out)
- Os objetos podem ser inseridos a qualquer momento, mas apenas o objeto que está há mais tempo na fila pode ser removido.
- Elementos somente são inseridos em um lado da lista, o final, e somente podem ser excluídos do outro lado, o início da fila.

### Pilha

- Estrutura linear para armazenamento de itens que são inseridos e removidos de acordo com o princípio LIFO (Last-in-first-out)

- Os objetos podem ser inseridos a qualquer momento, mas apenas o objeto que foi inserido por último pode ser removido.

- Os elementos pode ser inseridos e excluídos apenas em um lado da lista, chamado topo.

  

  ![image-20220526150857790](/home/gabriel/.config/Typora/typora-user-images/image-20220526150857790.png)

## Interfaces funcionais

​	A partir do Java 8 toda interface que possui somente um método declado se caracteriza como uma interface funcional. Nas versões anteriores do Java todo método declarado dentro de uma interface necessariamente deveria ser implementado pela classe que "assinava" o contrato, porém, a partir do Java 8 isso mudou, agora podemos ter métodos default dentro da interface o que significa que a classe não é obrigada a implementar este método pois dentro da interface ela já foi implementada.

### Consumer

​	A interface Consumer, recebe uma variável genérica, faz algo com ela e depois, não devolve nada.

`````java
@FunctionalInterface
public interface Consumer<T>{
    void accept(T var1);
}
`````

#### andThen

Consumer andThen retorna um Consumer composto que executa, em sequência, a operação atual seguida pela operação posterior.

### BiConsumer

O BiConsumer segue as mesmas regras, mas recebe dois argumentos.

```java
@FunctionalInterface
public interface BiConsumer<T, U> {
	 void accept(T t, U u);
}
```

### Function

A interface Function representa uma função (método) que recebe um único parâmetro e retorna um único valor.

```java
@FunctionalInterface
public interface Function<T,R> {
    public <R> apply(T parameter);
}
```

#### Compose

A Função retornada por compose() irá primeiro chamar a Função passada como parâmetro para compose(), e então irá chamar a Função na qual compose() foi chamado.

### Predicate

A interface Java Predicate, java.util.function.Predicate, representa uma função simples que recebe um único valor como parâmetro e retorna true ou false. 

#### Or

O método Predicate or() é usado para combinar uma instância de Predicate com outra, para compor uma terceira instância de Predicate. O Predicate composto retornará true se qualquer uma das instâncias de Predicate compostas retornar true, quando seus métodos test() forem chamados com o mesmo parâmetro de entrada do Predicate composto. 

#### And

O método Predicate and() é um método padrão. O método and() é usado para combinar duas outras funções Predicate.

### Supplier

A interface `Supplier` basicamente não aceita argumentos e retorna um resultado.

## Lambdas

Uma função lambda é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em Java tem a sintaxe definida como (argumento) -> (corpo).

Uma função lambda pode ter nenhum ou vários parâmetros e seus tipos podem ser colocados ou podem ser omitidos, dessa forma, eles são inferidos pelo Java. A função lambda pode ter nenhum ou vários comandos: se a mesma tiver apenas um comando as chaves, não são obrigatórias e a função retorna o valor calculado na expressão; se a função tiver vários comandos, é necessário colocar as chaves e também o comando return - se nada for retornado, a função tem um retorno void.

Simplificando bastante, um lambda no Java é uma maneira mais simples de implementar uma interface que só tem um único método.

## Generics

- Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo.
- Poupa o desenvolvedor de códigos redundantes, como é o caso de casting excessivo.
- Podemos criar uma classe só e, a partir dessa classe, instanciar objetos de diferentes tipos, de acordo com a nossa escolha.
- Provê em tempo de compilação uma verificação de type-safety de código, removendo riscos de ClassCastException durante a execução, o qual era um erro comum antes da versão 1.5; Essa verificação consiste em verificar se o que está sendo atribuído a uma instância de uma *classe* está de acordo com o especificado. 
- Generis só existe em tempo de compilação. Ao utilizar Generics o javac age como um corretor ortográfico. Ao escrever um código no qual existem erros na tipagem, o javac irá mostrar esses erros e pedir para você realizar a correção.
- Antes do Java 1.5, o erro ocorria somente em execução, o que dependendo do caso poderia ser pego somente quando o software estivesse em produção. Já após o Java 1.5, daria um erro de compilação, devendo ser corrigido tem tempo de desenvolvimento do software.
- Generics podem ser aplicadas em classes, métodos e atributos, além de interfaces e enums.
- Uso comum: coleções

https://replit.com/@GabrielTernes1/testeGenerics#Main.java

O método “saoIguais”, checa se os dois valores absolutos são iguais. Se adicionarmos o **T** e não o **?**, um erro será gerado, pois o Java esperará um inteiro, que é o valor do inteiro1.saoIguais(), e se fizermos flutuante1.saoIguais(), ele esperará um Double. Usando **?**, deixamos claro pro Java que ele pode esperar tanto um inteiro quanto um double, ou seja: podemos misturar os tipos.

## Wildcards

Não é possível adicionar dados a uma coleção do tipo coringa.

Existem 3 tipos de Wildcards em Generics:

- Unknown Wildcard, ou seja, Wildcard desconhecido.
- Extends Wildcard
- Super wildcard

### Unknown Wildcard

Como você não sabe o tipo do objeto, você deve tratá-lo da forma mais genérica possível.

```java
public void processElements(List<?> elements){
           for(Object o : elements){
              System.out.println(o);
           }
        }

/* Podemos atribuir um list de qualquer tipo a nosso
método, pois ele tem um tipo desconhecido/genérico */
List<A> listA = new ArrayList<A>();

    processElements(listA);
```

### Extends Wildcard / Covariância

Podemos utilizar este tipo de Wildcard para possibilitar o uso de vários tipos que se relacionam entre si, ou seja, podemos dizer que o nosso método imprimeAlunos aceita uma lista de qualquer tipo de Frutas, seja moranga, maça ou etc.

### Super wildcard / Contravariância

Ao contrário do extends, o wildcard super permite que elementos de classes mais genéricas sejam usadas.

## Optional

A principal proposta deste recurso é encapsular o retorno de métodos e informar se um valor do tipo `<T>` está presente ou ausente.

Com isso é possível:

- Evitar erros `NullPointerException`.
- Parar de fazer verificações de valor nulo do tipo `if (cliente != null)`.
- Escrever código mais limpo e elegante.

### Métodos

**empty** - Retorna uma instância de `Optional` vazia. Usado para quando se quer iniciar um optional vazio.

````java
Optional<Cliente> retorno = Optional.empty();
````

**of** - Retorna um `Optional` com o valor fornecido, mas o valor não pode ser nulo porque ele exige um valor. Se não tiver certeza de que o valor não é nulo use `Optional.ofNullable`.

```java
Optional<Cliente> retorno = Optional.of(buscaCliente(cpf));
```

**ofNullable** - Se um valor estiver presente, retorna um `Optional` com o valor , caso contrário, retorna um `Optional` vazio. Este é um dos métodos mais indicados para criar um `Optional`.

````java
Optional<Cliente> retorno = Optional.ofNullable(buscaCliente(cpf));
````

**filter** - Se um valor estiver presente e o valor corresponder ao predicado retorna um `Optional` com o valor, se não, retorna um `Optional` vazio.

````java
Optional<Cliente> retorno = buscaCliente(cpf)
   .filter(cliente -> !cliente.getNome().isEmpty());
````

**isPresent** - Se um valor estiver presente retorna `true`, se não, retorna `false`.

```java
Optional<Cliente> retorno = Optional.ofNullable(buscaCliente(cpf));
if (retorno.isPresent()) {
   System.out.println("Cliente encontrado.");
} else {
   System.out.println("Cliente não encontrado.");
}
```

**get** - Se um valor estiver presente retorna o valor, caso contrário, lança `NoSuchElementException`. Então para usar `get` é preciso ter certeza de que o `Optional` não está vazio.

```java
Optional<Cliente> retorno = Optional.ofNullable(buscaCliente(cpf));
if (retorno.isPresent()) {
   Cliente cliente = retorno.get();
}
```

**ifPresent** - Se um valor estiver presente, executa a ação no valor, caso contrário, não faz nada.

```java
public void login(String cpf, String senha) {
   dao.buscaPorCPF(cpf).
      ifPresent(cliente -> cliente.realizaLogin(senha));
}
```

**map** - Se um valor estiver presente retorna um `Optinal` com o resultado da aplicação da função de mapeamento no valor, caso contrário, retorna um `Optional` vazio.

```java
if (optCliente.isPresent()) {
   String nome = optCliente.map(Cliente::getNome);
}
```

**flatMap** - Semelhante a `map`, se um valor estiver presente, retorna o resultado da aplicação da função de mapeamento no valor, caso contrário retorna um `Optional` vazio. A diferença é que `flatMap` pode se aplicado a um mapeamento que também retorna um `Optional`.

```java
Endereco endereco =
   buscaCliente(cpf).flatMap(Cliente::getEndereco).get();
```

**orElse** - Se um valor estiver presente, retorna o valor, caso contrário, retorna o valor definido no parâmetro.

```java
//Método na classe ClienteService alterado
public String getNomePorCPF(String cpf) {
   return dao.buscaPorCPF(cpf).map(Cliente::getNome)
      .orElse("DESCONHECIDO");
}
```

**orElseGet** - Se um valor estiver presente, retorna o valor, caso contrário, retorna o resultado produzido pelo parâmetro.

```java
//Método na classe ClienteService alterado
public String getNomePorCPF(String cpf) {
   return dao.buscaPorCPF(cpf).map(Cliente::getNome)
      .orElseGet(Constantes::getNomePadrao);
}
```

**orElseThrow** - Se um valor estiver presente, retorna o valor, caso contrário, lança a exceção informada no parâmetro.

```java
//Método na classe ClienteService alterado
public String getNomePorCPF(String cpf) {
   return dao.buscaPorCPF(cpf).map(Cliente::getNome)
      .orElseThrow(IllegalArgumentException::new);
}
```

## Streams

Entre as diversas funcionalidades adicionadas à linguagem Java em sua versão 8 está a Streams API, recurso que oferece ao desenvolvedor a possibilidade de trabalhar com conjuntos de elementos de forma mais simples e com um número menor de linhas de código. Isso se tornou possível graças à incorporação do paradigma funcional, combinado com as expressões lambda, o que facilita a manutenção do código e aumenta a eficiência no processamento devido ao uso de paralelismo.

A proposta em torno da Streams API é reduzir a preocupação do desenvolvedor com a forma de implementar controle de fluxo ao lidar com coleções, deixando isso a cargo da API. A ideia é iterar sobre essas coleções de objetos e, a cada elemento, realizar alguma ação, seja ela de filtragem, mapeamento, transformação, etc. Caberá ao desenvolvedor apenas definir qual ação será realizada sobre o objeto.

### Operações Intermediárias

**map** - Retorna uma stream consistindo no resultado da aplicação de uma função de mapeamento nos elementos da stream.

```java
clientes.stream().map(Cliente::getNome);
```

**reduce** - Realiza uma operação de redução que leva uma sequência de elementos de entrada e os combina em um único resultado, como acumular valores.

```java
numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
```

**filter** - Filtra os elementos de acordo com uma condição retornando uma nova stream.

```java
clientes.stream().filter(c -> c.getTipo() == Tipo.PESSOA_FISICA);
```

**limit** - Retorna uma nova stream que contém apenas os *N* primeiros elementos da stream original.

```java
clientes.stream().limit(10);
```

**skip** - Retorna uma nova stream que não contém os *N* primeiros elementos da stream original.

```java
clientes.stream().skip(10);
```

**sorted** - Retorna uma nova stream contendo os elementos da stream original ordenados pela forma natural em ordem crescente.

```java
clientes.stream().sorted();
```

**sorted.reversed** - Retorna uma nova stream contendo os elementos da stream original ordenados de acordo com algum critério em ordem decrescente.

```
clientes.stream().sorted(comparing(Cliente::getId).reversed());
```

### Operações Terminais

**count** - Retorna a quantidade de elementos presentes em uma stream. Mas se você tem uma lista prefira `clientes.size()`.

```java
clientes.stream().count();
```

**forEach** - Realiza uma iteração sobre todos os elementos de uma stream e executa algum tipo de processamento. É equivalente ao loop `for (Cliente cliente: clientes)`.

```java
nomes.forEach(System.out::println);
```

**allMatch** - Retorna *true* se todos os elementos da stream correspondem ao predicado fornecido.

```java
clientes.stream().allMatch(c -> c.getTipo() == Tipo.PESSOA_FISICA);
```

**anyMatch** - Retorna *true* se qualquer um dos elementos da stream corresponde ao predicado fornecido.

```java
clientes.stream().anyMatch(c -> c.getNome().equals("Carlos"));
```

**noneMatch** - Retorna *true* se nenhum dos elementos da stream corresponde ao predicado fornecido.

```java
clientes.stream().noneMatch(c -> c.getNome().equals("Carlos"));
```

**average** - Retorna a média de um conjunto de valores.

```
clientes.stream().mapToDouble(cliente -> cliente.getLimite().doubleValue()).average().getAsDouble();
```

**collect** - Permite coletar o conteúdo da stream, por exemplo como uma lista.

```
List<Cliente> resultado = clientes.stream().filter(c -> c.getTipo() == Tipo.PESSOA_FISICA).collect(toList());
```

## API de datas

### Instant

Para um computador, o tempo é um número que cresce a cada instante. No Java, historicamente era utilizado um long que representava os milissegundos desde 01/01/1970 às 00:00:00. Na nova API, a classe `Instant` é utilizada para representar esse número, agora com precisão de nanossegundos. Não tem informação sobre localidade, está no GMT/UTC no "fuso horário" 0.

A classe `Duration` serve para medir uma quantidade de tempo em termos de nanossegundos. Você pode obter essa quantidade de tempo em diversas unidades chamando métodos como `toNanos`, `toMillis`, `getSeconds`, etc.

### LocalDate

Temos, por exemplo, a classe `LocalDate` que representa uma data, ou seja, um período de 24 horas com dia, mês e ano definidos.

Podemos criar um `LocalDate` para uma data específica utilizando o método `of`

Para calcularmos a duração entre dois `LocalDate`, devemos utilizar um `Period`, que já trata anos bissextos e outros detalhes. 

````java
LocalDate ldOf = LocalDate.of(2022, 6, 3); // 2022-06-03
LocalDate ldNow = LocalDate.now(); // 2022-06-10
````

### LocalTime

Já a classe `LocalTime` serve para representar apenas um horário, sem data específica. Podemos, por exemplo, usá-la para representar o horário de entrada no trabalho.

````java
LocalTime horarioDeEntrada = LocalTime.of(9, 0);
System.out.println(horarioDeEntrada);//09:00 
````

### LocalDateTime

A classe `LocalDateTime` serve para representar uma data e hora específicas. Podemos representar uma data e hora de uma prova importante ou de uma audiência em um tribunal.

```java
LocalDateTime agora = LocalDateTime.now(); 
LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0); System.out.println(aberturaDaCopa); //2014-06-12T17:00 (formato ISO-8601) 
```

#### Datas com fuso horário

Para representarmos uma data e hora em um fuso horário específico, devemos utilizar a classe `ZonedDateTime`. 

```java
ZonedDateTime zonedDateTime = ZonedDateTime.now();
System.out.println(zonedDateTime); // 2022-06-10T10:18:17.790413619-03:00[America/Sao_Paulo]

ZonedDateTime zdTime = ZonedDateTime.of(ldOf, ltOf, ZoneId.of("Europe/Amsterdam"));
ZonedDateTime zdTime2 = ZonedDateTime.of(ldLt, ZoneId.of("Europe/Amsterdam"));
System.out.println(zdTime);// 2022-06-03T15:30:15+02:00[Europe/Amsterdam]
System.out.println(zdTime2); // 2022-06-15T15:45:25+02:00[Europe/Amsterdam]
```

#### Period

O period representa intervalos de tempos em anos, meses e dias. Então ele não trabalha com `LocalTime`.

```java
LocalDate homemNaLua = LocalDate.of(1969, Month.JULY, 20); // 1969-07-20
LocalDate ldNow = LocalDate.now(); // 2022-06-10

Period periodo = Period.between(homemNaLua, ldNow);

System.out.println(periodo); // P52Y10M21D | 52 anos, 10 meses e 21 dias
```

#### Duration

Diferente dos `Period` o `Duration` trabalha com horas, minutos e segundos. Então ele não trabalha com `LocalDate`.

````java
Duration ofSeconds = Duration.ofSeconds(500);
System.out.println(ofSeconds); // PT8M20S

 Duration ofDay = Duration.ofDays(1);
System.out.println(ofDay); // PT24H
````

#### Datas e meses importantes

Existem também as classes `MonthDay`, que deve ser utilizada para representar datas importantes que se repetem todos os anos, e `YearMonth`, que deve ser utilizada para representar um mês inteiro de um ano específico.

```java
MonthDay natal = MonthDay.of(Month.DECEMBER, 25); 
YearMonth copaDoMundo2014 = YearMonth.of(2014, Month.JUNE);
```

### Formatando datas

O `toString` padrão das classes da API utiliza o formato ISO-8601. Se quisermos definir o formato de apresentação da data, devemos utilizar o método `format`, passando um `DateTimeFormatter`. 

```java
LocalDate hoje = LocalDate.now(); 
DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
hoje.format(formatador); //08/04/2014 
```

O enum `FormatStyle` possui alguns formatos pré-definidos, que podem ser combinados com um `Locale`.

```java
LocalDateTime agora = LocalDateTime.now(); 
DateTimeFormatter formatador = DateTimeFormatter
    	.ofLocalizedDateTime(FormatStyle.SHORT)
    	.withLocale(new Locale("pt", "br")); 
agora.format(formatador); // 08/04/14 10:02
```

#### Imutabilidade e Testabilidade

Se você adicionar um dia a um `LocalDate`, as informações de data não serão alteradas. Na verdade, qualquer método que alteraria o objeto retorna uma referência a um novo objeto com as informações alteradas.

Isso vale para todas as classes do pacote `java.time`, que são imutáveis e, por isso, são thread-safe e mais fáceis de dar manutenção.

Qualquer erro é visto somente em tempo de execução!!!!!!

# Protocolo HTTP

## O que é HTTP?

HTTP (Hypertext Transfer Protocol) é um protocolo de comunicação (rede) que fica na camada de aplicação do modelo OSI[^*], e que define as regras de comunicação entre cliente e um servidor na internet. Temos também o HTTPS que possui uma camada adicional de segurança/criptografia, chamada TLS (Transport Layer S) baseada em chaves públicas e privadas.

## Como funciona o HTTP?

O HTTP funciona através de **requisições** (requests) e **respostas** (responses). Ou seja, o cliente (Ex: o navegador) envia uma requisição para o servidor e ele retorna alguma resposta, podendo ser uma página HTML por exemplo.

Essa comunicação **sempre** começa pelo lado do cliente, o servidor tem o papel de apenas responder o que foi requisitado e nunca inicia uma comunicação.

## Request Methods:

Uma requisição é todo "pedido" que é enviado pelo cliente para o servidor. O request possui um corpo com cabeçalhos que são metadados que podem ser utilizados para enviar informações relevantes para o servidor.

**Métodos HTTP** — Indica o tipo de requisição feita. O HTTP possui vários métodos(chamados também de verbos), que juntos com a URI devemos conseguir representar todas as ações do nosso sistema.

Alguns dos métodos são :

**GET** - Retorna informações sobre o recurso identificado pela URI. Uma requisição GET só deve retornar informações e não deve modificar nenhum dado/recurso do seu sistema. Como por exemplo retornar todos os cliente cadastrados(teste.com.br/cliente).

**HEAD** -  O método `HEAD` solicita uma resposta de forma idêntica ao método `GET`, porém sem conter o corpo da resposta.

**POST** - Adiciona informações usando o recurso da URI passada. Uma requisição POST pode adicionar ou criar informações referente a um recurso. Geralmente é usado para enviar formulários, por exemplo um formulário de cadastro de cliente (teste.com.br/cliente/cadastro).

**PUT** - Atualiza informações de um recurso.Uma requisição PUT é bem semelhante a POST, porém ela deve atualizar um dado/recurso e não criar. Geralmente é usado para enviar um formulário de atualização(teste.com.br/cliente/update/1).

**PATCH** - O método `PATCH` é utilizado para aplicar modificações parciais em um recurso.

**DELETE** - Remove um dado/recurso passado na URI.(teste.com.br/cliente/1)

## Header

Cabeçalhos HTTP de uma requisição seguem a mesma estrutura básica de um cabeçalho HTTP: uma cadeia de caracteres seguida de dois pontos (`':'`) e um valor cuja estrutura depende do cabeçalho. O cabeçalho inteiro, incluindo o valor, consiste em uma única linha, que pode ser bem grande.

![image-20220615192009527](/home/gabriel/snap/typora/57/.config/Typora/typora-user-images/image-20220615192009527.png)

- *Cabeçalhos de requisição*, como `User-Agent`, `Accept-Type`[^¹], modificam a requisição, especificando-a mais (como `Accept-Language`[^²], ou dando-a contexto (como `Referer`[^³]).
- *Cabeçalhos de entidade*, como `Content-Length`[^'] que se aplicam ao corpo da mensagem. Obviamente este cabeçalho não será transmitido se não houver corpo na requisição.

### User agent

Um agente de usuário é uma “string” - ou seja, uma linha de texto - que identifica o navegador e o sistema operacional para o servidor web.

Quando seu navegador se conecta a um site, ele inclui um campo User-Agent em seu cabeçalho HTTP. O conteúdo do campo do agente do usuário varia de navegador para navegador. Cada navegador tem seu próprio agente de usuário distinto.

O servidor da web pode usar essas informações para servir diferentes páginas da web para diferentes navegadores da web e diferentes sistemas operacionais. Por exemplo, um site pode enviar páginas móveis para navegadores móveis, páginas modernas para navegadores modernos e uma mensagem “atualize seu navegador” para o Internet Explorer 6.

### Cookies

Os cookies são definidos através dos HTTP Header e armazenados pelo navegador dos visitantes. No primeiro acesso, **o web server manda para o visitante o que deverá ser armazenado** no Cookie.

A partir daí, cada vez que ele acessa o site, o Cookie será enviado ao servidor, que, por sua vez, retornará às páginas já com as adaptações necessárias para atender melhor o usuário.

Para entender na prática o que são os Cookies, imagine que você acessou pela primeira vez um site e escolheu visualizar a versão em português. Graças a eles, nos próximos acessos, **automaticamente o site será carregado nesse idioma**, sem a necessidade de nova configuração.

**Eles também armazenam alguns dos seus dados pessoais** e os dados de uma compra que você não finalizou e que deixou no carrinho da sua loja virtual favorita, por exemplo. São eles que te mantém logado na ferramenta de e-mails, além de controlarem a sessão de usuário.

Outra funcionalidade dos Cookies é o **registro das suas preferências**, conforme o exemplo que demos no início do texto sobre o produto pesquisado que passa a ser visualizado em diversos sites.

**Existem 5 tipos principais de Cookies**. São eles:

### 1 – Session Cookie

Fica ativo enquanto o usuário está navegando no site. Assim que ele sai, as informações são deletadas.

### 2 – Persistent ou Permanent Cookie

São os cookies que permanecem gravados mesmo após a saída do site. **O tempo da sua expiração vai ser aquele que o desenvolvedor achar necessário**. Lembrando que eles podem ser apagados pelo visitante a qualquer momento de forma manual nas configurações do navegador.

### 3 – Third-Party Cookies

São acessados por domínios de terceiros, como no exemplo das redes de anúncio.

### 4 – Supercookie

É um Cookie de rastreamento que permite acompanhar todos os movimentos do usuário na web e, diferentemente dos outros tipos, não está armazenado no computador. Logo, não pode ser bloqueado ou excluído.

**Já existem algumas leis para evitar o seu funcionamento**, principalmente porque os usuários se revoltaram com essa captura indevida de dados.

### 5 – Zombie Cookie

É um tipo de Cookie que volta à ativa mesmo após ser excluído, sendo conhecido também como Evercookie.

Além desses tipos principais, existem algumas características que podem ser definidas na hora da sua criação, como:

- **Secure Cookie**: Para garantir a [segurança](https://www.hostgator.com.br/blog/dicas-para-manter-site-seguro/?itm_source=blog&itm_campaign=o-que-sao-cookies), só aceita conexão do tipo https;
- **Http-only-cookie**: Exige que o acesso seja feito através de uma conexão http, evitando que o arquivo seja alterado por um JavaScript mal intencionado;
- **Same-Site Cookie**: Faz com que os servidores só aceitem requisição de um mesmo site. Isso também serve para segurança da informação, protegendo de requisições forjadas.

#### Cabeçalhos Cookie-Related

Há dois cabeçalhos, Set-Cookie e Cookie, relacionados a cookies. O cabeçalho Set-Cookie é enviado pelo servidor em resposta a uma solicitação HTTP, que é usada para criar um cookie no sistema do usuário. O cabeçalho Cookie é incluído pelo aplicativo cliente com uma solicitação HTTP enviada a um servidor, se houver um cookie que tenha um domínio e um caminho correspondentes.

#### Cabeçalho Set-Cookie

O cabeçalho de resposta Set-Cookie usa o seguinte formato:

```syntax
Set-Cookie:
<name>=<value>[; <name>=<value>]...
[; expires=<date>][; domain=<domain_name>]
[; path=<some_path>][; secure][; httponly]
```

Uma ou mais sequências de cadeia de caracteres (separadas por ponto-e-vírgula) que seguem o *valor de nome*= padrão *devem ser* incluídas no cabeçalho de resposta Set-Cookie. O servidor pode usar essas sequências de cadeias de caracteres para armazenar dados no sistema do cliente.

A data de validade é definida usando o formato expires=*date*, em que a *data* é a data de validade em GMT (Horário Médio de Greenwich). Se a data de validade não estiver definida, o cookie expirará após o término da sessão da Internet. Caso contrário, o cookie será mantido no cache até a data de validade.

Especificar o nome de domínio, usando o domínio padrão=*domain_name*, é opcional para cookies persistentes e é usado para indicar o fim do domínio para o qual o cookie é válido. Cookies de sessão que especificam um domínio são rejeitados. Se o nome de domínio especificado corresponder à solicitação, o cookie tentará corresponder ao caminho para determinar se o cookie deve ser enviado. Por exemplo, se o nome de domínio final for .microsoft.com, as solicitações para home.microsoft.com e support.microsoft.com serão verificadas para ver se o padrão especificado corresponde à solicitação. O nome de domínio deve ter pelo menos dois ou três períodos para impedir que cookies sejam definidos para terminações de nome de domínio amplamente usadas, como .com, .edu e co.jp. Os nomes de domínio permitidos seriam semelhantes a .microsoft.com, .someschool.edu e .someserver.co.jp. Somente hosts dentro do domínio especificado podem definir um cookie para um domínio.

Definir o caminho, usando o padrão path=*some_path*, é opcional e pode ser usado para especificar um subconjunto das URLs para as quais o cookie é válido. Se um caminho for especificado, o cookie será considerado válido para quaisquer solicitações que correspondam a esse caminho. Por exemplo, se o caminho especificado for /exemplo, as solicitações com os caminhos /examplecode e /example/code.htm corresponderiam. Se nenhum caminho for especificado, o caminho será considerado o caminho do recurso associado ao cabeçalho Set-Cookie.

O cookie também pode ser marcado como seguro, o que especifica que o cookie pode ser enviado somente para servidores https.

~Por fim, um cookie pode ser marcado como HttpOnly (os atributos não diferenciam maiúsculas de minúsculas), para indicar que o cookie não é scriptável e não deve ser revelado ao aplicativo cliente, por motivos de segurança.

## Enconding

### Codificação de URL

Alguns caracteres não podem fazer parte de um URL (por exemplo, o espaço), e outros têm um significado específico. Em formulários HTML, o caractere `=` é usado para separar um nome de um valor. A sintaxe genérica do URI usa a codificação de URL para lidar com esse problema, enquanto os formulários HTML fazem algumas substituições adicionais em vez de aplicar a codificação de porcentagem a esses caracteres.

Por exemplo, os espaços em uma string são codificados com `%20` ou substituídos pelo sinal de adição (`+`). Se você usar uma barra vertical (`|`) como separador, codifique-a como `%7C`. Uma vírgula em uma string precisa ser codificada como `%2C`.

### Criar um URL válido

Você pode achar que um URL "válido" é imediatamente identificável, mas não funciona assim. Um URL inserido em uma barra de endereço de um navegador, por exemplo, pode conter caracteres especiais (por exemplo, `"上海+中國"`). O navegador precisa converter internamente esses caracteres em uma codificação diferente antes de transmiti-los. Da mesma forma, qualquer código que gere ou aceite entrada UTF-8 pode tratar URLs com caracteres UTF-8 como "válidos", mas também precisa converter esses caracteres antes de enviá-los a um servidor da Web. Esse processo é chamado de codificação de URL ou codificação por cento.

### Caracteres especiais

É necessário traduzir caracteres especiais porque todos os URLs precisam estar em conformidade com a sintaxe especificada pela especificação do [localizador uniforme de recursos (URI, na sigla em inglês). Efetivamente, isso significa que os URLs devem conter apenas um subconjunto especial de caracteres ASCII: os familiares símbolos alfanuméricos e alguns caracteres reservados para uso como caracteres de controle em URLs. Esta tabela resume esses caracteres:

| Conjunto       | Caracteres                                                   | Uso em URLs                                                  |
| :------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| Alfanuméricos  | a b c d e f g h i j k l m n o p q r s t u v w x y z A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 0 1 2 3 4 5 6 7 8 9 | Strings de texto, uso do esquema (`http`), porta (`8080`) etc. |
| Não reservados | - _ . ~                                                      | Strings de texto                                             |
| Reservados     | ! * ' ( ) ; : @ & = + $ , / ? % # [ ]                        | Caracteres de controle e/ou strings de texto                 |

Ao criar um URL válido, você precisa garantir que ele contenha apenas os caracteres mostrados na tabela. Conformar um URL ao uso desse conjunto de caracteres geralmente causa dois problemas, um de omissão e um de substituição.

- Caracteres que você quer processar existem fora desse conjunto. Por exemplo, os caracteres de idiomas estrangeiros como `上海+中國` precisam ser codificados como mostrado acima. Por convenção popular, os espaços (que não são permitidos nos URLs) também são geralmente representados pelo caractere do sinal de adição (`'+'`).
- Caracteres existem no conjunto acima como caracteres reservados, mas precisam ser usados literalmente. Por exemplo, `?` é usado em URLs para indicar o início da string de consulta. Se você quiser usar a string "? and the Mysterions", codifique o caractere `'?'`.

Todos os caracteres que precisam ser codificados para serem adicionados a URLs são codificados por meio do uso de um `'%'` e um valor hexadecimal de dois caracteres correspondente ao seu caractere UTF-8. Por exemplo, `上海+中國` em UTF-8 seria codificado como `%E4%B8%8A%E6%B5%B7%2B%E4%B8%AD%E5%9C%8B` para uso em URLs. A string `? and the Mysterians` seria codificada em um URL como `%3F+and+the+Mysterians` ou `%3F%20and%20the%20Mysterians`.

### Caracteres comuns que precisam de codificação

Alguns caracteres comuns que precisam ser codificados:

| Caractere inválido | Valor codificado |
| :----------------- | :--------------- |
| Espaço             | `%20`            |
| "                  | `%22`            |
| <                  | `%3C`            |
| >                  | `%3E`            |
| #                  | `%23`            |
| %                  | `%25`            |
| \|                 | `%7C`            |

Converter um URL recebido de uma entrada do usuário pode ser complicado. Por exemplo, um usuário pode inserir um endereço como "5th&Main St". Geralmente, você precisa criar o URL das partes dele, tratando quaisquer entradas do usuário como caracteres literais.

### Media Types

Quando um servidor responde uma requisição HTTP, ele devolve o recurso e o seu tipo - chamado de **Content-Type**(também conhecido como media type). Para especificar tipos de recurso, o HTTP usa um outro protocolo(que inicialmente foi feito para comunicação através de e-mail) chamado **MIME**: **M**ultipurpose **I**nternet **M**ail **E**xtensions.

O `content-type tem` duas partes: tipo e subtipo. Por exemplo:, um servidor pode devolver uma imagem no formato png. O content-type da resposta viria como `image/png`. Se fosse um jpg, o content-type seria `image/jpg`. E se fosse um arquivo html? `text/html`. E um json? `text/json`. O navegador olha o Media Type para saber o que fazer com um arquivo.

### Body

A parte final da requisição é o corpo. Nem todas as requisições tem um: as que pegam recursos, como `GET`, `HEAD`, DELETE, ou OPTIONS, usualmente não precisam de um. Algumas requisições enviam dados ao servidor a fim de atualizá-lo: é o caso frequente de requisições `POST` (contendo dados de formulário HTML).

Corpos podem ser divididos, a grosso modo, em duas categorias:

- Corpos de recurso-simples, consistindo em um único arquivo, definido pelos dois cabeçalhos: `Content-Type` e `Content-Length`.
- Corpos de recurso-múltiplo, é aquele que carrega dados reais de solicitação HTTP (incluindo dados de formulário e carregados, etc.) e dados de resposta HTTP do servidor (incluindo arquivos, imagens etc.)

## Resposta (response):

Depois de fazermos a requisição (request), seguindo o fluxo, vamos receber uma resposta do servidor com o que foi solicitado.

**Status e Mensagem da Resposta** — Quando fazemos uma requisição, nem sempre vai ocorrer tudo certo, e para cada estado de resposta temos um código e uma mensagem, que vão ser retornadas, como por exemplo quando a requisição é feita com sucesso e recebemos algum conteúdo no retorno, é retornado um código 200 e um OK dizendo que tudo ocorreu certo.

O HTTP nos oferece uma grande variação de códigos e mensagens(status code) como resposta, para ficar mais resumido nesse post, abordaremos apenas suas famílias.

Família/Significado

2xx -> respostas de sucesso.

3xx -> Mensagens de redirecionamento.

4xx -> Mensagem de erro do lado do cliente(ex: cliente acessou um recurso que não existe).

5xx-> Mensagem de erro do lado do servidor.

## Query strings

```
http://pomadasparabigode.com/busca?nome=pomadalegal
```

Tudo o que vem depois da `?` é o que chamamos de **query string**. Nesse caso `?nome=pomadalegal`. Geralmente colocamos na query string informações que serão interpretadas de alguma forma pela aplicação que é executada no servidor. Não existe uma regra formal de como as query strings são montadas, mas a forma mais comum de utilização é através de pares chave-valor, separados por `&`, como em `?nome=pomadalegal&tipo=2&categoria=bigodesruivos`

Resumidamente, uma url pode ser quebrada então no seguinte formato:

[esquema] :// [servidor] : [porta] / [caminho] ? [querystring] # [fragmento]

## QueryStrings vs Path Params

Existe uma diferença sutil entre `Path params` e `params Query` que eu tomo a liberdade de traduzir para `Parâmetros do caminho da Url` e `Parâmetros de Consulta`

Ambas fazem a mesma coisa porém de formas diferentes.

**Parâmetros da URL**

- Deixa a url amigável (SEO, usuário, etc)

- Em teoria, é algo importante na url, algo de valor

- Caso o parâmetro passado seja invalido pode ocorrer 404

  ex: `GET parentes/avo/detalhes`

**Parâmetros de Query (Ou Querystring)**

- Urls menos amigáveis para SEO (difícil entendimento do usuário)
- Em teoria é algo supérfluo para execução da url, como filtros, ordenações, etc.
- Não causa 404, caso o parametro seja inválido
- ex: `GET parentes/detalhes?tipo=avo`

O padrão para parâmetros para querystring é:

```
| Tipo    | Descrição                                         |
|---------|---------------------------------------------------|
| ?       | antes do primeiro valor                           |
| {param} | Nome do parâmetro                                 |
| =       | separação do parâmetro e valor com sinal de igual |
| {value} | valor do parâmetro                                |
| &       | para separar demais parâmetros                    |
```

ex: `url/pagina?parametro1=valor&parametro2=valor`

[^¹]: O cabeçalho HTTP de solicitação de aceitação indica quais tipos de conteúdo, expressos como tipos de midia, o cliente pode entender. Os navegadores definem os valores necessários para esse cabeçalho com base no contexto da solicitação. Por exemplo, um navegador usa valores diferentes em uma solicitação ao buscar uma folha de estilo CSS, uma imagem, um vídeo ou um script.
[^²]: O cabeçalho HTTP Accept-Language anuncia quais linguas o cliente é capaz de entender, e qual é a preferência do variante do Locale.
[^³]: O cabeçalho de requisição HTTP Referer contém o endereço da página web anterior do qual a página atual requerida foi chamada.
[^']: O cabeçalho de entidade Content-Length indica o tamanho do corpo da entidade, em bytes, enviado ao destinatário.
[^*]: O Modelo OSI (acrônimo do inglês Open System Interconnection) é um modelo de rede de computador referência da [ISO](https://pt.wikipedia.org/wiki/Organização_Internacional_para_Padronização) dividido em camadas de funções, criado em 1971 e formalizado em 1983, com objetivo de ser um padrão, para protocolos de comunicação entre os mais diversos sistemas em uma rede local, garantindo a comunicação entre dois sistemas computacionais (*end-to-end*).

