> Conteúdo do curso "Variáveis, Tipos de Dados e Operadores Matemáticos em Java"

## Conceitos sobre variáveis

#### O que é uma variável?

Variável é um espaço na memória do computador reservado para armazenar valores.

#### Quais são os tipos de variáveis

1. Variável do tipo **instância**: pertence ao objeto;
2. Variável do tipo **classe**: pertence à classe;
3. Variável do tipo **local**: pertence ao método;
4. Variável do tipo **parâmetro**: pertence à assinatura do método.

#### Estrutura de uma variável

visibilidade modificador tipo nome valorInicial

- Visibilidade pode ser: public, protected, private
- Modificador pode ser: static ou final
- Tipo pode ser: int, string, float, etc, se refere ao tipo de dado que é o valor da variável 
- Nome pode ser: o que o programador escolher, seguindo boas práticas
- Valor inicial: é o valor atribuído à variável quando ela é inicializada, pode ser atribuído no momento da criação da variável ou depois.

#### Convenções para a criação de variáveis
- O nome da variável não pode começar com número;
- O nome da variável não pode conter palavras reservadas da linguagem;
- O nome da variável não pode conter espaços em branco;
- O nome da variável não deve conter caracteres especiais como "%" ou "@", por exemplo;
- É permitido, mas **deve ser evitado** usar "$" (sifrão) ou "_" (underline);
- Algumas linguagens são **case sensitive**, siginifica que letras minúsculas e maiúsculas são percebidas como diferentes. **Java** é uma dessas linguagens;
- O nome da variável deve sempre começar com letra minúscula;
- Deve ser usado o padrão camelCase (palavras compostas não tem espaço em braco entre elas, a separação é feita ao colocar letra **Maiúscula** no inicio de cada palavra que compõem o nome da variável.
- Os nomes das variáveis devem ser expressivos e objetivos para não provovar confusão para quem vai ler ou dar manutenção no código;
- Quando uma variável for constante, ou seja, seu valor não se altera durante a execução do código, ela deve ser escrita com todas as letras **MAIÚSCULAS** e se o nome for composto de mais palavras, essas devem ser separadas por "_".


## Conceitos sobre tipos

#### O que são tipos de dados?

Tipos de dados são especificações dos tamanhos e valores que podem ser armazenados em determinada variável.

#### Tipificação
- Estática: tipificação forte. A linguagem obriga a definir o tipo da variável no momento em que ela é criada e esse tipo não muda depois.
- Dinâmica: tipificação fraca. A variável assume o tipo de acordo com o valor que é armazenado nela, por inferência.

#### Tipos
- Primitivos: 

Numéricos: byte, short, int, long, float, double

Textual: char

Lógico: boolean (V ou F)

- Compostos: String, entre outros...

String não é um tipo primitivo, mas foi "primitivado" devido a necessidade constante do uso de texto no desenvolvimento de código.

#### Valores default
- byte: 0
- short: 0
- int: 0
- long: 0L
- float: 0.0F
- double: 0.0d
- char: '\u0000'
- String (e objeto): null
- boolean: false

#### Uso de aspas
- aspas simples ' ': usa-se com o tipo char
- aspas duplas " ": usa-se com o tipo String

#### Escrita de tipos numéricos
Os tipos numéricos diferem em tamanho e se tem ou não ponto flutuante. Em alguns casos é necessário colocar letras ao final do valor para determinar qual é o seu tipo
- Tipo long: preocisa de um "L" ao final do valor;
- Tipo float: precisa de um "f" ou "F" ao final do valor;
- Tipo double: pode receber um "d" ao final do valor, mas se não for colocada nenhuma letra é inferido à variável de ponto flutuante o tipo double.
 

## Conceitos sobre operadores

#### O que são operadores aritméticos?

Operadores são símbolos especiais responsáveis por realizar ações entre operandos (1, 2 ou mais) e retornar um resultado ao final da operação.

#### Tipos de operadores

- Pós-fixados: expressão++ ou espressão--

Operadores pós-fixados realizam soma ou subtração de uma unidade ao final da operação, ou seja, executam a expressão e só depois a adição ou subtração. Utilizam apenas **1 operando**.

- Prefixados: ++expressão ou --expressão

Operadores prefixados realizam a soma ou subtração de uma unidade antes de executar a expressão. Também utilizam apenas **1 operando**.

- Aritméticos: +, -, *, /, %

Operadores aritméticos realizam soma, subtração, multiplicação, divisão ou resto da divisão, entre **2 ou mais operandos**.

- Atribuição: =, +=, -=, *=, /= ou %=

Operadores de atribuição determinam ou atribuem um valor a uma variável. Essa operação pode ser com soma, com subtração, com multiplicação, com divisão ou com resto da divisão.

#### Precedência de operadores

1. Pós-fixados
- exp++
- exp--
2. Prefixados
- ++exp
- --exp
3. Multiplicativos
- multiplicação ( * )
- divisão ( / )
- módulo (resto da divisão) ( % )
4. Aditivos
- soma ( + )
- subtração ( - )
5. Atribuição
- atribuição simples ( = )
- atribuição com adição ( += )
- atribuição com subtração ( -= )
- atribuição com multiplicação ( *= )
- atribuição com divisão ( /= )
- atribuição com resto da divisão ( %= )




