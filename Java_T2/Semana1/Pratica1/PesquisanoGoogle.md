# **O que é uma classe em Java e qual é a diferença entre uma classe e um objeto? Dê 5 exemplos mostrando-os em C++ e em Java.**

Em Java, uma classe é um modelo para criar objetos. Ela define os atributos e comportamentos que todos os objetos desse tipo terão.

A diferença entre uma classe e um objeto é que a classe é um modelo, enquanto o objeto é uma instância concreta da classe. Um objeto é criado a partir de uma classe, e ele possui todos os atributos e comportamentos definidos na classe.

# Exemplo 1

***C++***

>Classe `Retangulo`:
```c++ 
class Retangulo {
public:
    double comprimento;
    double largura;
    double calcularArea() {
        return comprimento * largura;
    }
};
```
>Objeto `retangulo:` 
``` c++
Retangulo retangulo;
retangulo.comprimento = 5;
retangulo.largura = 3;
cout << retangulo.calcularArea() << endl;
``` 

***Java***
```java

public class Retangulo {
    private double comprimento;
    private double largura;

    public double calcularArea() {
        return comprimento * largura;
    }
}

Retangulo retangulo = new Retangulo();
retangulo.setComprimento(5);
retangulo.setLargura(3);
System.out.println(retangulo.calcularArea());
```

# Exemplo 2 
***C++***

>Classe `Livro`:
```c++
class Livro {
public:
    string titulo;
    string autor;
    int anoPublicacao;
     void imprimir() {
      cout << "titulo: " << titulo << endl;
      cout << "autor: " << autor << endl;
      cout << "anoPublicacao: " << anoPublicacao << endl;
    }
};
```
>Objeto `Livro:` 
``` c++
Livro livro;
livro.titulo = "Aventuras de Sherlock Holmes";
livro.autor = "Arthur Conan Doyle";
livro.anoPublicacao = 1892;
Livro.Imprimir();
``` 
***Java***
```java
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public void imprimir() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("anoPublicacao: " + anoPublicacao);
    }
}


Livro livro = new Livro();
livro.setTitulo("Aventuras de Sherlock Holmes");
livro.setAutor("Arthur Conan Doyle");
livro.setAnoPublicacao(1892);
livro.imprimir();
```

# Exemplo 3

***C++***
>Classe `Circulo`:
```c++
class Circulo {
  public:
    int raio;
    double x;
    double y;
    double calcularArea() {
      return 3.14 * raio * raio;
    }
};
```
>Objeto `Circulo:` 
``` c++
Circulo circulo;
circulo.raio = 30;
circulo.x = 0;
circulo.y = 0;
cout << circulo.calcularArea() << endl;
``` 
***Java***
```java
public class Circulo {
    private int raio;
    private double x;
    private double y;

    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}


Circulo circulo = new Circulo();
circulo.setRaio(30);
circulo.setX(0);
circulo.setY(0);
System.out.println(circulo.calcularArea());
```

# Exemplo 4 
***C++***

>Classe `Estudante`:
```c++ 
class Estudante {
public:
    string nome;
    int idade;
    double nota;
};
    void imprimir() {
      cout << "noem: " << nome << endl;
      cout << "idade: " << idade << endl;
      cout << "nota: " << nota << endl;
    }
```
>Objeto `Estudante:` 
``` c++
Estudante estudante;
estudante.nome = "João";
estudante.idade = 20;
estudante.nota = 8.5;
Estudante.Imprimir();
``` 
***Java***
```java
public class Estudante {
    private String nome;
    private int idade;
    private double nota;

    public void imprimir() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("nota: " + nota);
    }
}

Estudante estudante = new Estudante();
estudante.setNome("João");
estudante.setIdade(20);
estudante.setNota(8.5);
estudante.imprimir();
```

# Exemplo 5
***C++***

>Classe `Triangulo`:
``` c++
class Triangulo {
public:
    double base;
    double altura;
    double calcularArea() {
        return 0.5 * base * altura;
    }
};

```
>Objeto `Triangulo:` 
``` c++
Triangulo triangulo;
triangulo.base = 8;
triangulo.altura = 5;
cout << triangulo.calcularArea() << endl;
``` 
***Java***
```java

public class Triangulo {
    private double base;
    private double altura;

    public double calcularArea() {
        return 0.5 * base * altura;
    }
}

Triangulo triangulo = new Triangulo();
triangulo.setBase(8);
triangulo.setAltura(5);
System.out.println(triangulo.calcularArea());
```
<hr>

# **Como você declara uma variável em Java e quais são os tipos de dados primitivos mais comuns? Faça um paralelo entre isso e a mesma coisa na linguagem C++.**
 <br>
Para declarar uma variável em Java, usamos a seguinte sintaxe:
<br>

>**JAVA**

```java
tipo_de_dado nome_da_variavel;
```

Onde tipo_de_dado é o tipo de dado que a variável irá armazenar e nome_da_variavel é o nome da variável.

>Os tipos de dados primitivos mais comuns em Java são:

```
`int`: números inteiros
`double`: números de ponto flutuante
`char`: caracteres
`boolean`: valores lógicos
`String`: strings

```
<br>

>**Em C++**

```cpp
tipo_de_dado nome_da_variavel;

```
A diferença é que em C++ também podemos declarar variáveis com inicialização:

```cpp
tipo_de_dado nome_da_variavel = valor;
```

A seguinte declaração de variável em Java:

```java
int idade;
```
É equivalente à declaração de variável em C++:

```java
int idade;

```
A seguinte declaração de variável em Java:
```java
String nome = "João da Silva";

```
É equivalente à declaração de variável em C++:
```java
string nome = "João da Silva";

```
<hr>

# **Explique o conceito de herança em Java e como você pode criar uma subclasse a partir de uma classe existente. Faça um paralelo com C++, apresentando 5 exemplos**

<br>
A herança é um conceito de orientação a objetos que permite que uma classe herde os atributos e comportamentos de outra classe. A classe que herda é chamada de subclasse, e a classe que é herdada é chamada de superclasse.<br>
Para criar uma subclasse a partir de uma classe existente em Java:

```java
public class SubClasse extends SuperClasse {
  // atributos e comportamentos da subclasse
}

```
Por exemplo, a seguinte classe `Animal` é uma superclasse:
```java
public class Animal {
  public String nome;
  public int idade;
}

```
A classe `Cachorro` é uma subclasse de `Animal`:
```java
public class Cachorro extends Animal {
  public String raca;
  public boolean late;
}

```
A subclasse `Cachorro` herda os atributos `nome` e `idade` da superclasse `Animal`. Ela também adiciona os atributos `raca` e `late`.

O conceito de herança é semelhante em C++. Para criar uma subclasse a partir de uma classe existente em C++:
```cpp
class SubClasse : public SuperClasse {
  // atributos e comportamentos da subclasse
};

```
A classe Animal é uma superclasse:
```cpp
class Animal {
  public:
    string nome;
    int idade;
};

```
 A classe Cachorro é uma subclasse de Animal:
```cpp
class Cachorro : public Animal {
  public:
    string raca;
    bool late;
};

```
A subclasse `Cachorro` herda os atributos `nome` e `idade` da superclasse `Animal`. Ela também adiciona os atributos `raca` e `late`.

**Exemplos de herança em Java e C++:**

**Java**

**Exemplo 1**: Uma subclasse de `Pessoa` que representa um `Estudante`. A subclasse Estudante herda os atributos `nome`, `idade` e `endereco` da superclasse `Pessoa`, e adiciona o atributo `curso`.
```java
public class Estudante extends Pessoa {
  public String curso;
}

```
**Exemplo 2**: Uma subclasse de` Veiculo` que representa um `Carro`. A subclasse `Carro` herda os atributos `marca`, modelo e ano da superclasse `Veiculo`, e adiciona os atributos `cor` e `potencia`.
```java
public class Carro extends Veiculo {
  public String cor;
  public int potencia;
}

```
**Exemplo 3**: Uma subclasse de `FiguraGeometrica` que representa um `Retangulo`. A subclasse `Retangulo` herda os atributos `largura` e `altura `da superclasse `FiguraGeometrica`, e adiciona o atributo `cor`.

**C++**
**Exemplo 1**: Uma subclasse de `Person` que representa um `Student`. A subclasse `Student` herda os atributos `name`, `age` e `address` da superclasse `Person`, e adiciona o atributo `course`.
```C++
class Student : public Person {
  public:
    string course;
};

```
**Exemplo 2**: Uma subclasse de `Vehicle` que representa um `Car`. A subclasse `Car` herda os atributos `brand`,` model` e `year` da superclasse `Vehicle`, e adiciona os atributos `color` e `power`.
```cpp
class Car : public Vehicle {
  public:
    string color;
    int power;
};

```
**Exemplo 3**: Uma subclasse de GeometricFigure que representa um Rectangle. A subclasse Rectangle herda os atributos width e height da superclasse GeometricFigure, e adiciona o atributo color.
```cpp
class Rectangle : public GeometricFigure {
  public:
    string color;
};

```
> A herança é uma ferramenta poderosa que pode ser usada para reusar código e simplificar o design de sistemas de software. É um conceito importante da orientação a objetos que deve ser compreendido por qualquer desenvolvedor de software.


<hr>

# **Quando declaramos uma variável em Java, temos, na verdade, um ponteiro.**
 
Em C++ é diferente. Discorra sobre esse aspecto. 

**Ponteiros em Java e C++**

Em **Java**, quando declaramos uma variável, estamos criando uma referência para um objeto. Essa referência é um tipo de ponteiro, mas é um ponteiro especial que não pode ser manipulado diretamente. O Java gerencia a memória alocada para os objetos automaticamente, então não precisamos nos preocupar em liberar a memória quando não for mais necessária.

Em **C++**, quando declaramos uma variável, estamos criando um ponteiro para um valor. Podemos manipular esse ponteiro diretamente, alocando e liberando memória conforme necessário. Isso nos dá mais controle sobre a memória, mas também nos coloca em risco de erros de memória.

Diferenças entre ponteiros em **Java** e **C++**

A principal diferença entre ponteiros em Java e C++ é que os ponteiros em Java são referências, enquanto os ponteiros em C++ são ponteiros reais. Isso significa que, em Java, o Java gerencia a memória alocada para os objetos automaticamente, enquanto, em C++, o desenvolvedor é responsável por gerenciar a memória alocada para os objetos.

Outra diferença entre ponteiros em Java e C++ é que, em Java, não podemos acessar o endereço de memória de uma variável diretamente. Em C++, podemos acessar o endereço de memória de uma variável diretamente usando o operador` &`.
A diferença entre uma classe e um objeto é que a classe é um modelo, enquanto o objeto é uma instância concreta da classe. Um objeto é criado a partir de uma classe, e ele possui todos os atributos e comportamentos definidos na classe.

 
