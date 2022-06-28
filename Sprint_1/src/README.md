# Sprint 1

## Git - GitLab 

### Criar repositorio remoto

1. Cria repositório local

   `git init`

2. Cria um repositório no git

3. "Linka" o repositório local com o remoto

   `git remote add origin <link do repositório>`

4. Configurar email e usuário

   `git config --global user.email <seu email>`

   `git config --global user.name <seu nome>`

### Conceito de  Issues

​	Issues são tarefas que criamos para nosso projeto. Com as issues também podemos relatar bugs e sugerir melhorias nos códigos.

### Conceito de Milestones 

​	Milestones são etapas/sprints do projeto, é uma forma de organizar o projeto. Na Milestones podemos definir datas, ver o progresso da sprint em forma de gráfico, gerenciar a issues do projeto.

### Git Ignore

- caches de dependência, como o conteúdo de `/node_modules` ou `/packages`
- código compilado, como arquivos `.o`, `.pyc` e `.class`
- diretórios de saída de build, como `/bin`, `/out` ou `/target`
- arquivos gerados no período de execução, como `.log`, `.lock` ou `.tmp`
- arquivos de sistema ocultos, como `.DS_Store` ou `Thumbs.db`
- arquivos pessoais de configuração do IDE, como `.idea/workspace.xml`

```java
##############################
## Java
##############################
.mtj.tmp/
*.class
*.jar
*.war
*.ear
*.nar
hs_err_pid*
    
##############################
## IntelliJ
##############################
out/
.idea/
.idea_modules/
*.iml
*.ipr
*.iws
```

### Comandos básicos  do git

​	`git status`

​	`git add`

​	`git commit`

​	`git remote`

​	`git clone`

​	`git branch` 

​	`git checkout`

​	`git merge`

​	`git rebase`

​	`git stash`

​	`git cherry-pick`

### Resolução de conflitos em merge

### Git Stash

​	O Git Stash salva temporariamente as alterações sem fazer o commit

`````
git stash list
git stash clear
`````

### Git cherry pick 

Ele cria um novo commit que é uma cópia do commit desejado.

### Git Rebase

​	O rebase literalmente unifica os branches envolvidos, puxando os commits para frente do branch de destino. É como se ele estivesse “refazendo” a base do branch onde o comando é executado.

```git
git checkout feature # indo para o branch da feature
git rebase master    # fazendo o rebase entre o feature e o master
```

![img](https://dkrn4sk0rn31v.cloudfront.net/2019/02/20144201/exemplo-5.png)

​	O grande problema é que o rebase mexe com toda a estrutura dos branches envolvidos, reescrevendo inclusive o histórico de commits destes branches. Existe também o ponto de que, pelo fato de o rebase não gerar o merge commit, você não consegue ter a “rastreabilidade” de quando dois branches de fato foram fundidos, já que o rebase gera um branch linear no final do processo.

### Diferença entre o Merge e o Rebase

​	O git merge cria um novo commit com todas as alterações realizadas

![img](https://dkrn4sk0rn31v.cloudfront.net/2019/02/20143912/exemplo-4.png)

​	Já o git rebase refaz a base do branch onde o comando é executado

![img](https://dkrn4sk0rn31v.cloudfront.net/2019/02/20144201/exemplo-5.png)

## Java Básico

```
   -------------------------------------------------------------------------------------
   |  Classe abstrata:                                                                 |
   |     Classe que serve de molde para outras classes. É a implementação direta do    |
   |     conceito de abstração e, devido a isto, não pode ser instanciada.             |
   -------------------------------------------------------------------------------------

   -------------------------------------------------------------------------------------
   |  Acesso Private:                                                                  |
   |     Esta visibilidade define que atributos e métodos só podem ser manipulados     |
   |     apenas no local em que foi definido. Ou seja, se membros forem definidos      |
   |     com essa visiblidade, eles só poderão ser manipulados dentro da classe onde   |
   |     foram definidos.                                        		       |
   |     Para acessar métodos com essa visibilidade usamos os métodos públicos Getters |
   |     e Setters.                                                 		       |
   |  Acesso Public:                                                  		       |
   |     Todos os membros definidos com esta visibilidade são acesiveis em qualquer    |
   |     lugar, independentimente de qualquer relacionamento entre classes.            |
   -------------------------------------------------------------------------------------
   
   --------------------------------------------------------------------------------------
   |	Herança:                                                                        |
   |	  Herança é o relacionamento entre classes em que uma classe chamada de         |
   |	  subclasse (uma classe mais específica) é uma extensão, um subtipo, de outra   |
   |	  classe chamada de superclasse (uma classe mais genérica).		        |
   --------------------------------------------------------------------------------------
   ---------------------------------------------------------------------------------------
   |	Final:                                                                           |
   |	  A palavra "final" pode ser utilizada em classes, métodos e variáveis.          |
   |                                                                                     |
   |       - Nas classes a palavra final indica que ela não poderá ser estendida.        |
   |       - Nos métodos a palavra final indica que o métoddo não poderá ser sobreposto. |
   |       - Se a palavra for usada em uma variável isso indica que tal variável na      |
   |         verdade será uma constante.                                                 |
   ---------------------------------------------------------------------------------------
   --------------------------------------------------------------------------------------
   |	Construtores Getters e Setters:                                                 |
   |	  Getters e Setters são usados para proteger seus dados, especialmente na       |
   |	  criação de classes.                                                           |
   |	  Para cada instância de variável, um método getter retorna seu valor, enquanto |
   |	  um método setter define ou atualiza.                                          |
   --------------------------------------------------------------------------------------
   --------------------------------------------------------------------------------------
   |	Sobreposição:                                                                   |
   |	  A sobreposição permite reescrever um método em uma subcalsse que possua um    |
   |	  comportamento diferente do método em uma subclasse.                           |
   --------------------------------------------------------------------------------------
   ----------------------------------------------------------------------------------
   |	Protect:                                                                    |
   |	  Esta visibilidade define que atributos e métodos só podem ser manipulados |
   |	  apenas no local de sua definição e nas classes que herdam da classe onde  |
   |      foram definidos.                                                          |
   ----------------------------------------------------------------------------------
   -------------------------------------------------------------------------------------
   |	Sobrecarga:                                                                    |
   |	  A sobrecarga consiste em permitir, dentro da mesma classe, mais de um método |
   |	  com o mesmo nome. Entretanto, eles necessariamente devem possuir argumentos  |
   |      diferentes para funcionar.                                                   |
   -------------------------------------------------------------------------------------
   ------------------------------------------------------------------------------------
   |	Enum:                                                                         |
   |	  Este tipo cria um conjunto fixo, limitado e prederterminado de opções. Com  |
   |	  isso, evita-se que valores diferentes dos disponibilizados pelo Enum sejam  |
   |	  usados.								      |
   ------------------------------------------------------------------------------------
   ------------------------------------------------------------------------------------------
   |	Interface:                                                                          |
   |	  A interface define um contrato que deve ser seguido pela classe que a implementa. |
   |	  Quando uma classe implementa uma interface, ela se compromete a realizar todos os |
   |      comportamentos qua a interface disponibiliza.                                     |
   ------------------------------------------------------------------------------------------
```
