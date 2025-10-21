# A Essência da POO em Java: Herança, Sobrescrita e Sobrecarga

A Programação Orientada a Objetos (POO) em Java se fundamenta em pilares que permitem a construção de código organizado, reutilizável e flexível. O uso estratégico de **Classes**, **Herança** e **Polimorfismo** (Sobrescrita e Sobrecarga) é o que torna um desenvolvedor Java completo.

## 📚 Conteúdo do Projeto

Este repositório demonstra na prática os conceitos fundamentais da POO através de exemplos com classes `Animal` e `Cachorro`.

## 🎯 1. Classes, Superclasses e Subclasses (Herança)

Uma **Classe** é o molde para criar objetos. A **Herança** permite que uma classe (Subclasse ou classe filha) absorva as características (atributos) e os comportamentos (métodos) de outra classe (Superclasse ou classe pai).

### Conceitos Principais:

- **Superclasse (Animal)**: Define a estrutura e o comportamento genérico. É a classe "pai"
- **Subclasse (Cachorro)**: Estende a Superclasse usando a palavra-chave `extends`. O Cachorro é um Animal e herda todos os seus métodos e atributos não-privados
- **A Palavra-Chave super**: Dentro do construtor da subclasse, o `super(...)` é usado para garantir que a Superclasse seja inicializada corretamente

## 🔄 2. Sobrescrita de Métodos (Override)

A **Sobrescrita** é o conceito de substituição e é fundamental para a Herança.

### Características:

- **Objetivo**: Permite que a Subclasse mude a implementação de um método herdado da Superclasse
- **Regra de Ouro**: A assinatura do método deve ser idêntica (mesmo nome, mesmo número e tipo de parâmetros)
- **Anotação @Override**: Altamente recomendada para segurança e clareza do código
- **Exemplo Prático**: O Animal tem o método `emitirSom()`, mas o Cachorro cria sua própria versão para fazer "Au Au!"

```java
@Override
public void emitirSom() {
    System.out.println("Au Au!");
}
```

## ⚡ 3. Sobrecarga de Métodos (Overload)

A **Sobrecarga** é o conceito de adição de novas formas de ação e faz parte do Polimorfismo.

### Características:

- **Objetivo**: Permite múltiplos métodos com o mesmo nome, aumentando a flexibilidade
- **Regra de Ouro**: A assinatura deve ser diferente na lista de parâmetros (tipo, número ou ordem)
- **Anotação**: Não existe `@Overload`. O compilador reconhece automaticamente
- **Exemplo Prático**: A classe Cachorro pode ter três métodos `comer`:

```java
// Versão padrão
public void comer() { ... }

// Com parâmetro booleano
public void comer(boolean incluirComidaAnimalGenerica) { ... }

// Com parâmetro inteiro
public void comer(int quantidade) { ... }
```

## 📊 Resumo Comparativo

| Conceito | Mecanismo | Onde Ocorre | Pergunta Chave |
|----------|-----------|-------------|----------------|
| **Sobrescrita** | Assinatura Idêntica | Entre Superclasse e Subclasse | "Como o filho faz a mesma coisa que o pai?" |
| **Sobrecarga** | Assinatura Diferente (Parâmetros) | Na Mesma Classe (ou hierarquia) | "Quais são as diferentes formas de fazer essa ação?" |

## 🔍 O Segredo é a Pergunta: Onde Está Acontecendo?

| Aspecto | Sobrescrita (Override) | Sobrecarga (Overload) |
|---------|----------------------|---------------------|
| **Tradução** | Substituir a versão do pai | Adicionar mais uma forma de fazer |
| **Onde Ocorre?** | Entre classes (Superclasse e Subclasse) | Na mesma classe (ou hierarquia) |
| **Assinatura?** | Deve ser IDÊNTICA | DEVE ser DIFERENTE nos parâmetros |
| **Anotação?** | Sim, usamos `@Override` | Não é usada anotação |
| **Exemplo com Cachorro** | Cachorro muda o método `comer()` herdado do Animal | Cachorro tem três formas de comer: `comer()`, `comer(boolean)`, `comer(int)` |

## 🚀 Como Executar

1. Clone este repositório
2. Compile os arquivos Java
3. Execute a classe `TestAnimal2` para ver os conceitos em ação

```bash
javac *.java
java TestAnimal2
```

## 📁 Estrutura do Projeto

```
├── Deitel/                 # Projeto inicial
│   └── src/main/java/
│       ├── Animal.java
│       ├── Cachorro.java
│       └── TestAnimal.java
└── teste9/                 # Projeto completo
    └── src/
        ├── Animal.java
        ├── Cachorro.java
        ├── TestAnimal2.java
        └── Main.java
```

## 🎓 Aprendizados

Com essa compreensão, você domina a base do **Polimorfismo** em Java. Agora pode criar sistemas onde diferentes tipos de objetos se comportam de maneira única (Sobrescrita) e podem ser chamados com diferentes opções (Sobrecarga).

---


