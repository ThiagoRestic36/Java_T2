# 1 O que é uma exceção em Java e qual é o propósito de usá-las em programas?

>Em Java, uma exceção é um evento que ocorre durante a execução do programa, interrompendo o fluxo normal de instruções. O objetivo fundamental das abordagens é lidar com erros e situações específicas de maneira estruturada, melhorando a robustez do código. Eles permitem que o código esteja sujeito a erros seja colocado em blocos “try”, com tratamento específico em blocos “catch”. As soluções ajudam a separar o código de tratamento de erros do código principal, facilitando a manutenção e a compreensão do programa. Além disso, suportamos uma posição que permite lidar com diferentes categorias de problemas de forma eficiente.


# 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

>São propostas que o compilador não verifica durante a compilação.
>Geralmente apresentam erros de programação, como divisão por zero ou acesso a índices inválidos.
>Não exclua declarações "throws" ou blocos "try-catch".
>Exemplo: ArithmeticExceptioné uma exceção não verificada que ocorre em operações aritméticas inválidas.

>public class ExemploUncheckedException {
 
 >   public static void main(String[] args) {
  
  >
  
  >      int resultado = 10 / 0; // Isso causará uma ArithmeticException
   
   > }

>}

# 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

>Em Java, o tratamento de exceções é realizado usando blocos try-catch


 ## Blocos try-catch:

```java
try {
    // Código que pode gerar uma exceção
} catch (ExcecaoTipo1 e1) {
    // Trata a exceção do tipo ExcecaoTipo1
} catch (ExcecaoTipo2 e2) {
    // Trata a exceção do tipo ExcecaoTipo2
} catch (Exception e) {
    // Trata todas as outras exceções
} finally {
    // Bloco opcional: código a ser executado sempre, independentemente de haver exceções ou não
}
```
## Palavras-chave:

`try:` Inicia o bloco onde exceções podem ocorrer.

`catch:` Captura e trata exceções específicas.

`finally:` Bloco opcional que contém código a ser executado sempre, independentemente de exceções.

`throw:` Lança manualmente uma exceção.

`throws:` Declara que um método pode lançar uma exceção e delega a responsabilidade de tratamento para chamadores ou blocos superiores.

## Práticas comuns:

* Trate apenas o que você pode lidar: Capture exceções específicas que você pode tratar de maneira significativa. Evite capturar exceções genéricas demais.

* Mantenha o código de tratamento de exceções breve: O código dentro dos blocos catch deve ser conciso e focado no tratamento da exceção.

* Registre informações de exceção: Use métodos como printStackTrace() para registrar informações de exceção ou registre em logs para depuração.

* Use exceções apropriadas: Utilize exceções que façam sentido para a situação. Se não houver uma exceção adequada, considere criar uma personalizada.

* Evite ignorar exceções: Evite usar blocos vazios ou ignorar completamente as exceções. Isso pode tornar a depuração difícil e esconder problemas no código.

## Exemplo de lançamento manual de exceção

```java
public void exemploMetodo() throws MinhaExcecao {
    if (algumaCondicao) {
        throw new MinhaExcecao("Mensagem descritiva");
    }
}
```

# 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

* O bloco `try-catch` em Java é uma estrutura utilizada para lidar com exceções. Nele, um bloco de código que pode gerar exceções é colocado dentro do bloco `try`, e as exceções são capturadas e tratadas em blocos catch associados. 

* O bloco `finally`, opcional, contém código que é executado independentemente de ocorrer ou não uma exceção, sendo frequentemente utilizado para liberar recursos. 

* A importância do bloco `try-catch` reside na prevenção de falhas abruptas, na manutenção do controle de fluxo do programa, no tratamento específico de exceções e na garantia da liberação adequada de recursos críticos.

* Em resumo, o bloco `try-catch` é fundamental para lidar com exceções de maneira controlada, promovendo a robustez e a manutenibilidade dos programas Java.

# 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada.

**Quando criar exceções personalizadas é apropriado:**

Quando uma situação específica requer tratamento diferenciado: Se você encontrar uma situação em que seu programa precisa lidar com um tipo específico de erro de uma maneira única, uma exceção personalizada pode ser apropriada. Para encapsular informações específicas do domínio: Se um erro está relacionado a um conceito específico do domínio do seu aplicativo, criar uma exceção personalizada com informações específicas pode ser mais expressivo do que o uso de exceções genéricas.

**Como criar exceções personalizadas em Java:**

Para criar sua própria exceção personalizada, você geralmente segue estes passos:

```java
public class MinhaExcecao extends Exception {
    // Pode adicionar construtores personalizados, métodos, etc.
}

public class MinhaExcecao extends Exception {
    public MinhaExcecao() {
        super();
    }

    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public void exemploMetodo() throws MinhaExcecao {
    if (algumaCondicao) {
        throw new MinhaExcecao("Mensagem descritiva");
    }
}
```
**Exemplo de criação de exceção personalizada:**
```java
public class LivroJaEmprestadoException extends Exception {
    public LivroJaEmprestadoException() {
        super("O livro já foi emprestado.");
    }

    // Outros construtores ou métodos personalizados, se necessário
}

public void emprestarLivro(Livro livro) throws LivroJaEmprestadoException {
    if (livro.isEmprestado()) {
        throw new LivroJaEmprestadoException();
    } else {
        // Lógica para emprestar o livro
    }
}

