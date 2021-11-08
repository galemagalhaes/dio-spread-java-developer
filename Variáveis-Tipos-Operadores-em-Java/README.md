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