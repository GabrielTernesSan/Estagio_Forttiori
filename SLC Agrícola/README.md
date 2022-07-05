[TOC]

# Coisas que ouvi e parecem importantes

## DDD (Domain Driven Designer)

O Domain Driven Design combina práticas de design e desenvolvimento. Oferece ferramentas de modelagem estratégica e tática para entregar um software de alta qualidade. O objetivo é acelerar o desenvolvimento de software que lidam com complexos processos de negócio.

O DDD é um conjunto de princípios com foco em **domínio**, **exploração de modelos de forma criativa** e **definir e falar a linguagem ubiqua**[^*] baseada em um contexto delimitado.

- **Domínio**: é o coração do negócio que você está trabalhando. É baseado em um conjunto de ideias, conhecimento e processos de negócio.
- **Exploração de modelos criativos**: DDD preza que desenvolvedores façam parte do processo de entender o negócio e todos os seus modelos nos mais diversos ângulos ao invés de simplesmente entrevistar especialistas.
- **Definir e falar a linguagem ubíqua**: Linguagem Ubíqua é a linguagem falada no dia a dia no contexto da empresa. É a linguagem que utiliza as terminologias da realidade do negócio.

### Características

- Combina muito com microsserviços;
- Utilizado para aplicações complexas;
- Fácil de entender;
- Difícil de aplicar;
- Utilização de diversos padrões de projetos.

### Pilares do DDD

#### Linguagem Ubíqua

- A linguagem Ubíqua tem como objetivo fazer a ligação entre os experts do negócio e os desenvolvedores. Ou seja definir os termos que mais vão usar.
- Fazer um glossário com o significado de cada termo é essencial.

#### Bounded Contexts (Contexto delimitado)

- Delimita os contextos da aplicação.

- Cada contexto possui suas responsabilidades claramente definidas.

- Cada contexto pode ter sua própria linguagem Ubíqua.

- Utilização de histórias e levantamento do escopo do projeto com o "Domain expert" auxilia no processo de delimitação de contextos. (Exemplo de utilização do sistema, exemplo os passos para a criação de um usuário em um sistema)

  Depois que entendemos o contexto, conseguiu definir a linguagem ubíqua e tem uma visão geral do funcionamento do sistema nós partimos para a **modelagem estratégica**. Nela é onde vou definir, necessariamente, os contextos que eu vou utilizar no meu sistema, ou seja, esses são os meus **contextos delimitados**.

#### Context Maps (Mapas de contexto)

Depois de ter todos os contextos definidos nós partimos para a criação de uma mapa destes contextos. Esse mapa serve para entendermos, definitivamente, a relação entre estes contextos.

![Mapa de contextos](http://fullcycle.com.br/wp-content/uploads/2019/07/image-55-1024x462.png)

D → Downstream

U → Upstream

Quando existe um relacionamento upstream (Supplier) e downstream (Customer), significa que a equipe upstream pode ter êxito interdependente da equipe downstream. Modificações no contexto upstream impactam a downstream.

### Domain Model Patterns

- São padrões de desenvolvimento e estruturação de aplicações cujo domínio é o principal foco

  - **Focados em Entidades de Agregadores**

    ![](https://miro.medium.com/max/700/1*JhpNIcN7qmiHA9tEMCsjow.png)

    ​	Quando falamos em Entidade de Agregadores, estamos falando no ponto principal desse contexto, que nesse caso é o pagamento. No caso do pagamento, sempre há uma transação, que também é considerada uma Entidade. Quando trabalhamos com DDD, chamamos essas entidades de agregadores ou Aggregate Objects.

    ​	Aggregate Objects são diversas entidades que estão no mesmo contexto e que se consomem. Como exemplo, para cada pagamento realizado há um registro de uma transação. Logo, na tabela, para cada pagamento realizado há um registro ID de transação relacionado. Sempre que falamos em agregador, devemos informar quem é o root aggregator. Em nosso exemplo é o pagamento.

  - **Objetos de valor**

    - Imutáveis
    - Coleções de atributos
    - Normalmente não possuem métodos setters
    - Entrada dos valores por um construtor
    - Tipagem forte ao invés da utilização de dados primitivos

  - **Repositórios**

    - Tem acesso direto a camada de dados
    - Persiste dados utilizando as entidades
    - Possui os métodos necessários para realizar consultas
    - Utilize sempre um repositório por agregação
    - Pode consultar diretamente serviços externos

  - **Serviços de domínio**

    - Implementam lógica de negócios a partir da definição de um expert de domínio
    - Trabalham com diversos fluxos de diversas entidades e agregações
    - Utilizam os repositórios como interface de acesso aos dados
    - Consumem recursos da camada de infraestrutura como enviar email, disparar eventos, entre outros

## LinQ

​	LINQ é um acrônimo para *Language Integrated Query*, ou *Consulta Integrada à Linguagem* . Trata-se de um “framework” dentro do .NET destinado a auxiliar os desenvolvedores a escrever expressões de consulta diretamente em C# de maneira agnóstica.

​	O LINQ abstrai a complexidade envolvida na utilização de diferentes linguagens de consulta, como SQL, xPath e xQuery. Essa abstração é feita em cima de uma API de alto nível compatível com as linguagens integrantes do .NET Framework. Com esse Framework conseguimos consultar uma base de dados relacional, um arquivo XML uma coleção de objetos através de uma API unificada, invocada através de uma linguagem integrante do .NET Framework. Você consegue unicamente com código C# fazer consultas a conjuntos de objetos, bases de dados relacionais e arquivos XML, sendo o LINQ o encarregado de fazer a devida “tradução” para cada uma das fontes a serem consultadas.

## Azure

​	Azure é um serviço que permite a empresas e desenvolvedores adquirirem as capacidades de processamento e armazenamento dos datacenters da Microsoft para aplicação em seus negócios como alternativa ao modelo convencional.

### Serviços

- **Máquinas virtuais**
- **Gerenciamento de redes**
- **Aplicações em nuvem**
- **Armazenamento e Backup**
- **StorSimple**
  - Com esse serviço, qualquer negócio é capaz de gerenciar facilmente dados entre datacenters na nuvem e matrizes fixas. A gestão é automatizada, o que aumenta a agilidade da TI, e o tempo de recuperação de desastres é ainda mais curto.
- **Automação de serviços e processos em nuvem**
- **Contêineres**
  - Contêineres são pacotes de códigos e ferramentas isolados do sistema em que estão funcionando. São a solução mais popular hoje para dar portabilidade e flexibilidade ao desenvolvimento de produtos digitais.
- **Bancos de dados SQL**
- **Análise de dados com IA e Machine Learning**
- **IoT**
  - O Azure oferece um Hub específico para IoT, que conecta e gerencia potencialmente bilhões de dispositivos em um único sistema de gestão apoiado pela nuvem.

## SAP

​	O ERP tem como função principal integrar todas as áreas de uma empresa: logística, contabilidade, vendas, fiscal, contabilidade e outras. O sistema SAP é um tipo de ERP.

​	Ele nada mais é que um sistema que ajuda a gerenciar os dados das empresas. Por exemplo, gerencia se a empresa tem estoque, materiais, produtos. Então, tudo que engloba os processos empresariais, o SAP auxilia a administrar.

O SAP é um sistema totalmente modular. Essa divisão permite melhor o controle dos diferentes setores da empresa.

1. **FI (Financial Accounting)** é responsável por rastrear o fluxo de dados financeiros em toda a organização de maneira controlada e integrar todas as informações para uma tomada estratégica eficaz de decisões.
2. **CO (Controlling)** coordena, monitora e otimiza todos os processos em uma organização. Ajuda também na análise dos números reais fazendo uma comparação com os dados planejados nas estratégias de negócio.
3. **SD (Sales and Distribution)** dá suporte às atividades de vendas e distribuição de produtos e serviços de uma empresa, desde a consulta ao pedido até finalização com a entrega.
4. **MM (Material Management)** se relaciona com o movimento de materiais da organização – incluindo atividades como logística, gerenciamento da cadeia de suprimentos, vendas e entrega, gerenciamento de depósitos, produção e planejamento.
5. **PP (Production Planning and Control)** faz o planejamento e gerenciamento da produção. Funciona em conjunto com vendas, atuando junto com operações, planejamento de recursos de distribuição, planejamento de necessidades, entre outros.
6. **QM (Quality Management)** contribui com a gestão da qualidade nos processos de uma organização. Para alcançar sua finalidade, o módulo possui integração com diversos outros processos: aquisição e vendas, produção, planejamento, inspeção, notificação, controle e outros.
7. **PM (Manutenção)** gerencia todas as atividades de manutenção em uma organização. Na prática, corresponde às atividades-chave que incluem inspeção, notificações, manutenção corretiva e preventiva, reparos e outras medidas para manter um sistema técnico ideal.

## Swagger

​	Trata-se de uma aplicação *open source* que auxilia desenvolvedores nos processos de definir, criar, documentar e consumir APIs REST. Em suma, o *Swagger* visa padronizar este tipo de integração, descrevendo os recursos que uma API deve possuir, como *endpoints*, dados recebidos, dados retornados, códigos HTTP e métodos de autenticação, entre outros.

​	Ele simplifica o processo de escrever APIs, especificando os padrões e fornecendo as ferramentas necessárias para escrever APIs seguras, com alto desempenho e escaláveis.

Escrito em YAML ou JSON.

## ElasticSearch

​	O Elasticsearch é um mecanismo de busca e análise de dados distribuído, gratuito e aberto para todos os tipos de dados, incluindo textuais, numéricos, geoespaciais, estruturados e não estruturados. Conhecido por suas REST APIs simples, natureza distribuída, velocidade e escalabilidade, o Elasticsearch é o componente central do Elastic Stack, um conjunto de ferramentas gratuitas e abertas para ingestão, enriquecimento, armazenamento, análise e visualização de dados. Comumente chamado de ELK Stack (pelas iniciais de Elasticsearch, Logstash e Kibana), o Elastic Stack agora inclui uma rica coleção de agentes lightweight conhecidos como Beats para enviar dados ao Elasticsearch.

## Active directory

O AD é implementado em protocolo LDAP (Lightweight Directory Access Protocol), que, traduzido ao pé da letra, significa: Protocolo Leve de Acesso a Diretório. Trata-se de um protocolo livre que é conhecido como o padrão do mercado para gerenciamento de informações de diretório distribuído sobre uma rede de Protocolo da Internet (IP).

Através da implementação de serviço LDAP, o Active Directory  permite o uso de um único diretório para controle de acesso a todos sistemas e serviços dentro de uma rede corporativa. Isso significa que o colaborador de uma empresa não precisa criar um usuário e senha para cada sistema que tiver acesso, e sim utilizar seu usuário e senhas únicos(as).

São alguns dos principais recursos do AD:

- Autenticação centralizada
- Nível de segurança controlado
- Facilita a Delegação de tarefas administrativas
- Torna eficiente o gerenciamento de acesso
- Proporciona um índice dos recursos na rede
- Subdivisão de domínios em unidades lógicas
- Fornece recursos de replicação de dados
- Facilita a atribuição e manutenção de múltiplos domínios
- Unificação do sistema de nomes baseado em DNS
- Facilita a implementação de políticas de utilização (Políticas de Grupos)

[^*]: Podemos defini-la então como uma linguagem que seja comum entre os envolvidos.
